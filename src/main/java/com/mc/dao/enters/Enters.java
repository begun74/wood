/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.dao.enters;

import web.mc.PrintInFile;

/**
 *
 * @author Admin
 */
public class Enters {
  

private int id;
private String datetime;
private String ip;

    public Enters() {
    }

    public Enters(String datetime, String ip) {
        this.datetime = datetime;
        this.ip = ip;
    }

    public Enters(int id, String datetime, String ip) {
        this.id = id;
        this.datetime = datetime;
        this.ip = ip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Enters{" + "id=" + id + ", datetime=" + datetime + ", ip=" + ip + '}';
    }


    
    
}
