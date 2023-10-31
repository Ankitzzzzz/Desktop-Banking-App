package bank.management.system;

import java.sql.*;

public class conn {

    Connection c;
    Statement s;

    public conn() {
        try {
            // Load the MySQL JDBC driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Correctly format the database URL
            String url = "jdbc:mysql://localhost/bankmanagementsystem";

            // Provide database credentials
            String username = "root";
            String password = "Stinct";

            // Establish the connection
            c = DriverManager.getConnection(url, username, password);

            // Create a statement object
            s = c.createStatement();

        } catch (ClassNotFoundException e) {
            // Handle the case where the JDBC driver class is not found
            System.out.println("JDBC driver not found: " + e);
        } catch (SQLException e) {
            // Handle any SQL-related exceptions
            System.out.println("SQL Exception: " + e);
        }
    }

    // Rest of the code (methods) if any
}
