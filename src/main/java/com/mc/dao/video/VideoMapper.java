/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.video;


import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;



/**
 *
 * @author Admin
 */
class VideoMapper implements RowMapper<Video>{

    @Override
    public Video mapRow(ResultSet rs, int i) throws SQLException {
  Video video = new Video();
  
  video.setId(rs.getInt("id"));
  video.setSection(rs.getString("section"));
  video.setData(rs.getString("data"));
  video.setHeadline(rs.getString("headline"));
  video.setLink_embed(rs.getString("link_embed"));
  video.setUrl(rs.getString("url"));
    
    return video;
    }
    
//  `id` INT NOT NULL AUTO_INCREMENT,
//  `section` VARCHAR(250) NULL,
//  `data` DATE NULL,
//  `headline` VARCHAR(250) NULL,
//  `url_embed` VARCHAR(250) NULL,
    
}
