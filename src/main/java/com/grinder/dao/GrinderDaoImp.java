/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grinder.dao;


import web.mc.PrintInFile;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author Admin
 */
@Component ("grinderDaoImp")
public class GrinderDaoImp extends PrintInFile implements GrinderDao{

    
//    private DataSource dataSource;
    private NamedParameterJdbcTemplate jdbcTemplateObject;

    
   @Autowired
    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
        this.jdbcTemplateObject = new NamedParameterJdbcTemplate(dataSource);
    }
    
    
    
 //@Override
 public void addGrinder(Grinder grinder) {


  BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(grinder);
//  printInFile("ip", "ttttttttt: " +enters.getDatetime() + " |||| " + enters.getIp().toString());
   String sql = "INSERT INTO grinder (" +
" model, " +
" type, " +
" country, " +
" tool, " +
" diametermax, " +
" diametermin, " +
" angle, " +
" powersupply, " +
" grinderspeed, " +
" spindlespeed, " +
" grindingwhell, " +
" typeofthinings, " +
" machinesize, " +
" packegesize, " +
" weightnetto, " +
" weightbrutto, " +
" price, " +
" photo1, " +
" photo2, " +
" photo3, " +
" phototool1, " +
" phototool2, " +
" phototool3, " +
" phototool4, " +
" video, " +
" designed, " +
" description, " +
" standardaccessories, " +
" standardequipment, " +
" optionalaccessories ) "
     + "values (" +
":model, " +
":type, " +
":country, " +
":tool, " +
":diametermax, " +
":diametermin, " +
":angle, " +
":powersupply, " +
":grinderspeed, " +
":spindlespeed, " +
":grindingwhell, " +
":typeofthinings, " +
":machinesize, " +
":packegesize, " +
":weightnetto, " +
":weightbrutto, " +
":price, " +
":photo1, " +
":photo2, " +
":photo3, " +
":phototool1, " +
":phototool2, " +
":phototool3, " +
":phototool4, " +
":video, " +
":designed, " +
":description, " +
":standardaccessories, " +
":standardequipment, " +
":optionalaccessories )";   
 
 jdbcTemplateObject.update(sql, params); 
 
 }

    public List<Grinder> getListGrinders() {
       List<Grinder> listGrinder = jdbcTemplateObject.query("select * from grinder ORDER BY model ASC", new GrinderMapper());
    //  ASC - сортирует по возрастанию DESC - сортирует по убыванию  
       return  listGrinder;  
    }

    //@Override
    public Grinder getGrinder(int id) {
      MapSqlParameterSource params = new MapSqlParameterSource("id", id);
      Grinder grinder = jdbcTemplateObject.queryForObject("select * from grinder where id=:id", params, new GrinderMapper());
    return  grinder; 
    
    }
 
    
    
    //@Override
    public List<Grinder> getListGrinders(int drill, int mill) {
        
//       MapSqlParameterSource params = new MapSqlParameterSource();
    String sql = "select * from grinder";
    int k1=0;
    int k2=0;

    //0
    if (drill==1 || mill==1
//        s.getX()!="n" || s.getY()!="n" || s.getZ()!="n"
            ){  sql += " where (model is not null) " ;
            
            // 1
            if (drill==1 || mill==1){
    sql += "and (" ;
              if (drill==1 )   {sql += "tool='drills' " ; k1++;}
              if (mill==1 ) { if(k1==1) {sql +=" or ";k1=0;} sql += "tool='mills'" ;k1++;}              
             sql += " ) " ; 
    } 
        
            //2
//        if (!"n".equals(s.getX()) || !"n".equals(s.getY()) || !"n".equals(s.getZ())) {
//            sql += " and ( " ;
//    if (    !"n".equals(s.getX())) {sql += s.getX() ; k2++;}   
//    if (    !"n".equals(s.getY()))  { if(k2==1) {sql +=" and ";k2=0;} sql += s.getY() ;k2++;}
//    if (    !"n".equals(s.getZ()))  { if(k2==1) {sql +=" and ";k2=0;} sql += s.getZ() ;k2++;}
//     sql += " ) " ; 
//    }      
        sql += " ORDER BY model ASC"    ;
    }
//   select * from hmc where (producer is not null) and (producer='Deckel Macho' or producer='Mazak') and (bench_location='USA')
//   and (x_motion>200 ) and (y_motion between 100 and 500) and (y_motion < 300 );

//    if (chUSA==1 || chGermany==1) {sql += " AND ( " ;
//      if (chUSA==1 )   {sql += "bench_location='USA' " ; k2++;}
//   if (chGermany==1 )  { if(k2==1) {sql +="or ";k2=0;} sql += "bench_location='Germany' " ;k2++;}
//    sql +=")";
  
    
    
printInFile ("grinder ",sql);
//       select * from hmc where producer='Deckel Macho' and producer='Mazak'
  List<Grinder> listHmc  = jdbcTemplateObject.query(sql,  new GrinderMapper());
    return listHmc;
    } 
    
    
    
    
}



// model,
// type,
// country,
// tool,
// diametermax,
// diametermin,
// angle,
// powersupply,
// grinderspeed,
// spindlespeed,
// grindingwhell,
// typeofthinings,
// machinesize,
// packegesize,
// weightnetto,
// weightbrutto,
// price,
// photo1,
// photo2,
// photo3,
// phototool1,
// phototool2,
// phototool3,
// phototool4,
// phototool5,
// designed,
// description,
// standardaccessories,
// standardequipment,
// optionalaccessories, 