/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.vmc;

import com.mc.select.Select;
import web.mc.PrintInFile;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Admin
 */


@Repository("vmcDaoImpl")
public class VmcDaoImpl extends PrintInFile implements VmcDao {


    private NamedParameterJdbcTemplate jdbcTemplate;

    private final int NOMBER_PRODUCTS_ON_PAGE = 12;
    public int kol_vo_product;
    public int kol_vo_page_itogo;
    
    
  @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
    
    
    @Override
    public List<Vmc> listVmc() {
 List<Vmc> listHmc = jdbcTemplate.query("select * from vmc", new VmcMapper());
    return  listHmc;
    }
    
    @Override
    public List<Vmc> listVmcModelDESC() {
 List<Vmc> listHmc = jdbcTemplate.query("select * from vmc  ORDER BY model ASC", new VmcMapper());
 //  ASC - сортирует по возрастанию DESC - сортирует по убыванию  
    return  listHmc;
    }
    
    @Override
    public List<Vmc> getListFromSearch(String str) {
String sql =   "select * from vmc where model LIKE '%"+str+"%' or type LIKE '%"+str+"%' ORDER BY model DESC" ;
List<Vmc> listHmc =  jdbcTemplate.query(sql , new VmcMapper());
        printInFile("getListFromSearch", sql);
        
    return  listHmc;
    }

    @Override
    public Vmc getVmc(int id) {
      MapSqlParameterSource params = new MapSqlParameterSource("id", id);
  Vmc hmc = jdbcTemplate.queryForObject("select * from vmc where id=:id", params,  new VmcMapper());
    return  hmc;   
    }

    @Override
    public void addVmc(Vmc vmc) {
   BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(vmc);
//	MapSqlParameterSource params = new MapSqlParameterSource();

//  String str2 =      "INSERT INTO vmc (product_id, bench_type,model,producer,country,cnc_system,cnc_system_full,year,bench_location,axis_count, x_motion,y_motion,z_motion,desc_size_x,desc_size_y,desc_load,spindle_cone,spindle_freq,spindle_pow,spindle_max_torque, spindle_type,spindle_cooling,mag_type,tool_count,max_tool_d,max_tool_w,tool_rep_time,pos_precision,repos_precision,spindle_runtime,bench_launches,equipment,bench_condition,cost,photo,info) VALUES (507241544,'Vertical Machining Center2','HMC 222 V','Deckel Maho','Italy','Siemens','Siemens 840 D Shop Mill',2006,'Russia',3,1035,560,510,1250,560,1000,'SK 40',8000,'25/35',10,'inner','liquid','revolver',30,250,20,1,5,5,8100,9000,'Pistol, Bath','Good',6000,NULL,NULL)";
  String str2 =      "INSERT INTO vmc ("
          + "   productid,\n" +
"     type, \n" +
"     typeru, \n" +
"     typeurl, \n" +
"     model,\n" +
"     modelurl,\n" +
"     manufacturer,\n" +
"     country,\n" +
"     countryru,\n" +
"     cncsystem,\n" +
"     cncsystemfull,\n" +
"     year,\n" +
"     machinecondition,\n" +
"     machineconditionru,\n" +
"     machinelocation,\n" +
"     machinelocationru,\n" +
"    \n" +
"     axiscount,\n" +
"     xmotion,\n" +
"     ymotion,\n" +
"     zmotion,\n" +
"    \n" +
"     xtablesize,\n" +
"     ytablesize,\n" +
"     tablerectangleload,\n" +
"    \n" +
"     tableroundsize,\n" +
"     tableroundload,\n" +
"    \n" +
"     spindlenose,\n" +
"     spindlespeed,  \n" +
"     spindlepower,\n" +
"\n" +
"     toolcount,\n" +
"     toolmaxdiameter,\n" +
"     toolmaxweight,\n" +
"     toolmaxlength,\n" +
"    \n" +
"     toolchangingtooltotool,\n" +
"     toolchangingchiptochip,\n" +
"     positioningaccuracy,   \n" +
"\n" +
"     spindleruntime,\n" +
"     machineruntime,\n" +
"    \n" +
"     price,\n" +
"     photo1,\n" +
"     photo2,\n" +
"     photo3,\n" +
"     photo4,\n" +
"     photo5,\n" +
"     info1en,\n" +
"     info2ru,"
          + "video1,"
          + "video2,"
          + "video3,"
          + "sold"
          + ") VALUES (" + 

          "   :productid,\n" +
"     :type, \n" +
"     :typeru, \n" +
"     :typeurl, \n" +
"     :model,\n" +
"     :modelurl,\n" +
"     :manufacturer,\n" +
"     :country,\n" +
"     :countryru,\n" +
"     :cncsystem,\n" +
"     :cncsystemfull,\n" +
"     :year,\n" +
"     :machinecondition,\n" +
"     :machineconditionru,\n" +
"     :machinelocation,\n" +
"     :machinelocationru,\n" +
"    \n" +
"     :axiscount,\n" +
"     :xmotion,\n" +
"     :ymotion,\n" +
"     :zmotion,\n" +
"    \n" +
"     :xtablesize,\n" +
"     :ytablesize,\n" +
"     :tablerectangleload,\n" +
"    \n" +
"     :tableroundsize,\n" +
"     :tableroundload,\n" +
"    \n" +
"     :spindlenose,\n" +
"     :spindlespeed,  \n" +
"     :spindlepower,\n" +
"\n" +
"     :toolcount,\n" +
"     :toolmaxdiameter,\n" +
"     :toolmaxweight,\n" +
"     :toolmaxlength,\n" +
"    \n" +
"     :toolchangingtooltotool,\n" +
"     :toolchangingchiptochip,\n" +
"     :positioningaccuracy,   \n" +
"\n" +
"     :spindleruntime,\n" +
"     :machineruntime,\n" +
"    \n" +
"     :price,\n" +
"     :photo1,\n" +
"     :photo2,\n" +
"     :photo3,\n" +
"     :photo4,\n" +
"     :photo5,\n" +
"     :info1en,\n" +
"     :info2ru,"
             + ":video1,"
          + ":video2,"
          + ":video3,"
          + ":sold"
          + ")";
 

//productid,
//type, 
//typeru, 
//typeurl, 
//model,
//modelurl,
//manufacturer,
//country,
//countryru,
//cncsystem,
//cncsystemfull,
//year,
//machinecondition,
//machineconditionru,
//machinelocation,
//machinelocationru,
//axiscount,
//xmotion,
//ymotion,
//zmotion,
//xtablesize,
//ytablesize,
//tablerectangleload,
//tableroundsize,
//tableroundload,
//spindlenose,
//spindlespeed,  
//spindlepower,
//toolcount,
//toolmaxdiameter,
//toolmaxweight,
//toolmaxlength,
//toolchangingtooltotool,
//toolchangingchiptochip,
//positioningaccuracy,   
//spindleruntime,
//machineruntime,
//price,
//photo1,
//photo2,
//photo3,
//photo4,
//photo5,
//info1en,
//info2ru,
  
  
  
  jdbcTemplate.update(str2, params);
    }

