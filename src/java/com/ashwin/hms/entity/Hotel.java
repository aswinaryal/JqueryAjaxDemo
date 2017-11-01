/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ashwin.hms.entity;

/**
 *
 * @author Ashwin
 */
public class Hotel {
    private int id;
    private String name,address,contactNo,email;
    private int star;
    private boolean status;

    public Hotel() {
    }

    public Hotel(int id, String name, String address, String contactNo, String email, int star, boolean status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.email = email;
        this.star = star;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
