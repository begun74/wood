/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.video.dao.video2;

/**
 *
 * @author Admin
 */
public class VideoFromExcel {
    
    private int id;
    private String section;
    private String brand;
    private String  data;
    private String  headline;
    private String  url_embed;

    public VideoFromExcel() {
    }

    public VideoFromExcel(String section, String brand, String data, String headline, String url_embed) {
        this.section = section;
        this.brand = brand;
        this.data = data;
        this.headline = headline;
        this.url_embed = url_embed;
    }

    public VideoFromExcel(int id, String section, String brand, String data, String headline, String url_embed) {
        this.id = id;
        this.section = section;
        this.brand = brand;
        this.data = data;
        this.headline = headline;
        this.url_embed = url_embed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
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
        return "VideoFromExcel{" + "id=" + id + ", section=" + section + ", brand=" + brand + ", data=" + data + ", headline=" + headline + ", url_embed=" + url_embed + '}';
    }
    
    
    
    
}
