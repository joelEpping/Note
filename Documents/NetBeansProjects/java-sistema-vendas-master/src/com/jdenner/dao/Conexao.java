package com.jdenner.dao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Classe responsável por abrir a conexão com o banco de dados
 *
 * @author Juliano
 */
public class Conexao {
   
    public String db = "sistema_pedido2";
    
    // postgreSql
    public String url = "jdbc:postgresql://localhost:5432/"+db; 
    public String user = "postgres";
    public String pass = "contrasena1";
    public String driver = "org.postgresql.Driver";    
    
    Connection conexao = null;
    
    public Connection getConexao(){
        
        try {
            // postgreSql            
            Class.forName(driver);
            conexao = (Connection) DriverManager.getConnection(this.url
                    , this.user, this.pass);
            conexao.setAutoCommit(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conexao;
    }
    
    public void confirmar() throws SQLException {
        try {
            conexao.commit();
        } catch (SQLException e) {
            throw new SQLException("Problemas na instrução SQL.\n" + e.getMessage());
        } finally {
            conexao.close();
        }
    }
   

    
}
