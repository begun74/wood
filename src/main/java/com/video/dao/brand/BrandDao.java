package com.video.dao.brand;

import java.util.List;




public interface BrandDao  {
  
   public Brand getBrand(int id);
   
    public int getId(String str) ;
    
   public boolean exist(String str);
   
   public List <Brand> getListBrands();
    
    
}