/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.entity;

import java.sql.Date;

/**
 *
 * @author suresh
 */
public class Enquiry {
    private Integer enquiryId;
    private String fullName;
    private String email;
    private Long phone;
    private Course course;
    private String enquiryType;
    private Date addedDate;
    private Date modifiedDate;
    private Boolean isRead;

    public Enquiry() {
    }

    public Enquiry(Integer enquiryId, String fullName, String email, Long phone, Course course, String enquiryType, Date addedDate, Date modifiedDate, Boolean isRead) {
        this.enquiryId = enquiryId;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.course = course;
        this.enquiryType = enquiryType;
        this.addedDate = addedDate;
        this.modifiedDate = modifiedDate;
        this.isRead = isRead;
    }

    
    public Integer getEnquiryId() {
        return enquiryId;
    }

    public void setEnquiryId(Integer enquiryId) {
        this.enquiryId = enquiryId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getEnquiryType() {
        return enquiryType;
    }

    public void setEnquiryType(String enquiryType) {
        this.enquiryType = enquiryType;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }
    
    
    
    
}
