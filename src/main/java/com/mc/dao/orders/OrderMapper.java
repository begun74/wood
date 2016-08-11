/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.orders;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Admin
 */
public class OrderMapper implements RowMapper<Order>{

    @Override
    public Order mapRow(ResultSet rs, int i) throws SQLException {

        Order order = new Order();
        order.setId(rs.getInt("id"));
        order.setFirstname(rs.getString("firstname"));
        order.setLastname(rs.getString("lastname"));
        order.setCompany(rs.getString("company"));
        order.setAddress(rs.getString("address"));
        order.setCity(rs.getString("city"));
        order.setCountry(rs.getString("country"));
        order.setEmail(rs.getString("email"));
        order.setPhone(rs.getString("phone"));
        order.setRequest(rs.getString("request"));
        order.setDatatime(rs.getString("datatime"));
        order.setStatus(rs.getString("status"));

return order;    
    }
// CREATE TABLE IF NOT EXISTS `mc`.`orders` (
//  `id` INT NOT NULL AUTO_INCREMENT,
//  `firstname` VARCHAR(155) NULL,
//  `lastname` VARCHAR(155) NULL,
//  `company` VARCHAR(155) NULL,
//  `address` VARCHAR(155) NULL,
//  `city` VARCHAR(155) NULL,
//  `country` VARCHAR(155) NULL,
//  `email` VARCHAR(155) NULL,
//  `phone` VARCHAR(45) NULL,
//  `order` TEXT NULL,
//  `datatime` DATETIME NULL,
//  `status` VARCHAR(100) NULL,
//  PRIMARY KEY (`id`))
//ENGINE = InnoDB;   
}
