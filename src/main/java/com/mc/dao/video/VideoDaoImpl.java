/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.video;

import com.mc.dao.vmc.Vmc;
import web.mc.PrintInFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.sql.DataSource;
//import org.springframework.jdbc.o
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Admin
 */
@Repository ("videoDaoImpl")
public class VideoDaoImpl extends PrintInFile implements VideoDao{

    
    private NamedParameterJdbcTemplate jdbcTemplateObject;

    
    private final int NOMBER_VIDEO_ON_PAGE = 5;
    private int kol_vo_video;
    private int kol_vo_page_itogo;
    
 @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplateObject = new NamedParameterJdbcTemplate(dataSource);
    }
    
    
    @Override
    public void addVideo(Video video) {
 BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(video); 
   String str=  "INSERT INTO video (section, data, headline, link_embed, url) "
                 + "VALUES (:section, :data, :headline, :link_embed, :url)";
printInFile( "Upload video 2.txt", "ok");
   jdbcTemplateObject.update(str, params); 
    }

    
     @Override
    public void editVideo(Video video) {
BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(video); 
String str= "UPDATE video set section=:section, data=:data, headline=:headline, link_embed=:link_embed, url=:url "
             + "where headline=:headline";
//printInFile( "url.txt", getUrl(video.getHeadline()));
jdbcTemplateObject.update(str, params);  
    }
       
    
    
    
    @Override
    public List<Video> getListVideo() {
      List<Video> list = jdbcTemplateObject.query("select * from video ORDER BY data DESC", new VideoMapper());
//  ASC - сортирует по возрастанию DESC - сортирует по убыванию  
    return  list; 
    }
    
    
    @Override
    public List<Video> getList10Video() {
      List<Video> listVideo = jdbcTemplateObject.query("select * from video ORDER BY data DESC", new VideoMapper());
// ORDER BY data DESC /  ASC - сортирует по возрастанию DESC - сортирует по убыванию  
      
    List<Video> list2  = new ArrayList<Video>(); 
int kol_vo = listVideo.size();

Random randomGenerator = new Random();

  if(kol_vo >11){
      
  for(int i=0; i<10; i++ ){
      int randomInt = randomGenerator.nextInt(kol_vo);
          Video v =    listVideo.get(randomInt);
      list2.add(v);
//          printInFile(""+v.toString() +"\n");     
  }
   return  list2; 
  }else{
      return listVideo;
  }
      
   
    }
    
    
    @Override
    public List<Video> getListVideo(String section, int pagevideo) {
//      List<Video> listVideo = jdbcTemplateObject.query("select * from video ORDER BY data DESC", new VideoMapper());
     List<Video> listVideo ; 
     
        if (section.equals("all")){
           listVideo = getListVideo();
        }else{
         listVideo = getListVideoFromSection(section);
        }
//  ASC - сортирует по возрастанию DESC - сортирует по убыванию  

    int count = listVideo.size(); // nomber of products from question

    List <Video>  listVideo2 = new ArrayList<Video> ();

//add elements to list
int startVideo = pagevideo*NOMBER_VIDEO_ON_PAGE-NOMBER_VIDEO_ON_PAGE;
int finishVideo = pagevideo*NOMBER_VIDEO_ON_PAGE;

for(int i=0; i < listVideo.size(); i++) {
    if( (i >=startVideo) && (i <finishVideo) )
    listVideo2.add(listVideo.get(i));
}
    
setKol_vo_video(listVideo.size());
 kol_vo_page_itogo = (int) Math.ceil((double) count / (double) NOMBER_VIDEO_ON_PAGE);
//       setKol_vo_page_itogo();

    return  listVideo2; 
    }
    
    @Override
     public List<Video> getListVideoFromSection(String section){
           MapSqlParameterSource params = new MapSqlParameterSource("section", section);
      List<Video> list = jdbcTemplateObject.query("select * from video where section=:section ORDER BY data DESC",params, new VideoMapper());
//  ASC - сортирует по возрастанию DESC - сортирует по убыванию  
    return  list; 
    }
    
     
    @Override
    public List<Video> getListVideoFromRequest(String word) {
//    MapSqlParameterSource params = new MapSqlParameterSource("word", word);
List<Video> list = jdbcTemplateObject.query("select * from video where headline LIKE '%"+word+"%' ORDER BY data DESC",new VideoMapper());

   return list;  
    }
    
     
    @Override
    public Video getVideo(int id) {
      MapSqlParameterSource params = new MapSqlParameterSource("id", id);
      Video video = jdbcTemplateObject.queryForObject("select * from video where id=:id",params, new VideoMapper());

    return  video; 
    }

    
    
    
    @Override
    public boolean existVideo(Video video) {
            MapSqlParameterSource params = new MapSqlParameterSource("headline", video.getHeadline());
                Video video2=null;         
 try {
  video2 = jdbcTemplateObject.queryForObject("select * from video where headline=:headline", params,  new VideoMapper());
} catch (Exception e) {
}    
  if(video2!=null) {
//      printInFile("1 t= " + true);
      return true;
  }else {
//      printInFile("1 f= " + false);
      return false;
  }
    }


    
    
   
//    private String getUrl (String str){
////        String str2="";
//        
////       printInFile( "url2.txt", str);
//       String str1 = str.replaceAll(" ", "-");
////       printInFile( "url2.txt", str1);
//       String str2 = str1.replaceAll("'", "-");
////       printInFile( "url2.txt", str2);
//       String str3 = str2.replaceAll(":", "-");
////       printInFile( "url2.txt", str3);
//       String str4 = str3.replaceAll("\\.", "-");
////       printInFile( "url2.txt", str4);
//        
//        
//        return str4;
//    }
//    

    public int getKol_vo_video() {
        return kol_vo_video;
    }

    public void setKol_vo_video(int kol_vo_video) {
        this.kol_vo_video = kol_vo_video;
    }

    public int getKol_vo_page_itogo() {
        return kol_vo_page_itogo;
    }

    public void setKol_vo_page_itogo(int kol_vo_page_itogo) {
        this.kol_vo_page_itogo = kol_vo_page_itogo;
    }

    
}
