/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdate.DAO;

import com.bigdata.DBWrapper.DBConnection;
import com.bigdata.entity.Course;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author suresh
 */
public class CourseDAO {
    public List<Course> crsList=new ArrayList();
    public Integer insert(Course c)
    {
       return c.getCourseId();
    }
    public List<Course> getAllCourse() throws SQLException,ClassNotFoundException
    { 
        String sqlQuery="select * from tbl_courses";
        DBConnection db=new DBConnection();
        db.openConn();
        PreparedStatement ps=db.initStatement(sqlQuery);
        ResultSet rs=ps.executeQuery();
        
        while(rs.next())
        {
            crsList.add(new Course(rs.getInt("course_id"),rs.getString("title"),rs.getDouble("price"),rs.getInt("duration"),rs.getString("duration_type")));
            
        }
        
       db.closeConn();
       return crsList;
        
    }
    public Course getCourseById(Integer courseId) throws SQLException,ClassNotFoundException 
    {
        for(Course c:getAllCourse())
        {
            if(courseId==c.getCourseId())
            {
                return c;
        }
           
            
        }
        return null;
    }
    }