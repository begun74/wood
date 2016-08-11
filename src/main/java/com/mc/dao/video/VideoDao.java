/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.video;

import java.util.List;



public interface VideoDao {
    
    public void addVideo(Video video);
    public void editVideo(Video video);
  
    public List<Video> getListVideo();
    public List<Video> getList10Video();
    
    
    public List<Video> getListVideo(String section,int pagevideo) ;
    public List<Video> getListVideoFromRequest(String word);
    public Video getVideo(int id);
    public List<Video> getListVideoFromSection(String section);
    
    public boolean existVideo(Video video);
    
}
