/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.DBWrapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author suresh
 */
public class DBConnection {
    private Connection con;
    private PreparedStatement ps;
    public void openConn() throws SQLException,ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/enquiry_management","root","");
        
    }
    public PreparedStatement initStatement(String sqlQuery) throws SQLException,ClassNotFoundException
    {
        return ps=con.prepareStatement(sqlQuery);
        
    }
    public void closeConn() throws SQLException,ClassNotFoundException
    {
        con.close();
    }
    
}
