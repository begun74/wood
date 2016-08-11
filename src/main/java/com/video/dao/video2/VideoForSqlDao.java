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
public interface VideoForSqlDao {
 
public VideoForSql getVideo2(int id);
public String addVideoForSqlInDB(VideoForSql videoForSql) ;
    
}
//  `id` INT NOT NULL AUTO_INCREMENT,
//  `section_id` INT NOT NULL,
//  `brand_id` INT NOT NULL,
//  `data` DATE NULL,
//  `headline` VARCHAR(250) NULL,
//  `url_embed` VARCHAR(250) NULL,