/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.enters;

import web.mc.PrintInFile;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository ("entersDaoImpl")
public class EntersDaoImpl extends PrintInFile implements EntersDao{
    
//    private DataSource dataSource;
    private NamedParameterJdbcTemplate jdbcTemplateObject;


  @Autowired
    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
        this.jdbcTemplateObject = new NamedParameterJdbcTemplate(dataSource);
    }
    
    
    
    
    @Override
    public boolean  getExist(String ip) {
                 List<Enters> listEnters = jdbcTemplateObject.query("select * from enters", new EntersMapper());
        boolean newItem = false;
                        for ( Enters ent  : listEnters) {
                        if (ent.getIp().equals(ip)) {
                        newItem = true ;
//                        scItem.incrementQuantity();
                }
                }
return newItem;
    }
        
        
   
    @Override
    public int  getNombersEnters() {

                 List<Enters> listEnters = jdbcTemplateObject.query("select * from enters", new EntersMapper());
        int nombersofenters = listEnters.size();
        return nombersofenters;
    }
    
    
    @Override
    public void  addEnters(Enters enters) {
//   BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(enters);
         MapSqlParameterSource params = new MapSqlParameterSource();
       params.addValue("datetime", ""+enters.getDatetime());
       params.addValue("ip", ""+enters.getIp());
//        printInFile("ip", "ttttttttt: " +enters.getDatetime() + " |||| " + enters.getIp().toString());
   String sql = "INSERT INTO enters (ip) values (:ip)";
   
   jdbcTemplateObject.update(sql, params);

    }
    
    @Override
    public void  addEnters(String str1, String str2) {
//   BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(enters);
         MapSqlParameterSource params = new MapSqlParameterSource();
       params.addValue("datetime", str1);
       params.addValue("ip", str2);
//        printInFile("ip", "ttttttttt: " +enters.getDatetime() + " |||| " + enters.getIp().toString());
   String sql = "INSERT INTO enters (datetime, ip) values (:datetime, :ip)";
   
   jdbcTemplateObject.update(sql, params);

    }
    
    
    
}
