package org.siddhant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertStudentPS {

    public static void main(String args[]){
        try{
            Connection con= DBConnection.getConnection();

            String sql= "Insert into student21 values(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            ps.setInt(1,id);
            ps.setString(2, name);
            ps.setInt(3, age);

            ps.executeUpdate();

            System.out.println("Student inserted successfully using PreparedStatement");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
