package org.riwi.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {

    static Connection connection = null;
    public static Connection openConnection(){
        String url = "jdbc:mysql://127.0.0.1:3306/simulacro";
        String user = "root";
        String password = "";

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("conexion succesful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;

    }

    public static void closeConnection(){
        if(connection != null){
            try {
                connection.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println("connection closed");


        }
    }
}
