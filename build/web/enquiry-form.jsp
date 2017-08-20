<%-- 
    Document   : enquiry-form
    Created on : May 16, 2017, 2:33:06 PM
    Author     : suresh
--%>

<%@page import="com.bigdate.DAO.EnquiryDao"%>
<%@page import="com.bigdata.entity.Enquiry"%>
<%@page import="com.bigdata.entity.Course"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.bigdate.DAO.CourseDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    
if(request.getMethod().equalsIgnoreCase("POST"))
{
    //====data gathering logic ================
    
    String fullName=request.getParameter("full-name");
    String email=request.getParameter("email");
    Long phone=Long.parseLong(request.getParameter("phone"));
    Integer courseId=Integer.parseInt(request.getParameter("course"));
    String enquiryType=request.getParameter("enquiry-type");
    
    //=====converting raw data into object =================
    
    Enquiry e=new Enquiry();
    Course c=new Course();
    c.setCourseId(courseId);
    e.setFullName(fullName);
    e.setCourse(c);
    e.setEmail(email);
    e.setPhone(phone);
    e.setEnquiryType(enquiryType);
    
    //======inserting the records into data ====
    EnquiryDao ed=new EnquiryDao();
    ed.insert(e);
    
    
    
    
    
}


 %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </head>
    <%
        CourseDAO cd = new CourseDAO();


    %>

    <body>
        <h1>enquiry form</h1>

        <div class="enquiry-form container-fluid">

            <form name="enquiry-form" method="POST">
                <div >
                    <label>
                        Full Name:
                    </label>
                    <input type="text" class="form-control" name="full-name" value="" />
                </div>
                <div >
                    <label>
                        Email:
                    </label>
                    <input type="text" class="form-control" name="email" value="" />
                </div>
                <div >
                    <label>
                        Phone:
                    </label>
                    <input type="number" class="form-control" name="phone" value="" />
                </div>
                <div >
                    <label>
                        Course:
                    </label>
                    <select class="form-control" name="course">
                        <c:forEach items="<%=cd.getAllCourse()%>" var="list">
                            <option value="${list.getCourseId()}">${list.getTitle()}</option>
                        </c:forEach>
                    </select>


                </div>
                <div >
                    <label>
                        Enquiry Type:
                    </label>
                    <select name="enquiry-type" class="form-control">
                        <option value="P">Phone</option>
                        <option value="S">Social Media</option>
                        <option value="I">In Person</option>
                    </select>
                </div>
                <div style="margin-top:10px">

                    <input class="btn btn-primary" type="submit" name="insert-enquiry" value="insert"/>
                </div>


            </form>  


        </div>
    </body>
</html>
