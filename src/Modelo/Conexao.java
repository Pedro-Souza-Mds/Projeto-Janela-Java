// Autor: Pedro Souza    https://github.com/Pedro-Souza-Mds 

package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConexao() {
        Connection con = null;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("Problemas ao carregar o driver: " + e.getMessage());
        }
        String url = "jdbc:ucanaccess://C:/Users/p3dr0/OneDrive/Área de Trabalho/Projeto Tarefa/Database2.accdb";
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println("Problemas ao abrir a conexao com o BD: " + e.getMessage());
        }
        return con;
    }

}
