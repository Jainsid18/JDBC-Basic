package org.siddhant;

import java.sql.Connection;
import java.sql.Statement;

public class InsertStudent {

    public static void main(String args[]){

        try{
            Connection con = DBConnection.getConnection();

            Statement stml= con.createStatement();

            String sql= "INSERT INTO student21 values (1, 'rahul',21)";

            stml.executeUpdate(sql);

            System.out.println("Student inserted Successfully");

            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
