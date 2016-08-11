/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.video.dao.brand;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;



public class BrandMapper implements RowMapper<Brand>{

    @Override
    public Brand mapRow(ResultSet rs, int i) throws SQLException {
Brand brand = new Brand();

brand.setId(rs.getInt("id"));
brand.setBrand(rs.getString("brand"));
brand.setDiscription(rs.getString("discription"));
brand.setPhoto(rs.getString("photo"));

return brand;
    
    }
    
}
//  `id` INT NOT NULL AUTO_INCREMENT,
//  `brand` VARCHAR(100) NULL,
//  `discription` TEXT NULL,
//  `photo` VARCHAR(100) NULL,