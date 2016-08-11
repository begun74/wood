/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.producerfilter;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Admin
 */

@Repository (value = "producerFilterDaoImp")
public class ProducerFilterDaoImp implements ProducerFilterDao {
   

    private NamedParameterJdbcTemplate jdbcTemplateObject;

 @Autowired
    public void setDataSource(DataSource dataSource) { 
        this.jdbcTemplateObject = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public List<ProducerFilter> getListProducerFilter() {
  
      List<ProducerFilter> list = jdbcTemplateObject.query("select * from producer_filter", new ProducerFilterMapper());
    return  list;
    }
 
  
    
    
}
