/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modbikes.model.operation;

/**
 *
 * @author Admin
 */
import com.mycompany.modbikes.model.example.*;
import com.mycompany.modbikes.model.example.ConnectDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueryDB {

    public static void main(String args[]) {
        SelectStarFromLocation();
    }

    public static void SelectStarFromStudent() {

//             url = jdbc:postgresql://<host>:<port>/<dbname>?user=<username>&password=<password>
        String url = "jdbc:postgresql://ec2-3-234-85-177.compute-1.amazonaws.com:5432/der31l0fqg9f6b?user=nkqwwjhlpbldun&password=fd0a974ab729bef38965fe05a1dd9132d0b07dba3e34d598a540120c2cd84231";
        String user = "nkqwwjhlpbldun";
        String password = "fd0a974ab729bef38965fe05a1dd9132d0b07dba3e34d598a540120c2cd84231";

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection(url,
                            user, password);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student;");
            while (rs.next()) {
                long StudentID = rs.getLong("StudentID");
                String FirstName = rs.getString("FirstName");
                String LastName = rs.getString("LastName");
                String Faculty = rs.getString("Faculty");
                String Department = rs.getString("Department");
                String Password = rs.getString("Password");
                boolean IsUseBike = rs.getBoolean("IsUseBike");
                String TelephoneNo = rs.getString("TelephoneNo");
                String Email = rs.getString("Email");
                String OtherContact = rs.getString("OtherContact");

                System.out.println("StudentID = " + StudentID);
                System.out.println("FirstName = " + FirstName);
                System.out.println("LastName = " + LastName);
                System.out.println("Faculty = " + Faculty);
                System.out.println("Department = " + Department);
                System.out.println("Password = " + Password);
                System.out.println("IsUseBike = " + IsUseBike);
                System.out.println("TelephoneNo = " + TelephoneNo);
                System.out.println("Email = " + Email);
                System.out.println("OtherContact = " + OtherContact);
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");

        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Close database successfully");

    }

    public static void SelectStarFromLocation() {

//             url = jdbc:postgresql://<host>:<port>/<dbname>?user=<username>&password=<password>
        String url = "jdbc:postgresql://ec2-3-234-85-177.compute-1.amazonaws.com:5432/der31l0fqg9f6b?user=nkqwwjhlpbldun&password=fd0a974ab729bef38965fe05a1dd9132d0b07dba3e34d598a540120c2cd84231";
        String user = "nkqwwjhlpbldun";
        String password = "fd0a974ab729bef38965fe05a1dd9132d0b07dba3e34d598a540120c2cd84231";

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection(url,
                            user, password);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Location;");
            while (rs.next()) {
                int LocationID = rs.getInt("LocationID");
                String LocationName = rs.getString("LocationName");
                String LocationPicLink = rs.getString("LocationPicLink");
                float Latitude = rs.getFloat("Latitude");
                float Londtitude = rs.getFloat("Londtitude");
                
                System.out.println("LocationID = " + LocationID);
                System.out.println("LocationName = " + LocationName);
                System.out.println("LocationPicLink = " + LocationPicLink);
                System.out.println("Latitude = " + Latitude);
                System.out.println("Londtitude = " + Londtitude);
           
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");

        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Close database successfully");

    }

    public static void SelectStarFromHistory() {

//             url = jdbc:postgresql://<host>:<port>/<dbname>?user=<username>&password=<password>
        String url = "jdbc:postgresql://ec2-3-234-85-177.compute-1.amazonaws.com:5432/der31l0fqg9f6b?user=nkqwwjhlpbldun&password=fd0a974ab729bef38965fe05a1dd9132d0b07dba3e34d598a540120c2cd84231";
        String user = "nkqwwjhlpbldun";
        String password = "fd0a974ab729bef38965fe05a1dd9132d0b07dba3e34d598a540120c2cd84231";

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection(url,
                            user, password);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student;");
            while (rs.next()) {
                long StudentID = rs.getLong("StudentID");
                String FirstName = rs.getString("FirstName");
                String LastName = rs.getString("LastName");
                String Faculty = rs.getString("Faculty");
                String Department = rs.getString("Department");
                String Password = rs.getString("Password");
                boolean IsUseBike = rs.getBoolean("IsUseBike");
                String TelephoneNo = rs.getString("TelephoneNo");
                String Email = rs.getString("Email");
                String OtherContact = rs.getString("OtherContact");

                System.out.println("StudentID = " + StudentID);
                System.out.println("FirstName = " + FirstName);
                System.out.println("LastName = " + LastName);
                System.out.println("Faculty = " + Faculty);
                System.out.println("Department = " + Department);
                System.out.println("Password = " + Password);
                System.out.println("IsUseBike = " + IsUseBike);
                System.out.println("TelephoneNo = " + TelephoneNo);
                System.out.println("Email = " + Email);
                System.out.println("OtherContact = " + OtherContact);
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");

        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Close database successfully");

    }

    public static void SelectStarFromBicycle() {

//             url = jdbc:postgresql://<host>:<port>/<dbname>?user=<username>&password=<password>
        String url = "jdbc:postgresql://ec2-3-234-85-177.compute-1.amazonaws.com:5432/der31l0fqg9f6b?user=nkqwwjhlpbldun&password=fd0a974ab729bef38965fe05a1dd9132d0b07dba3e34d598a540120c2cd84231";
        String user = "nkqwwjhlpbldun";
        String password = "fd0a974ab729bef38965fe05a1dd9132d0b07dba3e34d598a540120c2cd84231";

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection(url,
                            user, password);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student;");
            while (rs.next()) {
                long StudentID = rs.getLong("StudentID");
                String FirstName = rs.getString("FirstName");
                String LastName = rs.getString("LastName");
                String Faculty = rs.getString("Faculty");
                String Department = rs.getString("Department");
                String Password = rs.getString("Password");
                boolean IsUseBike = rs.getBoolean("IsUseBike");
                String TelephoneNo = rs.getString("TelephoneNo");
                String Email = rs.getString("Email");
                String OtherContact = rs.getString("OtherContact");

                System.out.println("StudentID = " + StudentID);
                System.out.println("FirstName = " + FirstName);
                System.out.println("LastName = " + LastName);
                System.out.println("Faculty = " + Faculty);
                System.out.println("Department = " + Department);
                System.out.println("Password = " + Password);
                System.out.println("IsUseBike = " + IsUseBike);
                System.out.println("TelephoneNo = " + TelephoneNo);
                System.out.println("Email = " + Email);
                System.out.println("OtherContact = " + OtherContact);
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");

        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Close database successfully");

    }

}
