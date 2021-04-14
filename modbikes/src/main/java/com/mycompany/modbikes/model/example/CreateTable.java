/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modbikes.model.example;

import com.mycompany.modbikes.model.example.ConnectDB;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class CreateTable {

    public static void main(String args[]) {

        //     url = jdbc:postgresql://<host>:<port>/<dbname>?user=<username>&password=<password>
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
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE COMPANY "
                    + "(ID INT PRIMARY KEY     NOT NULL,"
                    + " NAME           TEXT    NOT NULL, "
                    + " AGE            INT     NOT NULL, "
                    + " ADDRESS        CHAR(50), "
                    + " SALARY         REAL)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");

        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Close database successfully");

    }
}
