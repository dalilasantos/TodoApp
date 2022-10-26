/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Dalila
 */
public class ConnectionFactory {
//Sempre que a nossa aplicação for se conectar ao BC ela precisa de um DRIVER, ou seja, alguém que faça a ponte.
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoApp"; // O caminho de conexão com nosso BC.
    public static final String USER = "root";      
    public static final String PASS = ""; 
    
//Em seguida implementar o conjunto de dependencias no Build Scripts - gradle;
      
public static Connection getConnection(){
    try {
       Class.forName(DRIVER); //Carrega o Drive
       return DriverManager.getConnection(URL, USER, PASS); // Faz conexão com esses atributos 
    } catch (Exception ex){
       throw new RuntimeException("Erro na conexão com o Banco de Dados", ex);
    }
} 
public static void closeConnection (Connection connection){
    try {
      if (connection != null); {
          connection.close(); 
    }
    } catch (Exception ex) {
        throw new RuntimeException("Erro ao fechar a conexão com o Banco de Dados", ex);
    }
}
public static void closeConnection (Connection connection, PreparedStatement statement){
    try {
        if (connection != null); {
            connection.close(); 
    }
        if(statement != null){
           statement.close();
    }  
    } catch (Exception ex) {
        throw new RuntimeException("Erro ao fechar a conexão com o Banco de Dados", ex);
    }
}
public static void closeConnection (Connection connection, 
        PreparedStatement statement, ResultSet resultSet){
    try {
        if (connection != null); {
            connection.close(); 
    }
        if(statement != null){
           statement.close();
    }
        if(resultSet != null){
           resultSet.close();
    }
    } catch (Exception ex) {
        throw new RuntimeException("Erro ao fechar a conexão com o Banco de Dados", ex);
    }
 }
}
