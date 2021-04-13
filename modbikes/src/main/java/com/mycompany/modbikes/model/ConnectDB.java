/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modbikes.model;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author postgresqltutorial.com
 */
public class ConnectDB {

//    private final String url = "jdbc:postgresql://ec2-3-234-85-177.compute-1.amazonaws.com";
//    private final String url = "postgresql://nkqwwjhlpbldun:fd0a974ab729bef38965fe05a1dd9132d0b07dba3e34d598a540120c2cd84231@ec2-3-234-85-177.compute-1.amazonaws.com:5432/der31l0fqg9f6b";
    
    
//    private final String url = "jdbc:postgresql://nkqwwjhlpbldun:fd0a974ab729bef38965fe05a1dd9132d0b07dba3e34d598a540120c2cd84231@ec2-3-234-85-177.compute-1.amazonaws.com:5432/der31l0fqg9f6b";
    
    
//    jdbc:postgresql://<host>:<port>/<dbname>?user=<username>&password=<password>
    
    private final String url = "jdbc:postgresql://ec2-3-234-85-177.compute-1.amazonaws.com:5432/der31l0fqg9f6b?user=nkqwwjhlpbldun&password=fd0a974ab729bef38965fe05a1dd9132d0b07dba3e34d598a540120c2cd84231";
    private final String user = "nkqwwjhlpbldun";
    private final String password = "fd0a974ab729bef38965fe05a1dd9132d0b07dba3e34d598a540120c2cd84231";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return conn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectDB app = new ConnectDB();
        app.connect();
    }
}
