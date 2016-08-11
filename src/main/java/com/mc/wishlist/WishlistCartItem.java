/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.wishlist;

import com.mc.dao.vmc.Vmc;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
//@Service
public class WishlistCartItem {
    
Vmc vmc;
short quantity;


public WishlistCartItem(Vmc hmc) {
this.vmc =  hmc;
quantity = 1;
}

public Vmc  getProduct() {
return  vmc;
}


public short getQuantity() {
return quantity;
}


public void setQuantity(short quantity) {
this.quantity = quantity;
}


public void incrementQuantity() {
quantity++;
}


public void decrementQuantity() {
quantity--;
}


public double getTotal() {
double amount = 0;
//amount = (this.getQuantity() *  hmc.getCost().doubleValue());
amount = (this.getQuantity() *  vmc.getPrice());
return amount;
}  

    @Override
    public String toString() {
        return "CompareCartItem{" + "hmc=" + vmc + ", quantity=" + quantity + '}';
    }



}
