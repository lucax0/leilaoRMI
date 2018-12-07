/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Victor
 */
public class Banco {
    //variaveis internas
    private static String usuario = "root";
    private static String senha = "";
    private static String servidor = "localhost";
    private static String bd = "locadora";
    private static int porta = 3306;
    
    //variaveis de banco
    private static Connection conexao;
    
    public static void conectar() 
            throws ClassNotFoundException, 
                   SQLException {
        String url="jdbc:mysql://" + servidor +
                   ":" + porta +
                   "/" + bd;
     
        //carregar o driver
        Class.forName("com.mysql.jdbc.Driver");
        
        //Conectar ao banco
        conexao = DriverManager.getConnection(url, usuario, senha);
    }
    
    //Devolve a conexão criada para o usuario
    public static Connection getConexao() {
        return conexao;
    }
    
    public static void desconectar() 
            throws SQLException {
        conexao.close();
    }
}
