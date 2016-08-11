/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.enters;

/**
 *
 * @author Admin
 */
public interface EntersDao {
    
  public boolean getExist(String ip) ; 
  public int  getNombersEnters() ;
  public void  addEnters(Enters enters);
  public void  addEnters(String str1, String str2);
            
}
