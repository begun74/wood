/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.orders;

import com.mc.dao.message.Message;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface OrderDAO {
    
    public void addOrder(Order order);
    public void addOrderFromContact(Message message);
    public int getNombers();
    public List<Order> getListOrders();
    public void requestIsProcessed(int id);
     
    
}
