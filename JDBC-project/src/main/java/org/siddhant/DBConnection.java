package org.siddhant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection(){

        Connection con = null;

        try{
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_database",
                    "root",
                    "Siddhant@1811"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
