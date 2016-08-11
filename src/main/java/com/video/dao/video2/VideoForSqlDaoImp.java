/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.video.dao.video2;


import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository (value = "video2DaoImp")
public class VideoForSqlDaoImp implements VideoForSqlDao{

    private NamedParameterJdbcTemplate jdbcTemplateObject;


  @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplateObject = new NamedParameterJdbcTemplate(dataSource);
    }
      
    
    @Override
    public VideoForSql getVideo2(int id) {
         MapSqlParameterSource params = new MapSqlParameterSource("id", id);
      VideoForSql video2 = jdbcTemplateObject.queryForObject("select * from video2 where id=:id", params, new VideoForSqlMapper());
   return video2;
    
    
    }

    @Override
    public String addVideoForSqlInDB(VideoForSql videoForSql) {
   BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(videoForSql);
//	MapSqlParameterSource params = new MapSqlParameterSource();

//  String str2 =      "INSERT INTO vmc (product_id, bench_type,model,producer,country,cnc_system,cnc_system_full,year,bench_location,axis_count, x_motion,y_motion,z_motion,desc_size_x,desc_size_y,desc_load,spindle_cone,spindle_freq,spindle_pow,spindle_max_torque, spindle_type,spindle_cooling,mag_type,tool_count,max_tool_d,max_tool_w,tool_rep_time,pos_precision,repos_precision,spindle_runtime,bench_launches,equipment,bench_condition,cost,photo,info) VALUES (507241544,'Vertical Machining Center2','HMC 222 V','Deckel Maho','Italy','Siemens','Siemens 840 D Shop Mill',2006,'Russia',3,1035,560,510,1250,560,1000,'SK 40',8000,'25/35',10,'inner','liquid','revolver',30,250,20,1,5,5,8100,9000,'Pistol, Bath','Good',6000,NULL,NULL)";
  String str2 = "INSERT INTO video2 (headline, section_id, brand_id, data, url_embed )" +
                       "VALUES (:headline, :section_id, :brand_id, :data, :url_embed)";
    
   jdbcTemplateObject.update(str2, params);  
    return "Video added!";
    }
 
    
//      private int id;
//    private int section_id;
//    private int brand_id;
//    private String  data;
//    private String  headline;
//    private String  url_embed;  
    
}
