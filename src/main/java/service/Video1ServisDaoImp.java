/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.video.dao.brand.Brand;
import com.video.dao.brand.BrandDaoImp;
import com.video.dao.section.Section;
import com.video.dao.section.SectionDaoImp;
import com.video.dao.video2.Video1;
import com.video.dao.video2.VideoForSql;
import com.video.dao.video2.VideoForSqlDaoImp;
import com.video.dao.video2.VideoFromExcel;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service (value = "video1ServisDaoImp")
public class Video1ServisDaoImp implements Video1ServisDao {

    
    @Autowired
    BrandDaoImp brandDaoImp;
    
    @Autowired
    SectionDaoImp sectionDaoImp;
    
    @Autowired
    VideoForSqlDaoImp videoForSqlDaoImp;
    
    @Override
    public Video1 getVideo1(int id) {
        
  VideoForSql video2 = videoForSqlDaoImp.getVideo2(id);     
        Brand brand = brandDaoImp.getBrand(video2.getBrand_id());
        Section section = sectionDaoImp.getSection(video2.getSection_id());
        
     Video1 video1 = new Video1(video2); // defined    all parameters Besides section and brand
            video1.setSection(section);
            video1.setBrand(brand);
    
    return video1;
    
    }

    @Override
    public String addVideo1(VideoFromExcel videoFromExcel) {
 

//      1 - brand
   String brand = videoFromExcel.getBrand();
   int id_brand = 0 ;
     if( brandDaoImp.exist(brand) ) {
         id_brand =  brandDaoImp.getId(brand);
     }else{
           return "Video do not added 1(brand)";
     }
 
//    2  - id_section
     int id_section = 0;
     String section = videoFromExcel.getSection();
         if( sectionDaoImp.exist(section) ) {
             id_section =  sectionDaoImp.getId(section);
         } else{
           return "Video do not added 2 (section)";
         }
    
         VideoForSql videoForSql = new VideoForSql(videoFromExcel); // added :  data ,headline ,url_embed    
         videoForSql.setBrand_id(id_brand);
         videoForSql.setSection_id(id_section);
         
       videoForSqlDaoImp.addVideoForSqlInDB(videoForSql) ;
         
         
   return "Video added succesfull!";
    }
    
}
