package com.mc.dao.vmc;

import com.mc.shopcart.Product;


/**
 * Created by Echoes on 26.12.2015.
 */

//@Entity
//@Table(name = "workbench")
public class Vmc implements Product {

    private int id;
    private String productid;
    private String type; 
    private String typeru; 
    private String typeurl; 
    private String model;
    private String modelurl;
    private String manufacturer;
    private String country;
    private String countryru;
    private String cncsystem;
    private String cncsystemfull;
    private int year;
    private String machinecondition;
    private String machineconditionru;
    private String machinelocation;
    private String machinelocationru;
    
    private String axiscount;
    private int xmotion;
    private int ymotion;
    private int zmotion;
    
    private int xtablesize;
    private int ytablesize;
    private int tablerectangleload;
    
    private String tableroundsize;
    private int tableroundload;
    
    private String spindlenose;
    private int spindlespeed;  // Spindle speed
    private String spindlepower;

    private int toolcount;
    private int toolmaxdiameter;
    private int toolmaxweight;
    private int toolmaxlength;
    
    private String toolchangingtooltotool;
    private String toolchangingchiptochip;
    private String positioningaccuracy;   

    private String spindleruntime;
    private String machineruntime;
    
    private int price;
    private String photo1;
    private String photo2;
    private String photo3;
    private String photo4;
    private String photo5;
    private String info1en;
    private String info2ru;
    
    private String video1;
    private String video2;
    private String video3;
    
    private String sold;
    

    public Vmc() {
    }

    public Vmc(String productid, String type, String typeru, String typeurl, String model, String modelurl, String manufacturer, String country, String countryru, String cncsystem, String cncsystemfull, int year, String machinecondition, String machineconditionru, String machinelocation, String machinelocationru, String axiscount, int xmotion, int ymotion, int zmotion, int xtablesize, int ytablesize, int tablerectangleload, String tableroundsize, int tableroundload, String spindlenose, int spindlespeed, String spindlepower, int toolcount, int toolmaxdiameter, int toolmaxweight, int toolmaxlength, String toolchangingtooltotool, String toolchangingchiptochip, String positioningaccuracy, String spindleruntime, String machineruntime, int price, String photo1, String photo2, String photo3, String photo4, String photo5, String info1en, String info2ru, String video1, String video2, String video3, String sold) {
        this.productid = productid;
        this.type = type;
        this.typeru = typeru;
        this.typeurl = typeurl;
        this.model = model;
        this.modelurl = modelurl;
        this.manufacturer = manufacturer;
        this.country = country;
        this.countryru = countryru;
        this.cncsystem = cncsystem;
        this.cncsystemfull = cncsystemfull;
        this.year = year;
        this.machinecondition = machinecondition;
        this.machineconditionru = machineconditionru;
        this.machinelocation = machinelocation;
        this.machinelocationru = machinelocationru;
        this.axiscount = axiscount;
        this.xmotion = xmotion;
        this.ymotion = ymotion;
        this.zmotion = zmotion;
        this.xtablesize = xtablesize;
        this.ytablesize = ytablesize;
        this.tablerectangleload = tablerectangleload;
        this.tableroundsize = tableroundsize;
        this.tableroundload = tableroundload;
        this.spindlenose = spindlenose;
        this.spindlespeed = spindlespeed;
        this.spindlepower = spindlepower;
        this.toolcount = toolcount;
        this.toolmaxdiameter = toolmaxdiameter;
        this.toolmaxweight = toolmaxweight;
        this.toolmaxlength = toolmaxlength;
        this.toolchangingtooltotool = toolchangingtooltotool;
        this.toolchangingchiptochip = toolchangingchiptochip;
        this.positioningaccuracy = positioningaccuracy;
        this.spindleruntime = spindleruntime;
        this.machineruntime = machineruntime;
        this.price = price;
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.photo4 = photo4;
        this.photo5 = photo5;
        this.info1en = info1en;
        this.info2ru = info2ru;
        this.video1 = video1;
        this.video2 = video2;
        this.video3 = video3;
        this.sold = sold;
    }

