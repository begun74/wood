/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grinder.dao;

import com.mc.shopcart.Product;

/**
 *
 * @author Admin
 */
public class Grinder implements Product{
  
  private int id;
  private String model;
  private String type;
  private String country;
  private String tool;
  private int diametermax;
  private int diametermin;
  private String angle;
  private String powersupply;
  private int grinderspeed;
  private int spindlespeed;
  private String grindingwhell;
  private String typeofthinings;
  private String machinesize;
  private String packegesize;
  private int weightnetto;
  private int weightbrutto;
  private int price;
  private String photo1;
  private String photo2;
  private String photo3;
  private String phototool1;
  private String phototool2;
  private String phototool3;
  private String phototool4;
  private String video;
  private String designed;
  private String description;
  private String standardaccessories;
  private String standardequipment;
  private String optionalaccessories; 

    public Grinder() {
    }

    public Grinder(String model, String type, String country, String tool, int diametermax, int diametermin, String angle, String powersupply, int grinderspeed, int spindlespeed, String grindingwhell, String typeofthinings, String machinesize, String packegesize, int weightnetto, int weightbrutto, int price, String photo1, String photo2, String photo3, String phototool1, String phototool2, String phototool3, String phototool4, String video, String designed, String description, String standardaccessories, String standardequipment, String optionalaccessories) {
        this.model = model;
        this.type = type;
        this.country = country;
        this.tool = tool;
        this.diametermax = diametermax;
        this.diametermin = diametermin;
        this.angle = angle;
        this.powersupply = powersupply;
        this.grinderspeed = grinderspeed;
        this.spindlespeed = spindlespeed;
        this.grindingwhell = grindingwhell;
        this.typeofthinings = typeofthinings;
        this.machinesize = machinesize;
        this.packegesize = packegesize;
        this.weightnetto = weightnetto;
        this.weightbrutto = weightbrutto;
        this.price = price;
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.phototool1 = phototool1;
        this.phototool2 = phototool2;
        this.phototool3 = phototool3;
        this.phototool4 = phototool4;
        this.video = video;
        this.designed = designed;
        this.description = description;
        this.standardaccessories = standardaccessories;
        this.standardequipment = standardequipment;
        this.optionalaccessories = optionalaccessories;
    }

