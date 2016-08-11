/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.wishlist;

import com.mc.dao.vmc.Vmc;
import com.mc.shopcart.ShoppingCartItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
//@Service
public class WishlistCart {
    
   List<WishlistCartItem> items;
int numberOfItems;
//double total;
 

        public WishlistCart() {
            items = new ArrayList<WishlistCartItem>();
            numberOfItems = 0;
//            total = 0;
        }
  

        public synchronized void addItem(Vmc hmc) {

                        boolean newItem = true;
                        for (WishlistCartItem scItem : items) {
                        if (scItem.getProduct().getId() == hmc.getId()) {
                        newItem = false;
//                        scItem.incrementQuantity();
                }
                }

                if (newItem) {
                WishlistCartItem scItem = new WishlistCartItem(hmc);
                items.add(scItem);
                }
        }  

        
        
     public synchronized void update (Vmc hmc, String quantity) {
           
               
 short qty = -1;
                // cast quantity as short
                qty = Short.parseShort(quantity);
                if (qty >= 0) {
                WishlistCartItem item = null;
                for (WishlistCartItem scItem : items) {
                if (scItem.getProduct().getId() == hmc.getId()) {
                if (qty != 0) {
                // set item quantity to new value
                scItem.setQuantity(qty);
                } else {
                // if quantity equals 0, save item and break
                item = scItem;
                break;
                }
                }
                }

                if (item != null) {
                // remove from cart

                items.remove(item);
                }
                }
     }
     
        
        
        
        
        
        
        
public synchronized int getNumberOfItems() {

numberOfItems = 0;
for (WishlistCartItem scItem : items) {
numberOfItems += scItem.getQuantity();
}
return numberOfItems;
}

    public List<WishlistCartItem> getItems() {
        return items;
    }
    
        
        
        
}