package org.siddhant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchStudent {

    public static void main(String args[]) {
        try {

            Connection con = DBConnection.getConnection();

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("Select * from student21");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("age")
                );
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