    public Grinder(int id, String model, String type, String country, String tool, int diametermax, int diametermin, String angle, String powersupply, int grinderspeed, int spindlespeed, String grindingwhell, String typeofthinings, String machinesize, String packegesize, int weightnetto, int weightbrutto, int price, String photo1, String photo2, String photo3, String phototool1, String phototool2, String phototool3, String phototool4, String video, String designed, String description, String standardaccessories, String standardequipment, String optionalaccessories) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.country = country;
        this.tool = tool;
        this.diametermax = diametermax;
        this.diametermin = diametermin;
        this.angle = angle;
        this.powersupply = powersupply;
        this.grinderspeed = grinderspeed;
        this.spindlespeed = spindlespeed;
        this.grindingwhell = grindingwhell;
        this.typeofthinings = typeofthinings;
        this.machinesize = machinesize;
        this.packegesize = packegesize;
        this.weightnetto = weightnetto;
        this.weightbrutto = weightbrutto;
        this.price = price;
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.phototool1 = phototool1;
        this.phototool2 = phototool2;
        this.phototool3 = phototool3;
        this.phototool4 = phototool4;
        this.video = video;
        this.designed = designed;
        this.description = description;
        this.standardaccessories = standardaccessories;
        this.standardequipment = standardequipment;
        this.optionalaccessories = optionalaccessories;
    }

    //@Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //@Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //@Override
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public int getDiametermax() {
        return diametermax;
    }

    public void setDiametermax(int diametermax) {
        this.diametermax = diametermax;
    }

    public int getDiametermin() {
        return diametermin;
    }

    public void setDiametermin(int diametermin) {
        this.diametermin = diametermin;
    }

    public String getAngle() {
        return angle;
    }

    public void setAngle(String angle) {
        this.angle = angle;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public void setPowersupply(String powersupply) {
        this.powersupply = powersupply;
    }

    public int getGrinderspeed() {
        return grinderspeed;
    }

    public void setGrinderspeed(int grinderspeed) {
        this.grinderspeed = grinderspeed;
    }

    public int getSpindlespeed() {
        return spindlespeed;
    }

    public void setSpindlespeed(int spindlespeed) {
        this.spindlespeed = spindlespeed;
    }

    public String getGrindingwhell() {
        return grindingwhell;
    }

    public void setGrindingwhell(String grindingwhell) {
        this.grindingwhell = grindingwhell;
    }

    public String getTypeofthinings() {
        return typeofthinings;
    }

    public void setTypeofthinings(String typeofthinings) {
        this.typeofthinings = typeofthinings;
    }

    public String getMachinesize() {
        return machinesize;
    }

    public void setMachinesize(String machinesize) {
        this.machinesize = machinesize;
    }

    public String getPackegesize() {
        return packegesize;
    }

    public void setPackegesize(String packegesize) {
        this.packegesize = packegesize;
    }

    public int getWeightnetto() {
        return weightnetto;
    }

    public void setWeightnetto(int weightnetto) {
        this.weightnetto = weightnetto;
    }

    public int getWeightbrutto() {
        return weightbrutto;
    }

    public void setWeightbrutto(int weightbrutto) {
        this.weightbrutto = weightbrutto;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getPhoto1() {
        return photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    public String getPhoto2() {
        return photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2;
    }

    public String getPhoto3() {
        return photo3;
    }

    public void setPhoto3(String photo3) {
        this.photo3 = photo3;
    }

    public String getPhototool1() {
        return phototool1;
    }

    public void setPhototool1(String phototool1) {
        this.phototool1 = phototool1;
    }

    public String getPhototool2() {
        return phototool2;
    }

    public void setPhototool2(String phototool2) {
        this.phototool2 = phototool2;
    }

    public String getPhototool3() {
        return phototool3;
    }

    public void setPhototool3(String phototool3) {
        this.phototool3 = phototool3;
    }

    public String getPhototool4() {
        return phototool4;
    }

    public void setPhototool4(String phototool4) {
        this.phototool4 = phototool4;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getDesigned() {
        return designed;
    }

    public void setDesigned(String designed) {
        this.designed = designed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStandardaccessories() {
        return standardaccessories;
    }

    public void setStandardaccessories(String standardaccessories) {
        this.standardaccessories = standardaccessories;
    }

    public String getStandardequipment() {
        return standardequipment;
    }

    public void setStandardequipment(String standardequipment) {
        this.standardequipment = standardequipment;
    }

    public String getOptionalaccessories() {
        return optionalaccessories;
    }

    public void setOptionalaccessories(String optionalaccessories) {
        this.optionalaccessories = optionalaccessories;
    }

    @Override
    public String toString() {
        return "Grinder{" + "id=" + id + ", model=" + model + ", type=" + type + ", country=" + country + ", tool=" + tool + ", diametermax=" + diametermax + ", diametermin=" + diametermin + ", angle=" + angle + ", powersupply=" + powersupply + ", grinderspeed=" + grinderspeed + ", spindlespeed=" + spindlespeed + ", grindingwhell=" + grindingwhell + ", typeofthinings=" + typeofthinings + ", machinesize=" + machinesize + ", packegesize=" + packegesize + ", weightnetto=" + weightnetto + ", weightbrutto=" + weightbrutto + ", price=" + price + ", photo1=" + photo1 + ", photo2=" + photo2 + ", photo3=" + photo3 + ", phototool1=" + phototool1 + ", phototool2=" + phototool2 + ", phototool3=" + phototool3 + ", phototool4=" + phototool4 + ", video=" + video + ", designed=" + designed + ", description=" + description + ", standardaccessories=" + standardaccessories + ", standardequipment=" + standardequipment + ", optionalaccessories=" + optionalaccessories + '}';
    }

    
    
    @Override
    public String getProductid() {
 return ""+id;
    }

    @Override
    public int getYear() {
   return 0;
    }

    @Override
    public String getTypeurl() {
 return "yyyyyyy";
    }

    @Override
    public String getModelurl() {
  return "tttttt";
    }

    @Override
    public String getMachinelocation() {
  return "Ukrain";
    }

  
  
  
}
