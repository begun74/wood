/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.parser;


import com.mc.dao.video.Video;
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
public class VideoParser {

        private static InputStream in = null;
        private static  HSSFWorkbook wb = null; 
        private static  Sheet sheet = null; 
        private static  Iterator<Row> rowIterator  = null; 
        private static  Row row = null; 
        private static Iterator<Cell> cellIterator = null; 
        private static Cell cell = null; 

        
        
   public static Video parse(String file) {
		
		try {
			in = new FileInputStream(file);
			wb = new HSSFWorkbook(in);
		
			sheet = wb.getSheetAt(0);
			rowIterator = sheet.iterator();
                 
Video video = new Video();

//video.setId (intFromCell("1 id "));
video.setData(stringFromCell("1 data"));
video.setSection(stringFromCell("2 section"));
video.setHeadline(stringFromCell("3 Headline"));
video.setLink_embed(stringFromCell("4 Link_embed"));
//video.setUrl(stringFromCell("4 Url"));

return video;

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
//  printInFile ("№ "+ nomber +" : " +  str)  ;
                    return  str;
   }
   
   private static int intFromCell(String nomber){
                row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
//                    lathe.setType( cell.getStringCellValue() );
                String str = cell.getStringCellValue();
                   
//  printInFile ("№ "+ nomber +" : " +  str)  ;

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