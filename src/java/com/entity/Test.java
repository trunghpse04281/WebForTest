/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.util.Date;

/**
 *
 * @author Pet
 */
public class Test {

    private String code;
    private Date createdTIme;
    private Subject subject;
    private String craetedBy;
    private String activeFor;
    private Date endDate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreatedTIme() {
        return createdTIme;
    }

    public void setCreatedTIme(Date createdTIme) {
        this.createdTIme = createdTIme;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getCraetedBy() {
        return craetedBy;
    }

    public void setCraetedBy(String craetedBy) {
        this.craetedBy = craetedBy;
    }

    public String getActiveFor() {
        return activeFor;
    }

    public void setActiveFor(String activeFor) {
        this.activeFor = activeFor;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}
