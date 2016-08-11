/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.video.dao.brand;

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

@Repository (value = "brandDaoImp")
public class BrandDaoImp implements BrandDao {

    
  //    private DataSource dataSource;
    private NamedParameterJdbcTemplate jdbcTemplateObject;


   @Autowired
    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
        this.jdbcTemplateObject = new NamedParameterJdbcTemplate(dataSource);
    }
      
    
    @Override
    public Brand getBrand(int id) {
       MapSqlParameterSource params = new MapSqlParameterSource("id", id);
      Brand brand = jdbcTemplateObject.queryForObject("select * from brand where id=:id", params, new BrandMapper());
   return brand; 
    }
    
    @Override
    public int getId(String str) {
       MapSqlParameterSource params = new MapSqlParameterSource("brand", str);
      int id = jdbcTemplateObject.queryForObject("select id from brand where brand=:brand", params, Integer.class);
   return id; 
   
//   select id from brand  where brand='Deckel Maho'
   
    }
 
    
    
    
    @Override
    public List <Brand> getListBrands() {
 List<Brand> listBrand = jdbcTemplateObject.query("select * from brand", new BrandMapper());
    return listBrand;
    }

    @Override
    public boolean exist(String str) {
  MapSqlParameterSource params = new MapSqlParameterSource("brand", str);
//                Brand brand=null;         
             try {
//brand = 
        jdbcTemplateObject.queryForObject("select * from brand where brand=:brand", params,  new BrandMapper());
return true;
         } catch (Exception e) {
             return false;
        }    

    }

}
