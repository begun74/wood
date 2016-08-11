/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.producerfilter;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;




public class ProducerFilterMapper implements RowMapper<ProducerFilter> {

    @Override
    public ProducerFilter mapRow(ResultSet rs, int i) throws SQLException {
  
      ProducerFilter producerFilter = new ProducerFilter();
      producerFilter.setProducer(rs.getString("producer"));
      producerFilter.setNum(rs.getInt("num"));
      
      return producerFilter;
    
    }
    
}
