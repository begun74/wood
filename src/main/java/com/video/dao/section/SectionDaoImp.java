/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.video.dao.section;


import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Admin
 */
@Repository(value ="sectionDaoImp")
public class SectionDaoImp implements SectionDao{
    
  //    private DataSource dataSource;
    private NamedParameterJdbcTemplate jdbcTemplateObject;


  @Autowired
    public void setDataSource(DataSource dataSource) {
//     this.dataSource = dataSource;
        this.jdbcTemplateObject = new NamedParameterJdbcTemplate(dataSource);
    }
      
    
//       INSERT INTO section (section) VALUES ('HMC');
//    INSERT INTO section (section) VALUES ('VMC');
    
    @Override
    public Section getSection(int id) {
       MapSqlParameterSource params = new MapSqlParameterSource("id", id);
      Section section = jdbcTemplateObject.queryForObject("select * from section where id=:id", params, new SectionMapper());
   return section;
    } 
   
    
  public List<Section> getListSection() {
     List<Section> listSection= jdbcTemplateObject.query("select * from section ORDER BY section ASC", new SectionMapper());
// ORDER BY data DESC /  ASC - сортирует по возрастанию DESC - сортирует по убыванию  
     return listSection;
                  
     }
    
    
        @Override
    public boolean exist(String str) {
  MapSqlParameterSource params = new MapSqlParameterSource("section", str);
//                Brand brand=null;         
             try {
//brand = 
        jdbcTemplateObject.queryForObject("select * from section where section=:section", params,  new SectionMapper());
return true;
         } catch (Exception e) {
             return false;
        }    

    }
    
        @Override
    public int getId(String str) {
       MapSqlParameterSource params = new MapSqlParameterSource("section", str);
      int id = jdbcTemplateObject.queryForObject("select id from section where section=:section", params, Integer.class);
   return id; 
   
//   select id from brand  where brand='Deckel Maho'
   
    }
    
}
