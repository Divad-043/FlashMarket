package com.example.flashmarket.dbConnection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    public static boolean succsess = true;

    public static Connection connecter(){
        // Importation de fichier des proprietés
        Properties props = new Properties();

        try (FileInputStream fis = new FileInputStream("fileConnection.properties")) {
            props.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            Class.forName(props.getProperty("jdbc.driver.class"));
            String url = props.getProperty("jdbc.url");
            String login = props.getProperty("jdbc.login");
            String password = props.getProperty("jdbc.password");

            Connection connection = DriverManager.getConnection(url, login, password);
            return connection;
        }catch (ClassNotFoundException | SQLException sqlEx){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, sqlEx);
            succsess = false;
        }
        return null;
    }

}