    @Override
    public void editVmc(Vmc vmc){
BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(vmc);
        
 String str2 =      "UPDATE vmc set "+
"productid =:productid,\n" +
"type =:type, \n" +
"typeru =:typeru, \n" +
"typeurl =:typeurl, \n" +
"model=:model,\n" +
"modelurl =:modelurl,\n" +
"manufacturer =:manufacturer,\n" +
"country =:country,\n" +
"countryru =:countryru,\n" +
"cncsystem =:cncsystem,\n" +
"cncsystemfull =:cncsystemfull,\n" +
"year =:year,\n" +
"machinecondition =:machinecondition,\n" +
"machineconditionru =:machineconditionru,\n" +
"machinelocation =:machinelocation,\n" +
"machinelocationru =:machinelocationru,\n" +
"axiscount =:axiscount,\n" +
"xmotion =:xmotion,\n" +
"ymotion =:ymotion,\n" +
"zmotion =:zmotion,\n" +
"xtablesize =:xtablesize,\n" +
"ytablesize =:ytablesize,\n" +
"tablerectangleload =:tablerectangleload,\n" +
"tableroundsize =:tableroundsize,\n" +
"tableroundload =:tableroundload,\n" +
"spindlenose =:spindlenose,\n" +
"spindlespeed =:spindlespeed,  \n" +
"spindlepower =:spindlepower,\n" +
"toolcount =:toolcount,\n" +
"toolmaxdiameter =:toolmaxdiameter,\n" +
"toolmaxweight =:toolmaxweight,\n" +
"toolmaxlength =:toolmaxlength,\n" +
"toolchangingtooltotool =:toolchangingtooltotool,\n" +
"toolchangingchiptochip =:toolchangingchiptochip,\n" +
"positioningaccuracy =:positioningaccuracy,   \n" +
"spindleruntime =:spindleruntime,\n" +
"machineruntime =:machineruntime,\n" +
"price =:price,\n" +
"photo1 =:photo1,\n" +
"photo2 =:photo2,\n" +
"photo3 =:photo3,\n" +
"photo4 =:photo4,\n" +
"photo5 =:photo5,\n" +
"info1en =:info1en,\n" +
"info2ru =:info2ru, "+
"video1 =:video1," +
"video2 =:video2," +
"video3 =:video3," +
"sold =:sold"
         + " where productid=:productid";
                               
// UPDATE vmc set photo5 ='wertwe',photo4 ='ttttt' where productid='usa001';
  
  jdbcTemplate.update(str2, params);
    }
    
    
        @Override
    public boolean existVmc(Vmc vmc) {
   
      MapSqlParameterSource params = new MapSqlParameterSource("productid", vmc.getProductid());
  Vmc vmc1=null;
                
 try {
  vmc1 = jdbcTemplate.queryForObject("select * from vmc where productid=:productid", params,  new VmcMapper());
} catch (Exception e) {
}
     
  if(vmc1!=null) {
//      printInFile("1 t= " + true);
      return true;
  }
   else {
//      printInFile("1 f= " + false);
      return false;
  }
    }
    
    
 

