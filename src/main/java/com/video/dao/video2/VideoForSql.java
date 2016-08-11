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
public class VideoForSql {

    private int id;
    private int section_id;
    private int brand_id;
    private String  data;
    private String  headline;
    private String  url_embed;

    public VideoForSql() {
    }

    public VideoForSql(int section_id, int brand_id, String data, String headline, String url_embed) {
        this.section_id = section_id;
        this.brand_id = brand_id;
        this.data = data;
        this.headline = headline;
        this.url_embed = url_embed;
    }

    public VideoForSql(int id, int section_id, int brand_id, String data, String headline, String url_embed) {
        this.id = id;
        this.section_id = section_id;
        this.brand_id = brand_id;
        this.data = data;
        this.headline = headline;
        this.url_embed = url_embed;
    }

        public VideoForSql(VideoFromExcel videoFromExcel) {
//        this.section_id = videoFromExcel.g;
//        this.brand_id = brand_id;
        this.data = videoFromExcel.getData();
        this.headline = videoFromExcel.getHeadline();
        this.url_embed = videoFromExcel.getUrl_embed();
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
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
        return "Video2{" + "id=" + id + ", section_id=" + section_id + ", brand_id=" + brand_id + ", data=" + data + ", headline=" + headline + ", url_embed=" + url_embed + '}';
    }
   
    
    
    
}