    public Vmc(int id, String productid, String type, String typeru, String typeurl, String model, String modelurl, String manufacturer, String country, String countryru, String cncsystem, String cncsystemfull, int year, String machinecondition, String machineconditionru, String machinelocation, String machinelocationru, String axiscount, int xmotion, int ymotion, int zmotion, int xtablesize, int ytablesize, int tablerectangleload, String tableroundsize, int tableroundload, String spindlenose, int spindlespeed, String spindlepower, int toolcount, int toolmaxdiameter, int toolmaxweight, int toolmaxlength, String toolchangingtooltotool, String toolchangingchiptochip, String positioningaccuracy, String spindleruntime, String machineruntime, int price, String photo1, String photo2, String photo3, String photo4, String photo5, String info1en, String info2ru, String video1, String video2, String video3, String sold) {
        this.id = id;
        this.productid = productid;
        this.type = type;
        this.typeru = typeru;
        this.typeurl = typeurl;
        this.model = model;
        this.modelurl = modelurl;
        this.manufacturer = manufacturer;
        this.country = country;
        this.countryru = countryru;
        this.cncsystem = cncsystem;
        this.cncsystemfull = cncsystemfull;
        this.year = year;
        this.machinecondition = machinecondition;
        this.machineconditionru = machineconditionru;
        this.machinelocation = machinelocation;
        this.machinelocationru = machinelocationru;
        this.axiscount = axiscount;
        this.xmotion = xmotion;
        this.ymotion = ymotion;
        this.zmotion = zmotion;
        this.xtablesize = xtablesize;
        this.ytablesize = ytablesize;
        this.tablerectangleload = tablerectangleload;
        this.tableroundsize = tableroundsize;
        this.tableroundload = tableroundload;
        this.spindlenose = spindlenose;
        this.spindlespeed = spindlespeed;
        this.spindlepower = spindlepower;
        this.toolcount = toolcount;
        this.toolmaxdiameter = toolmaxdiameter;
        this.toolmaxweight = toolmaxweight;
        this.toolmaxlength = toolmaxlength;
        this.toolchangingtooltotool = toolchangingtooltotool;
        this.toolchangingchiptochip = toolchangingchiptochip;
        this.positioningaccuracy = positioningaccuracy;
        this.spindleruntime = spindleruntime;
        this.machineruntime = machineruntime;
        this.price = price;
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.photo4 = photo4;
        this.photo5 = photo5;
        this.info1en = info1en;
        this.info2ru = info2ru;
        this.video1 = video1;
        this.video2 = video2;
        this.video3 = video3;
        this.sold = sold;
    }

    
    
    
    
    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTyperu() {
        return typeru;
    }

    public void setTyperu(String typeru) {
        this.typeru = typeru;
    }

    @Override
    public String getTypeurl() {
        return typeurl;
    }

