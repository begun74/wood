/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grinder.parser;


import com.grinder.dao.Grinder;
import com.mc.parser.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 *
 * @author Admin
 */
public class GrinderParser {

        private static InputStream in = null;
        private static  HSSFWorkbook wb = null; 
        private static  Sheet sheet = null; 
        private static  Iterator<Row> rowIterator  = null; 
        private static  Row row = null; 
        private static Iterator<Cell> cellIterator = null; 
        private static Cell cell = null; 

        
        
   public static Grinder parse(String file) {
		
		try {
			in = new FileInputStream(file);
			wb = new HSSFWorkbook(in);
		
		 sheet = wb.getSheetAt(0);
		 rowIterator = sheet.iterator();
                 
Grinder grinder = new Grinder();

//video.setId (intFromCell("1 id "));
grinder.setModel(stringFromCell("1 model"));
grinder.setType(stringFromCell("2 type"));
grinder.setCountry(stringFromCell("3 country"));
grinder.setTool(stringFromCell("4 tool"));
grinder.setDiametermax(intFromCell("5  diametermax"));
grinder.setDiametermin(intFromCell("6 diametermin  "));
grinder.setAngle(stringFromCell("7  angle"));
grinder.setPowersupply(stringFromCell("8 powersupply"));
grinder.setGrinderspeed(intFromCell("9 grinderspeed"));
grinder.setSpindlespeed(intFromCell("10 spindlespeed"));
grinder.setGrindingwhell(stringFromCell("11  grindingwhell"));
grinder.setTypeofthinings(stringFromCell("12  typeofthinings"));
grinder.setMachinesize(stringFromCell("13  machinesize"));
grinder.setPackegesize(stringFromCell("14  packegesize"));
grinder.setWeightnetto(intFromCell("15  weightnetto"));
grinder.setWeightbrutto(intFromCell(" 16 weightbrutto"));
grinder.setPrice(intFromCell("17  price"));
grinder.setPhoto1(stringFromCell("18 photo1"));
grinder.setPhoto2(stringFromCell("19 photo2"));
grinder.setPhoto3(stringFromCell("20 photo3"));
grinder.setPhototool1(stringFromCell("21 phototool1"));
grinder.setPhototool2(stringFromCell("22 phototool2"));
grinder.setPhototool3(stringFromCell("23 phototool3"));
grinder.setPhototool4(stringFromCell("24 phototool4"));
grinder.setVideo(stringFromCell("25 video"));


grinder.setDesigned(stringFromCell("26  designed"));
grinder.setDescription(stringFromCell("27  description"));
grinder.setStandardaccessories(stringFromCell("28  standardaccessories"));
grinder.setStandardequipment(stringFromCell("29  standardequipment"));
grinder.setOptionalaccessories(stringFromCell("30  optionalaccessories"));


// ,
// ,
// ,
// ,
// , 


return grinder;

        } catch (IOException e) {
                return null;
        }
} 
   
   
   
   private static String stringFromCell(String nomber){
                row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
//                    lathe.setType( cell.getStringCellValue() );
                String str = cell.getStringCellValue();
        printInFile ("№ "+ nomber +" : " +  str)  ;
                    return  str;
   }
   
   private static int intFromCell(String nomber){
                row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
//                    lathe.setType( cell.getStringCellValue() );
                String str = cell.getStringCellValue();
                   
  printInFile ("№ "+ nomber +" : " +  str)  ;

       try {
	        return Integer.parseInt(str);         
       } catch (Exception e) {
                return 0;
       } 
                 
   }


   
   
      // Print in File
     protected static void printInFile(String str){    // For Check 
          File file = new File("d:\\2\\VMC - parser - video.txt");
//            File file = new File("HMC exeption.txt");
        try {
        	FileWriter fileWriter = new FileWriter(file, true);
//            fileWriter.write("--- HmcParser ----> "+new Date()+"): \n");
            fileWriter.write(str + "\n");
        } catch (IOException ex) {
//            Logger.getLogger(ControllerMachine.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }  
   
   
}