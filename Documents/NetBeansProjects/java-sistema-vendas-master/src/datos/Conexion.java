package datos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Classe responsável por abrir a conexão com o banco de dados
 *
 * @author Juliano
 */
public class Conexion {
   
    public String db = "sistema_pedido2";
    
    // postgreSql
    public String url = "jdbc:postgresql://localhost:5432/"+db; 
    public String user = "postgres";
    public String pass = "contrasena1";
    public String driver = "org.postgresql.Driver";    
    
    Connection conexion = null;
    
    public Connection getConexao(){
        
        try {
            // postgreSql            
            Class.forName(driver);
            conexion = (Connection) DriverManager.getConnection(this.url
                    , this.user, this.pass);
            conexion.setAutoCommit(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conexion;
    }
    
    public void confirmar() throws SQLException {
        try {
            conexion.commit();
        } catch (SQLException e) {
            throw new SQLException("Problemas en la instruccion SQL.\n" + e.getMessage());
        } finally {
            conexion.close();
        }
    }
   

    
}
