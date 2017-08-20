/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdate.DAO;

import com.bigdata.DBWrapper.DBConnection;
import com.bigdata.entity.Course;
import com.bigdata.entity.Enquiry;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author suresh
 */
public class EnquiryDao {

    public List<Enquiry> enqList = new ArrayList();

    public Integer insert(Enquiry e) throws SQLException,ClassNotFoundException {
        
        String sqlQuery = "INSERT into  tbl_enquries"
                + "(full_name,email,phone,course_id,enquiry_type)"
                + "VALUES(?,?,?,?,?)";
        
        DBConnection db = new DBConnection();
        db.openConn();
        PreparedStatement ps = db.initStatement(sqlQuery);
        ps.setString(1,e.getFullName() );
        ps.setString(2,e.getEmail());
        ps.setLong(3, e.getPhone());
        ps.setInt(4,e.getCourse().getCourseId());
        ps.setString(5,e.getEnquiryType());
        
        ps.execute();
        return 1;
    }

    public List<Enquiry> getAllEnquiry() throws SQLException, ClassNotFoundException {
        String sqlQuery = "select * from  tbl_enquries";
        DBConnection db = new DBConnection();
        db.openConn();
        PreparedStatement ps = db.initStatement(sqlQuery);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Enquiry e = new Enquiry();
          
            
            CourseDAO cd=new CourseDAO();
            Course c=cd.getCourseById(rs.getInt("course_id"));
            e.setFullName(rs.getString("full_name"));
            e.setEmail(rs.getString("email"));
            e.setPhone(rs.getLong("phone"));
            e.setCourse(c);
            e.setEnquiryType(rs.getString("enquiry_type"));
            e.setAddedDate(rs.getDate("added_date"));
            e.setModifiedDate(rs.getDate("modified_date"));
            e.setIsRead(rs.getBoolean("is_read"));
            enqList.add(e);
        }

        db.closeConn();
        return enqList;

    }

}