    @Override
    public List<Vmc> listHmc(int chDmg, int chMazak, int chHaas, int chSpiner) {
        
       MapSqlParameterSource params = new MapSqlParameterSource();
    String sql = "select * from vmc";
    int k=0;
    if (chDmg==1 || chMazak==1 || chHaas==1 || chSpiner==1){  sql += " where " ;
    
              if (chDmg==1 )   {sql += "manufacturer='DECKEL MAHO' " ; k++;}
              if (chMazak==1 ) { if(k==1) {sql +="or "; k=0;} sql += "manufacturer='Mazak' " ;k++;}
              if (chHaas==1 )  { if(k==1) {sql +="or "; k=0;} sql += "manufacturer='HAAS' " ;k++;}
              if (chSpiner==1 ){ if(k==1) {sql +="or "; k=0;} sql += "manufacturer='Spinner' " ;k++;}              
    }
 
printInFile (sql);
//       select * from hmc where producer='Deckel Macho' and producer='Mazak'
  List<Vmc> listHmc  = jdbcTemplate.query(sql,  new VmcMapper());
    return listHmc;
    }
    
    
    
    
    @Override
    public List<Vmc> listHmc(int chDmg, int chMazak, int chHaas, int chSpiner, int chUSA, int chGermany) {
        
       MapSqlParameterSource params = new MapSqlParameterSource();
    String sql = "select * from hmc";
    int k=0;
    int k2=0;
    if (chDmg==1 || chMazak==1 || chHaas==1 || chSpiner==1){  sql += " where " ;
    
              if (chDmg==1 )   {sql += "manufacturer='Deckel Maho' " ; k++;}
              if (chMazak==1 ) { if(k==1) {sql +="or ";k=0;} sql += "manufacturer='Mazak' " ;k++;}
              if (chHaas==1 )  { if(k==1) {sql +="or ";k=0;} sql += "manufacturer='HAAS' " ;k++;}
              if (chSpiner==1 ){ if(k==1) {sql +="or ";k=0;} sql += "manufacturer='Spinner' " ;k++;}
              
    }
    if (chUSA==1 || chGermany==1) {sql += " AND ( " ;
      if (chUSA==1 )   {sql += "bench_location='USA' " ; k2++;}
   if (chGermany==1 )  { if(k2==1) {sql +="or ";k2=0;} sql += "bench_location='Germany' " ;k2++;}
    sql +=")";
    }
    
    
printInFile (sql);
//       select * from hmc where producer='Deckel Macho' and producer='Mazak'
  List<Vmc> listHmc  = jdbcTemplate.query(sql,  new VmcMapper());
    return listHmc;
    }
    
    
    
    
     @Override
    public List<Vmc> listHmc(Select s) {
        
//       MapSqlParameterSource params = new MapSqlParameterSource();
    String sql = "select * from vmc";
    int k1=0;
    int k2=0;

    //0
    if (s.getChDmg()==1 || s.getChMoriseiki()==1 ||  s.getChMazak()==1 || s.getChHaas()==1 || s.getChSpiner()==1 || s.getGrob()==1 ||
        s.getX()!="n" || s.getY()!="n" || s.getZ()!="n"
            ){  sql += " where (manufacturer is not null) " ;
            
            // 1
            if (s.getChDmg()==1 || s.getChMoriseiki()==1 || s.getChMazak()==1 || s.getChHaas()==1 || s.getChSpiner()==1 || s.getGrob()==1 ){
    sql += "and (" ;
              if (s.getChDmg()==1 )   {sql += "manufacturer='DECKEL MAHO' " ; k1++;}
              if (s.getChMoriseiki()==1 ) { if(k1==1) {sql +=" or ";k1=0;} sql += "manufacturer='MORI SEIKI' " ;k1++;}
              if (s.getChHaas()==1 )  { if(k1==1) {sql +=" or ";k1=0;} sql += "manufacturer='HAAS' " ;k1++;}
              if (s.getGrob()==1 )  { if(k1==1) {sql +=" or ";k1=0;} sql += "manufacturer='GROB' " ;k1++;}
              if (s.getChMazak()==1 ) { if(k1==1) {sql +=" or ";k1=0;} sql += "manufacturer='Mazak' " ;k1++;}
              if (s.getChSpiner()==1 ){ if(k1==1) {sql +=" or ";k1=0;} sql += "manufacturer='Spinner' " ;k1++;}
             sql += " ) " ; 
    } 
        
            //2
        if (!"n".equals(s.getX()) || !"n".equals(s.getY()) || !"n".equals(s.getZ())) {
            sql += " and ( " ;
    if (    !"n".equals(s.getX())) {sql += s.getX() ; k2++;}   
    if (    !"n".equals(s.getY()))  { if(k2==1) {sql +=" and ";k2=0;} sql += s.getY() ;k2++;}
    if (    !"n".equals(s.getZ()))  { if(k2==1) {sql +=" and ";k2=0;} sql += s.getZ() ;k2++;}
     sql += " ) " ; 
    }      
            
    }
//   select * from hmc where (producer is not null) and (producer='Deckel Macho' or producer='Mazak') and (bench_location='USA')
//   and (x_motion>200 ) and (y_motion between 100 and 500) and (y_motion < 300 );

//    if (chUSA==1 || chGermany==1) {sql += " AND ( " ;
//      if (chUSA==1 )   {sql += "bench_location='USA' " ; k2++;}
//   if (chGermany==1 )  { if(k2==1) {sql +="or ";k2=0;} sql += "bench_location='Germany' " ;k2++;}
//    sql +=")";
  
    
    
printInFile (sql);
//       select * from hmc where producer='Deckel Macho' and producer='Mazak'
  List<Vmc> listHmc  = jdbcTemplate.query(sql,  new VmcMapper());
    return listHmc;
    }
    
