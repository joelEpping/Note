package datos;

import modelo.Cliente;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe de acesso a dados do cliente
 *
 * @author Juliano
 */
public class ClienteDAO implements IDAO<Cliente> {

    @Override
    public void insertar(Cliente cliente) throws Exception {
        JOptionPane.showMessageDialog(null, cliente.getCi());
        Conexion c = new Conexion();
        String sql = "INSERT INTO TBCLIENTE (NOMBRE, CI, NACIMIENTO,CORREO,TELEFONO) VALUES (?, ?, ?,?,?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, cliente.getNombre());
        ps.setString(2, cliente.getCi());
        ps.setDate(3, new Date(cliente.getNacimiento().getTime()));
        ps.setString(4,cliente.getCorreo());
        ps.setString(5,cliente.getTelefono());
        ps.execute();
        c.confirmar();
    }

    @Override
    public void Modificar(Cliente cliente) throws Exception {
        Conexion c = new Conexion();
        String sql = "UPDATE TBCLIENTE SET NOMBRE=?, CI=?, NACIMIENTO=?,CORREO=?,TELEFONO=? WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, cliente.getNombre());
        ps.setString(2, cliente.getCi());
        ps.setDate(3, new Date(cliente.getNacimiento().getTime()));
        ps.setString(4, cliente.getCorreo());
        ps.setString(5,cliente.getTelefono());
          ps.setInt(6, cliente.getCodigo());
        ps.execute();
        c.confirmar();
    }

    @Override
    public void eliminar(Cliente cliente) throws Exception {
        Conexion c = new Conexion();
        String sql = "DELETE FROM TBCLIENTE WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, cliente.getCodigo());
        ps.execute();
        c.confirmar();
    }

    @Override
    public ArrayList<Cliente> listarTodos() throws Exception {
        Conexion c = new Conexion();
        String sql = "SELECT * FROM TBCLIENTE ORDER BY NOMBRE";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList listaClientes = new ArrayList();
        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setCodigo(rs.getInt("CODIGO"));
            cliente.setNombre(rs.getString("NOMBRE"));
            cliente.setCi(rs.getString("CI"));
            cliente.setNacimiento(rs.getDate("NACIMIENTO"));
            cliente.setCorreo(rs.getString("CORREO"));
            cliente.setTelefono(rs.getString("TELEFONO"));
            listaClientes.add(cliente);
        }

        return listaClientes;
    }

    @Override
    public Cliente recuperar(int codigo) throws Exception {
        Conexion c = new Conexion();
        String sql = "SELECT * FROM TBCLIENTE WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();

        Cliente cliente = new Cliente();
        if (rs.next()) {
            cliente.setCodigo(rs.getInt("CODIGO"));
            cliente.setNombre(rs.getString("NOMBRE"));
            cliente.setCi(rs.getString("CI"));
            cliente.setNacimiento(rs.getDate("NACIMIENTO"));
            cliente.setTelefono(rs.getString("TELEFONO"));
            cliente.setCorreo(rs.getString("CORREO"));
        }

        return cliente;
    }
}
