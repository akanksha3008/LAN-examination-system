package com.vit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {
    Connection con;
    ResultSet rs;
    
    /* Create instance of database and connect with it. */
    Database() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded successfully.....");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VitDb?autoReconnect=true&useSSL=false", "root", "aka.3008");
        //con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","DATABASE","PASSWORD");
        System.out.println("Connection Establish.......");

    }
    /* Fetch all questions and answers from the database. */
    public ArrayList<Question> fetch() throws SQLException {
        Statement stmt = con.createStatement();
        rs = stmt.executeQuery("select * from Question");
        ArrayList<Question> qset = new ArrayList<>();
        while (rs.next()) {
            //System.out.println(rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(5)+rs.getString(6)+rs.getString(7));
            Question q = new Question(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
            qset.add(q);
        }

        return qset;
    }
    
    /* Validates user */
    public int isvaliduser(String username, String password) throws SQLException {
        //System.out.println(username+"  "+password);
        Statement stmt = con.createStatement();

        rs = stmt.executeQuery("select * from Student");

        while (rs.next()) {
            //  System.out.println(rs.getString(2)+rs.getString(3));
            if (username.equals(rs.getString(2)) && password.equals(rs.getString(3))) {
                return rs.getInt(1);
            }
        }
        return 0;
    }
    
    /* Update the marks of students in database. */
    public void setMarks(int marks, int ID) throws SQLException {
        //   Statement stmt = con.createStatement();
        String sql = "UPDATE STUDENT SET MARKS=? WHERE ID=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, marks);
        pstmt.setInt(2, ID);
        pstmt.executeUpdate();
    }

}
