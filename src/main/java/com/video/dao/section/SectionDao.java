/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.video.dao.section;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface SectionDao {
    
    public Section getSection(int id) ;
    
    public List<Section> getListSection() ;
    
     public boolean exist(String str) ;
     
     public int getId(String str) ;
}
