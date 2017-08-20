<%-- 
    Document   : index
    Created on : May 18, 2017, 2:09:58 PM
    Author     : suresh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.bigdate.DAO.EnquiryDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    EnquiryDao ed=new EnquiryDao();
    
    
    %>
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
    <body>
        <h1>Hello World!</h1>
        <div class="container-fluid table-responsive">
            <table class="table table-bordered table-hover table-striped">
                
                <tr>
                    <th>Enquiry id</th>
                    <th>Full Name</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Course ID</th>
                    <th>Added Date</th>
                    <th>Modified Date</th>
                    <th>Is Read</th>
                    
                </tr>
                
                <c:forEach items="<%=ed.getAllEnquiry()%>" var="el">
                    <tr <c:if test="${el.getIsRead()==false}">
                            style="color:red"
                    </c:if>
                      >
                        <td>${el.getEnquiryId()}</td>
                        <td>${el.getFullName()}</td>
                        <td>${el.getEmail()}</td>
                        <td>${el.getPhone()}</td>
                        <td>${el.getCourse().getTitle()}</td>
                        <td>${el.getAddedDate()}</td>
                        <td>${el.getModifiedDate()}</td>
                        <td>
                            <c:if test="${el.getIsRead()==true}">
                                Read
                            </c:if>
                                
                        </td>
                    </tr>
                </c:forEach>
                
            </table> 

        </div>
    </body>
</html>
