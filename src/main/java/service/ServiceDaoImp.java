/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.mc.dao.video.Video;
import com.mc.dao.video.VideoDaoImpl;
import com.mc.dao.vmc.Vmc;
import com.mc.dao.vmc.VmcDaoImpl;
import web.mc.PrintInFile;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;





@Service ("serviceDaoImp")
public class ServiceDaoImp extends PrintInFile implements ServiceDao{

    @Autowired
    VmcDaoImpl vmcDaoImpl;
    
    @Autowired
    VideoDaoImpl videoDaoImpl;
    
    
    @Transactional
    @Override
    public void addVmc(Vmc vmc) {

//    1. Add Vmc
        vmcDaoImpl.addVmc(vmc);
        
//    2. Add Video    
        Video video = new Video();
        video.setHeadline("Video Test");
        video.setSection("News");
        video.setLink_embed(vmc.getVideo1());
        video.setData("2015-06-23");
        
        
        videoDaoImpl.addVideo(video);
        
//        printInFile("test", video.toString());
    }
    
}
