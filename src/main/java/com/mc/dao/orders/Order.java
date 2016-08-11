/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.orders;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Admin
 */
public class Order {

private int id;

@NotEmpty
private String firstname;

@NotEmpty
private String lastname;

@NotEmpty
private String company;

@NotEmpty
private String address;

@NotEmpty
private String city;

@NotEmpty
private String country;

@NotEmpty
@Email
private String email;

@NotEmpty
private String phone;

private String request;
private String datatime;
private String status;

    public Order() {
    }

    public Order(String firstname, String lastname, String company, String address, String city, String country, String email, String phone, String request, String datatime, String status) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.address = address;
        this.city = city;
        this.country = country;
        this.email = email;
        this.phone = phone;
        this.request = request;
        this.datatime = datatime;
        this.status = status;
    }

    public Order(int id, String firstname, String lastname, String company, String address, String city, String country, String email, String phone, String request, String datatime, String status) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.address = address;
        this.city = city;
        this.country = country;
        this.email = email;
        this.phone = phone;
        this.request = request;
        this.datatime = datatime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", company=" + company + ", address=" + address + ", city=" + city + ", country=" + country + ", email=" + email + ", phone=" + phone + ", request=" + request + ", datatime=" + datatime + ", status=" + status + '}';
    }

   

}
