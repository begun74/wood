/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grinder.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


/**
 *
 * @author Admin
 */
public class GrinderMapper implements RowMapper<Grinder>{

	//@Override
    public Grinder mapRow(ResultSet rs, int i) throws SQLException {
Grinder grinder = new Grinder();
    
grinder.setId(rs.getInt("id"));
grinder.setModel(rs.getString("model"));
grinder.setType(rs.getString("type"));
grinder.setCountry(rs.getString("country"));
grinder.setTool(rs.getString("tool"));
grinder.setDiametermax(rs.getInt("diametermax"));
grinder.setDiametermin(rs.getInt("diametermin"));
grinder.setAngle(rs.getString("angle"));
grinder.setPowersupply(rs.getString("powersupply"));
grinder.setGrinderspeed(rs.getInt("grinderspeed"));
grinder.setSpindlespeed(rs.getInt("spindlespeed"));
grinder.setGrindingwhell(rs.getString("grindingwhell"));
grinder.setTypeofthinings(rs.getString("typeofthinings"));
grinder.setMachinesize(rs.getString("machinesize"));
grinder.setPackegesize(rs.getString("packegesize"));
grinder.setWeightnetto(rs.getInt("weightnetto"));
grinder.setWeightbrutto(rs.getInt("weightbrutto"));
grinder.setPrice(rs.getInt("price"));
grinder.setPhoto1(rs.getString("photo1"));
grinder.setPhoto2(rs.getString("photo2"));
grinder.setPhoto3(rs.getString("photo3"));
grinder.setPhototool1(rs.getString("phototool1"));
grinder.setPhototool2(rs.getString("phototool2"));
grinder.setPhototool3(rs.getString("phototool3"));
grinder.setPhototool4(rs.getString("phototool4"));
grinder.setVideo(rs.getString("video"));
grinder.setDesigned(rs.getString("designed"));
grinder.setDescription(rs.getString("description"));
grinder.setStandardaccessories(rs.getString("standardaccessories"));
grinder.setStandardequipment(rs.getString("standardequipment"));
grinder.setOptionalaccessories(rs.getString("optionalaccessories"));

return grinder;
    }
    
}

