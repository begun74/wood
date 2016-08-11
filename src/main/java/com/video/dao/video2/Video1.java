/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.video.dao.video2;

import com.video.dao.brand.Brand;
import com.video.dao.section.Section;

/**
 *
 * @author Admin
 */
public class Video1 {
  
    private int id;
    private Section section;
    private Brand brand;
    private String  data;
    private String  headline;
    private String  url_embed;

    public Video1() {
    }

    public Video1(Section section, Brand brand, String data, String headline, String url_embed) {
        this.section = section;
        this.brand = brand;
        this.data = data;
        this.headline = headline;
        this.url_embed = url_embed;
    }

    public Video1(int id, Section section, Brand brand, String data, String headline, String url_embed) {
        this.id = id;
        this.section = section;
        this.brand = brand;
        this.data = data;
        this.headline = headline;
        this.url_embed = url_embed;
    }

    
    public Video1 (VideoForSql video2){
        this.id = video2.getId();
//        this.section = section;
//        this.brand = brand;
        this.data = video2.getData();
        this.headline = video2.getHeadline();
        this.url_embed = video2.getUrl_embed();
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getUrl_embed() {
        return url_embed;
    }

    public void setUrl_embed(String url_embed) {
        this.url_embed = url_embed;
    }

    @Override
    public String toString() {
        return "Video1{" + "id=" + id + ", section=" + section + ", brand=" + brand + ", data=" + data + ", headline=" + headline + ", url_embed=" + url_embed + '}';
    }


    
    
    
    
}
//  `id` INT NOT NULL AUTO_INCREMENT,
//  `section_id` INT NOT NULL,
//  `brand_id` INT NOT NULL,
//  `data` DATE NULL,
//  `headline` VARCHAR(250) NULL,
//  `url_embed` VARCHAR(250) NULL,