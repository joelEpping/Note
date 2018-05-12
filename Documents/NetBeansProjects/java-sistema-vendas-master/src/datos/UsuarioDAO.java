package datos;

import vista.LogueoUsuario;
import vista.Menu;
import modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe de acesso a dados do fornecedor
 *
 * @author Juliano
 */
public class UsuarioDAO implements IDAO<Usuario> {

    @Override
    public void insertar(Usuario usuario) throws Exception {
        Conexion c = new Conexion();
        String sql = "INSERT INTO TBUSUARIO (NOMBRE, CI,PASSWORD,NIVEL_ACCESO,USERNAME) VALUES (?, ?,?,?,?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, usuario.getNombre());
        ps.setInt(2,usuario.getCi());
        ps.setString(3,usuario.getPassword());
        ps.setInt(4,usuario.getNivel_acceso());
        ps.setString(5,usuario.getUsername());
        ps.execute();
        c.confirmar();
    }

    @Override
    public void Modificar(Usuario usuario) throws Exception {
        Conexion c = new Conexion();
        String sql = "UPDATE TBUSUARIO SET NOMBRE=?, CI=?, PASSWORD=?, NIVEL_ACCESO=?,USERNAME=? WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, usuario.getNombre());
        ps.setInt(2, usuario.getCi());
        ps.setString(3, usuario.getPassword());
        ps.setInt(4, usuario.getNivel_acceso());
        ps.setString(5,usuario.getUsername());
        ps.setInt(6, usuario.getCodigo());
        ps.execute();
        c.confirmar();
    }

    @Override
    public void eliminar(Usuario usuario) throws Exception {
        Conexion c = new Conexion();
        String sql = "DELETE FROM TBUSUARIO WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, usuario.getCodigo());
        ps.execute();
        c.confirmar();
    }

    @Override
    public ArrayList<Usuario> listarTodos() throws Exception {
        Conexion c = new Conexion();
        String sql = "SELECT * FROM TBUSUARIO ORDER BY NOMBRE";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList listaUsuario = new ArrayList();
        while (rs.next()) {
            Usuario usuario = new Usuario();
            usuario.setCodigo(rs.getInt("CODIGO"));
            usuario.setNombre(rs.getString("NOMBRE"));
            usuario.setCi(rs.getInt("CI"));
            usuario.setUsername(rs.getString("USERNAME"));
            usuario.setNivel_acceso(rs.getInt("NIVEL_ACCESO"));
            usuario.setPassword(rs.getString("password"));
            listaUsuario.add(usuario);
        }

        return listaUsuario;
    }

    @Override
    public Usuario recuperar(int codigo) throws Exception {
        Conexion c = new Conexion();
        String sql = "SELECT * FROM TBUSUARIO WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();

        Usuario usuario = new Usuario();
        if (rs.next()) {
            usuario.setCodigo(rs.getInt("CODIGO"));
            usuario.setCi(rs.getInt("CI"));
            usuario.setNombre(rs.getString("NOMBRE"));
            usuario.setNivel_acceso(rs.getInt("NIVEL_ACCESO"));
            usuario.setUsername(rs.getString("username"));
            
        }

        return usuario;
    }
    
    public Usuario logueo(String username, String password) throws Exception{
        Conexion c = new Conexion();
        String sql = "SELECT * FROM TBUSUARIO WHERE USERNAME=? AND PASSWORD=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, username);
         ps.setString(2, password);
        ResultSet rs = ps.executeQuery();

        Usuario usuario = new Usuario();
        if (rs.next()) {
            usuario.setCodigo(rs.getInt("CODIGO"));
            usuario.setCi(rs.getInt("CI"));
            usuario.setNombre(rs.getString("NOMBRE"));
            usuario.setNivel_acceso(rs.getInt("NIVEL_ACCESO"));
            usuario.setUsername(rs.getString("username"));  
        }else{
            JOptionPane.showMessageDialog(null, "No se ha encontrado el usuario");
            return null;
        }
         return usuario;
    }

 
}
