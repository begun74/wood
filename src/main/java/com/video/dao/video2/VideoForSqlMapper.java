/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.video.dao.video2;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class VideoForSqlMapper implements RowMapper<VideoForSql> {

    @Override
    public VideoForSql mapRow(ResultSet rs, int i) throws SQLException {
  
    VideoForSql  video2 = new VideoForSql();
video2.setId(rs.getInt("id"));
video2.setSection_id(rs.getInt("section_id"));
video2.setBrand_id(rs.getInt("brand_id"));
video2.setData(rs.getString("data"));
video2.setHeadline(rs.getString("headline"));
video2.setUrl_embed(rs.getString("url_embed"));
    return video2;
    }
    
//       private int id;
//    private int section_id;
//    private int brand_id;
//    private String  data;
//    private String  headline;
//    private String  url_embed; 
}