   @Override
    public List<Vmc> listVmc(Select select, int page) {
  
    List<Vmc> listHmc = listHmc(select); // get 
    
    int count = listHmc.size(); // nomber of products from question

    List <Vmc>  listHmc2 = new ArrayList<Vmc> ();

//add elements to list
int finishProd = page*NOMBER_PRODUCTS_ON_PAGE;
int startProd = page*NOMBER_PRODUCTS_ON_PAGE-NOMBER_PRODUCTS_ON_PAGE;

for(int i=0; i < listHmc.size(); i++) {
    if( (i >=startProd) && (i <finishProd) )
    listHmc2.add(listHmc.get(i));
}
    
setKol_vo_product(listHmc.size());
 kol_vo_page_itogo = (int) Math.ceil((double) count / (double) NOMBER_PRODUCTS_ON_PAGE);
//       setKol_vo_page_itogo();
     return listHmc2;
     
    }
    
    
    
    
    @Override
    public List<Vmc> listVmcLast4Machine() {
List<Vmc> listVmc = jdbcTemplate.query("select * from vmc", new VmcMapper());
  int kol_vo = listVmc.size();
  int kol_vo2 = kol_vo-4;

  List<Vmc> listVmc1 = new ArrayList<Vmc>(); 

  if(kol_vo >5){
      
  for(int i=1; i<=4; i++ ){
          Vmc v =    listVmc.get(kol_vo-i);
      listVmc1.add(v);
          printInFile(""+v.toString() +"\n");     
  }
  }
return  listVmc1;
    
    
    }
    
    @Override
    public void removeHmc(int id) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);
        jdbcTemplate.update("delete from vmc where id = :id", params);
    }

    
//          Here is a simple query for getting the number of rows in a relation:
//int rowCount = this.jdbcTemplate.queryForObject("select count(*) from t_actor", Integer.class);
    
//    Querying for a String:
//String lastName = this.jdbcTemplate.queryForObject(  "select last_name from t_actor where id = ?",
//                                                     new Object[]{1212L}, String.class);   
    
    
    
    
    
    
    public int getKol_vo_product() {
        return kol_vo_product;
    }

    public void setKol_vo_product(int kol_vo_product) {
        this.kol_vo_product = kol_vo_product;
    }

    public int getKol_vo_page_itogo() {
        return kol_vo_page_itogo;
    }

    public void setKol_vo_page_itogo(int kol_vo_page_itogo) {
        this.kol_vo_page_itogo = kol_vo_page_itogo;
    }

    public int getNOMBER_PRODUCTS_ON_PAGE() {
        return NOMBER_PRODUCTS_ON_PAGE;
    }


    
    
    
}
