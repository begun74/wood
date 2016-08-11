/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.video.dao.brand;

/**
 *
 * @author Admin
 */
public class Brand {
  
    private int id;
    private String brand;
    private String discription;
    private String photo;

    public Brand() {
    }

    public Brand(int id, String brand, String discription, String photo) {
        this.id = id;
        this.brand = brand;
        this.discription = discription;
        this.photo = photo;
    }

    public Brand(String brand, String discription, String photo) {
        this.brand = brand;
        this.discription = discription;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Brand{" + "id=" + id + ", brand=" + brand + ", discription=" + discription + ", photo=" + photo + '}';
    }
  
    
    
    
}

//  `id` INT NOT NULL AUTO_INCREMENT,
//  `brand` VARCHAR(100) NULL,
//  `discription` TEXT NULL,
//  `photo` VARCHAR(100) NULL,