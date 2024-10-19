package com.klef.jdbcps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {
    	String url="jdbc:mysql://localhost:3306/kluniversity";
    	String username="root";
    	String password="Kishore2005+";
    	Connection con=DriverManager.getConnection(url, username, password);
    	String query="insert into student values(?,?)";
    	PreparedStatement ps=con.prepareStatement(query);
    	ps.setInt(1,5);
    	ps.setString(2,"viswa");
    	ps.execute();
    	System.out.println("record inserted");
    	
    	
    }
}
