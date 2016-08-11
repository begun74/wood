/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.producerfilter;

/**
 *
 * @author Admin
 */
public class ProducerFilter {
  
  private String producer;  
  private int num;  

    public ProducerFilter() {
    }

    public ProducerFilter(String producer, int num) {
        this.producer = producer;
        this.num = num;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ProducerFilter{" + "producer=" + producer + ", num=" + num + '}';
    }
  
  
  
    
}

//CREATE TABLE IF NOT EXISTS `mc`.`producer_filter` (
//  `producer` VARCHAR(255) NOT NULL,
//  `num` INT(11) NULL,
//  PRIMARY KEY (`producer`),
//  UNIQUE INDEX `producer_UNIQUE` (`producer` ASC))
//ENGINE = InnoDB
//DEFAULT CHARACTER SET = utf8;