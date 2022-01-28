package test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class testConnectionDB {
    public static void main(String[] args) throws Exception {

        Properties props = new Properties();

        // Utilisation de try with ressources
        try (FileInputStream fis = new FileInputStream("fileConnection.properties")) {
            props.load(fis);
        }

        Class.forName(props.getProperty("jdbc.driver.class"));
        String url = props.getProperty("jdbc.url");
        String login = props.getProperty("jdbc.login");
        String password = props.getProperty("jdbc.password");

        try {
            Connection connection = DriverManager.getConnection(url, login, password);
            System.out.println("Connection réussi..");
            System.out.println("La base de données est accéssible");

            // Une petite exemlpe, decommenter le code suivant pour tester

            /*String strSql = "SELECT * FROM usersJ";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(strSql)) {
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String username = resultSet.getString("username");
                    String lastname = resultSet.getString(3);
                    String userPassword = resultSet.getString("password");
                    String phone = resultSet.getString(5);
                    String email = resultSet.getString(6);
                    String location = resultSet.getString(7);

                    System.out.printf(" %d: %-10s | %-10s | {%-10s} | %-10s | %-30s | %-10s | "
                            + "\n", id, username, lastname, userPassword, phone, email, location);
                }
            }
            */
        }catch (SQLException sqlE) {
            System.err.println("La Connection a Échoué !!!!");
            System.out.println(sqlE.toString());
        }

        System.out.println("\n\n!!! -Fin du test.");
    }
}
