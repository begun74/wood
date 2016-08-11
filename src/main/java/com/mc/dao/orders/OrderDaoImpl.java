/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.orders;

import com.mc.dao.vmc.Vmc;
import com.mc.dao.vmc.VmcMapper;
import com.mc.dao.message.Message;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Admin
 */
@Repository
public class OrderDaoImpl implements OrderDAO{
    
    private DataSource dataSource;
    private NamedParameterJdbcTemplate jdbcTemplateObject;

 @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new NamedParameterJdbcTemplate(dataSource);
    }

    
    
    @Override
    public void addOrder(Order order) {

 BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(order); 
   String str= 
"INSERT INTO orders "
//+ "(firstname, lastname, company, address, city, country, email, phone, order, datatime, status) "
+ "(firstname, lastname, company, address, city, country, email, phone, request, datatime, status) "
//+ "(firstname, lastname, company, address, city, country, email, phone) "
//+ "(firstname, lastname, company, address) "
+ "VALUES"
//+ "(:firstname, :lastname, :company, :address , :city, :country, :email, :phone, :order, :datatime, :status)";;
+ "(:firstname, :lastname, :company, :address , :city, :country, :email, :phone, :request, :datatime, :status)";
//+ "(:firstname, :lastname, :company, :address , :city, :country, :email, :phone)";
//+ "(:firstname, :lastname, :company, :address)";;
   jdbcTemplateObject.update(str, params);
    }

//INSERT INTO orders (firstname, lastname, company, address, city, country, email, phone, request, datatime, status) VALUES   
//   ('firstname', 'lastname', 'company', 'address', 'city', 'country', 'email', 'phone', 'order', '2015-06-02', 'in'); 
   
    
     @Override
    public void addOrderFromContact(Message message) {
   String str= 
"INSERT INTO orders "
+ "(firstname,  email, request, datatime, status) "
+ "VALUES"
+ "(:firstname, :email, :request, :datatime, :status)";
    MapSqlParameterSource params = new MapSqlParameterSource();  
    params.addValue("firstname", message.getName()+ " (from contact)");
//    params.addValue("lastname", message.getSubject());
    params.addValue("email", message.getEmail());
    params.addValue("request",message.getSubject()+"<br>"+ message.getMessage());
    params.addValue("datatime", "2016-03-17");
    params.addValue("status", "in");
    
    jdbcTemplateObject.update(str, params);
   
    }
       
    
    
    
    @Override
    public int getNombers() {
//  BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(); 
  String sql =  "select * from orders where status = 'in'";
  
 List<Order> list = jdbcTemplateObject.query(sql, new OrderMapper());
    
 int n = list.size();
 return n;
    
    }

    @Override
    public List<Order> getListOrders() {
//  List<Vmc> listHmc = jdbcTemplateObject.query("select * from vmc", new VmcMapper());
   List<Order> list = jdbcTemplateObject.query("select * from orders", new OrderMapper());
    return  list;
     
    }

    @Override
    public void requestIsProcessed(int id) {
    MapSqlParameterSource params = new MapSqlParameterSource("id", id);
   String sql =  "UPDATE orders set status='ok' where id=:id";
   jdbcTemplateObject.update(sql, params);
    }


    
    
    
}
