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
public class Course {
    private Integer courseId;
    private String title;
    private Double price;
    private Integer duration;
    private String durationType;
    private Date addedDate;
    private Date modifiedDate;
    private Boolean status;

    public Course() {
    }

    public Course(Integer courseId, String title, Double price, Integer duration, String durationType, Date addedDate, Date modifiedDate, Boolean status) {
        this.courseId = courseId;
        this.title = title;
        this.price = price;
        this.duration = duration;
        this.durationType = durationType;
        this.addedDate = addedDate;
        this.modifiedDate = modifiedDate;
        this.status = status;
    }
    public Course(Integer courseId, String title, Double price, Integer duration, String durationType) {
        this.courseId = courseId;
        this.title = title;
        this.price = price;
        this.duration = duration;
        this.durationType = durationType;
        this.addedDate = addedDate;
        this.modifiedDate = modifiedDate;
        this.status = status;
    }
    

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDurationType() {
        return durationType;
    }

    public void setDurationType(String durationType) {
        this.durationType = durationType;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
    
}
