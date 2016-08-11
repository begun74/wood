/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.enters;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Admin
 */
public class EntersMapper implements RowMapper<Enters>{

    @Override
    public Enters mapRow(ResultSet rs, int i) throws SQLException {
Enters enters = new Enters ();
enters.setDatetime(rs.getString("datetime"));
enters.setIp(rs.getString("ip"));

return enters;
    
    }
    
}
