/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.vmc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Admin
 */
public class VmcMapper implements RowMapper<Vmc> {

    @Override
    public Vmc mapRow(ResultSet rs, int i) throws SQLException {
 Vmc vmc = new Vmc ();
 vmc.setId(rs.getInt("id"));
 vmc.setProductid(rs.getString("productid"));
 vmc.setType(rs.getString("type"));
 vmc.setTyperu(rs.getString("typeru"));
 
 
 vmc.setTypeurl(rs.getString("typeurl"));
 vmc.setModel(rs.getString("model"));
 vmc.setModelurl(rs.getString("modelurl"));
 vmc.setManufacturer(rs.getString("manufacturer"));
 
 vmc.setCountry(rs.getString("country"));
 vmc.setCountryru(rs.getString("countryru"));
 
 vmc.setCncsystem(rs.getString("cncsystem"));
 vmc.setCncsystemfull(rs.getString("cncsystemfull"));
 vmc.setYear(rs.getInt("year"));
 vmc.setMachinecondition(rs.getString("machinecondition"));
 vmc.setMachineconditionru(rs.getString("machineconditionru"));
 
 vmc.setMachinelocation(rs.getString("machinelocation"));
 vmc.setMachinelocationru(rs.getString("machinelocationru"));
 
 vmc.setAxiscount(rs.getString("axiscount"));
 
 vmc.setXmotion(rs.getInt("xmotion"));
 vmc.setYmotion(rs.getInt("ymotion"));
 vmc.setZmotion(rs.getInt("zmotion"));
 
 vmc.setXtablesize(rs.getInt("xtablesize"));
 vmc.setYtablesize(rs.getInt("ytablesize"));
 vmc.setTablerectangleload(rs.getInt("tablerectangleload"));
 
 vmc.setTableroundsize(rs.getString("tableroundsize"));
 vmc.setTableroundload(rs.getInt("tableroundload"));

 
 vmc.setSpindlenose(rs.getString("spindlenose"));
 vmc.setSpindlespeed(rs.getInt("spindlespeed"));
 vmc.setSpindlepower(rs.getString("spindlepower"));

 vmc.setToolcount(rs.getInt("toolcount"));
 vmc.setToolmaxdiameter(rs.getInt("toolmaxdiameter"));
 vmc.setToolmaxweight(rs.getInt("toolmaxweight"));
 vmc.setToolmaxlength(rs.getInt("toolmaxlength"));
 
 vmc.setToolchangingtooltotool(rs.getString("toolchangingtooltotool"));
 vmc.setToolchangingchiptochip(rs.getString("toolchangingchiptochip"));
 vmc.setPositioningaccuracy(rs.getString("positioningaccuracy"));
 
 vmc.setSpindleruntime(rs.getString("spindleruntime"));
 vmc.setMachineruntime(rs.getString("machineruntime"));
 
 vmc.setPrice (rs.getInt("price"));
 vmc.setPhoto1(rs.getString("photo1"));
 vmc.setPhoto2(rs.getString("photo2"));
 vmc.setPhoto3(rs.getString("photo3"));
 vmc.setPhoto4(rs.getString("photo4"));
 vmc.setPhoto5(rs.getString("photo5"));
 vmc.setInfo1en(rs.getString("info1en"));
 vmc.setInfo2ru(rs.getString("info2ru"));
 
 vmc.setVideo1(rs.getString("video1"));
 vmc.setVideo2(rs.getString("video2"));
 vmc.setVideo3(rs.getString("video3"));
 
 vmc.setSold(rs.getString("sold"));
 
 return vmc;
        
    }
 }




    
    
    
    //----- записаны-----
//        @Id
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "product_id")
//    private int productId;
//
//    @Column(name = "bench_type")
//    private String benchType;
//
//    @Column(name = "model")
//    private String model;
//
//        @Column(name = "producer")
//    private String producer;
//
//    @Column(name = "country")
//    private String country;
//
//    @Column(name = "cnc_system")
//    private String cncSystem;
//
//    @Column(name = "cnc_system_full")
//    private String cncSystemFull;
//     
//    @Column(name = "year")
//    private int year;
//
//    @Column(name = "bench_location")
//    private String benchLocation;
//
//    @Column(name = "axis_count")
//    private int axisCount;
//
//    @Column(name = "x_motion")
//    private int xMotion;
//    
//        @Column(name = "y_motion")
//    private int yMotion;
//
//    @Column(name = "z_motion")
//    private int zMotion;
//
//    @Column(name = "desc_size_x")
//    private int descSizeX;
//
//    @Column(name = "desc_size_y")
//    private int descSizeY;
//
//    
//    
//    
//    
//
//    
//    
//        @Column(name = "photo")
//    private String photo;
//
//    @Column(name = "info")
//    private String info;   
//}
// не оформленные
//    @Column(name = "desc_load")
//    private int descLoad;
//
//    @Column(name = "spindle_cone")
//    private String spindleCone;
//
//    @Column(name = "spindle_freq")
//    private int spindleFreq;
//
//    @Column(name = "spindle_pow")
//    private String spindlePow;
//
//    @Column(name = "spindle_max_torque")
//    private int spindleMaxTorque;
//
//    @Column(name = "spindle_type")
//    private String spindleType;
//
//    @Column(name = "spindle_cooling")
//    private String spindleCooling;

//    @Column(name = "mag_type")
//    private String magType;
//
//    @Column(name = "tool_count")
//    private int toolCount;
//
//    @Column(name = "max_tool_d")
//    private int toolMaxD;
//
//    @Column(name = "max_tool_w")
//    private int toolMaxW;
//
//    @Column(name = "tool_rep_time")
//    private int toolRepTime;

//
//    @Column(name = "pos_precision")
//    private int posPrecision;
//
//    @Column(name = "repos_precision")
//    private int reposPrecision;
//
//    @Column(name = "spindle_runtime")
//    private int spindleRuntime;
//
//    @Column(name = "bench_launches")
//    private int benchLaunches;

//    @Column(name = "equipment")
//    private String equipment;
//
//    @Column(name = "bench_condition")
//    private String benchCondition;
//
//    @Column(name = "cost")
//    private int cost;


    