    public void setTypeurl(String typeurl) {
        this.typeurl = typeurl;
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getModelurl() {
        return modelurl;
    }

    public void setModelurl(String modelurl) {
        this.modelurl = modelurl;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryru() {
        return countryru;
    }

    public void setCountryru(String countryru) {
        this.countryru = countryru;
    }

    public String getCncsystem() {
        return cncsystem;
    }

    public void setCncsystem(String cncsystem) {
        this.cncsystem = cncsystem;
    }

    public String getCncsystemfull() {
        return cncsystemfull;
    }

    public void setCncsystemfull(String cncsystemfull) {
        this.cncsystemfull = cncsystemfull;
    }

    @Override
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMachinecondition() {
        return machinecondition;
    }

    public void setMachinecondition(String machinecondition) {
        this.machinecondition = machinecondition;
    }

    public String getMachineconditionru() {
        return machineconditionru;
    }

    public void setMachineconditionru(String machineconditionru) {
        this.machineconditionru = machineconditionru;
    }

    @Override
    public String getMachinelocation() {
        return machinelocation;
    }

    public void setMachinelocation(String machinelocation) {
        this.machinelocation = machinelocation;
    }

    public String getMachinelocationru() {
        return machinelocationru;
    }

    public void setMachinelocationru(String machinelocationru) {
        this.machinelocationru = machinelocationru;
    }

    public String getAxiscount() {
        return axiscount;
    }

    public void setAxiscount(String axiscount) {
        this.axiscount = axiscount;
    }

    public int getXmotion() {
        return xmotion;
    }

    public void setXmotion(int xmotion) {
        this.xmotion = xmotion;
    }

    public int getYmotion() {
        return ymotion;
    }

    public void setYmotion(int ymotion) {
        this.ymotion = ymotion;
    }

    public int getZmotion() {
        return zmotion;
    }

    public void setZmotion(int zmotion) {
        this.zmotion = zmotion;
    }

    public int getXtablesize() {
        return xtablesize;
    }

    public void setXtablesize(int xtablesize) {
        this.xtablesize = xtablesize;
    }

    public int getYtablesize() {
        return ytablesize;
    }

    public void setYtablesize(int ytablesize) {
        this.ytablesize = ytablesize;
    }

    public int getTablerectangleload() {
        return tablerectangleload;
    }

    public void setTablerectangleload(int tablerectangleload) {
        this.tablerectangleload = tablerectangleload;
    }

    public String getTableroundsize() {
        return tableroundsize;
    }

    public void setTableroundsize(String tableroundsize) {
        this.tableroundsize = tableroundsize;
    }

    public int getTableroundload() {
        return tableroundload;
    }

    public void setTableroundload(int tableroundload) {
        this.tableroundload = tableroundload;
    }

    public String getSpindlenose() {
        return spindlenose;
    }

    public void setSpindlenose(String spindlenose) {
        this.spindlenose = spindlenose;
    }

    public int getSpindlespeed() {
        return spindlespeed;
    }

    public void setSpindlespeed(int spindlespeed) {
        this.spindlespeed = spindlespeed;
    }

    public String getSpindlepower() {
        return spindlepower;
    }

    public void setSpindlepower(String spindlepower) {
        this.spindlepower = spindlepower;
    }

    public int getToolcount() {
        return toolcount;
    }

    public void setToolcount(int toolcount) {
        this.toolcount = toolcount;
    }

    public int getToolmaxdiameter() {
        return toolmaxdiameter;
    }

    public void setToolmaxdiameter(int toolmaxdiameter) {
        this.toolmaxdiameter = toolmaxdiameter;
    }

    public int getToolmaxweight() {
        return toolmaxweight;
    }

    public void setToolmaxweight(int toolmaxweight) {
        this.toolmaxweight = toolmaxweight;
    }

    public int getToolmaxlength() {
        return toolmaxlength;
    }

    public void setToolmaxlength(int toolmaxlength) {
        this.toolmaxlength = toolmaxlength;
    }

    public String getToolchangingtooltotool() {
        return toolchangingtooltotool;
    }

    public void setToolchangingtooltotool(String toolchangingtooltotool) {
        this.toolchangingtooltotool = toolchangingtooltotool;
    }

    public String getToolchangingchiptochip() {
        return toolchangingchiptochip;
    }

    public void setToolchangingchiptochip(String toolchangingchiptochip) {
        this.toolchangingchiptochip = toolchangingchiptochip;
    }

    public String getPositioningaccuracy() {
        return positioningaccuracy;
    }

    public void setPositioningaccuracy(String positioningaccuracy) {
        this.positioningaccuracy = positioningaccuracy;
    }

    public String getSpindleruntime() {
        return spindleruntime;
    }

    public void setSpindleruntime(String spindleruntime) {
        this.spindleruntime = spindleruntime;
    }

    public String getMachineruntime() {
        return machineruntime;
    }

    public void setMachineruntime(String machineruntime) {
        this.machineruntime = machineruntime;
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

    public String getPhoto4() {
        return photo4;
    }

    public void setPhoto4(String photo4) {
        this.photo4 = photo4;
    }

    public String getPhoto5() {
        return photo5;
    }

    public void setPhoto5(String photo5) {
        this.photo5 = photo5;
    }

    public String getInfo1en() {
        return info1en;
    }

    public void setInfo1en(String info1en) {
        this.info1en = info1en;
    }

    public String getInfo2ru() {
        return info2ru;
    }

    public void setInfo2ru(String info2ru) {
        this.info2ru = info2ru;
    }

    public String getVideo1() {
        return video1;
    }

    public void setVideo1(String video1) {
        this.video1 = video1;
    }

    public String getVideo2() {
        return video2;
    }

    public void setVideo2(String video2) {
        this.video2 = video2;
    }

    public String getVideo3() {
        return video3;
    }

    public void setVideo3(String video3) {
        this.video3 = video3;
    }

    public String getSold() {
        return sold;
    }

    public void setSold(String sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Vmc{" + "id=" + id + ", productid=" + productid + ", type=" + type + ", typeru=" + typeru + ", typeurl=" + typeurl + ", model=" + model + ", modelurl=" + modelurl + ", manufacturer=" + manufacturer + ", country=" + country + ", countryru=" + countryru + ", cncsystem=" + cncsystem + ", cncsystemfull=" + cncsystemfull + ", year=" + year + ", machinecondition=" + machinecondition + ", machineconditionru=" + machineconditionru + ", machinelocation=" + machinelocation + ", machinelocationru=" + machinelocationru + ", axiscount=" + axiscount + ", xmotion=" + xmotion + ", ymotion=" + ymotion + ", zmotion=" + zmotion + ", xtablesize=" + xtablesize + ", ytablesize=" + ytablesize + ", tablerectangleload=" + tablerectangleload + ", tableroundsize=" + tableroundsize + ", tableroundload=" + tableroundload + ", spindlenose=" + spindlenose + ", spindlespeed=" + spindlespeed + ", spindlepower=" + spindlepower + ", toolcount=" + toolcount + ", toolmaxdiameter=" + toolmaxdiameter + ", toolmaxweight=" + toolmaxweight + ", toolmaxlength=" + toolmaxlength + ", toolchangingtooltotool=" + toolchangingtooltotool + ", toolchangingchiptochip=" + toolchangingchiptochip + ", positioningaccuracy=" + positioningaccuracy + ", spindleruntime=" + spindleruntime + ", machineruntime=" + machineruntime + ", price=" + price + ", photo1=" + photo1 + ", photo2=" + photo2 + ", photo3=" + photo3 + ", photo4=" + photo4 + ", photo5=" + photo5 + ", info1en=" + info1en + ", info2ru=" + info2ru + ", video1=" + video1 + ", video2=" + video2 + ", video3=" + video3 + ", sold=" + sold + '}';
    }


    
    

    
    
    
    }