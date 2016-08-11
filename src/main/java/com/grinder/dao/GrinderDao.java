/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grinder.dao;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface GrinderDao {
  
    
//  public boolean getExist(String ip) ; 
  public Grinder  getGrinder(int id) ;
  public List<Grinder>  getListGrinders() ;
   public List<Grinder> getListGrinders(int drill, int mill);
  public void  addGrinder(Grinder grinder);
    
}
