
package com.mc.parser;


import com.mc.dao.vmc.Vmc;
import static com.mc.parser.VideoParser.printInFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


public class VmcParser {
    
        private static InputStream in = null;
        private static  HSSFWorkbook wb = null; 
        private static  Sheet sheet = null; 
        private static  Iterator<Row> rowIterator  = null; 
        private static  Row row = null; 
        private static Iterator<Cell> cellIterator = null; 
        private static Cell cell = null; 

    
    
    
   public static Vmc parse(String file) {
	
	   printInFile ("01 ");
		try {
			in = new FileInputStream(file);
			wb = new HSSFWorkbook(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
printInFile ("02 ");
		 sheet = wb.getSheetAt(0);
		 rowIterator = sheet.iterator();


   printInFile ("3 ");             
//    private int productId;
//    private String benchType;
//    private String model;
//    private String producer;
//    private String country;
                Vmc vmc = new Vmc();
                
   printInFile ("1 ");             
		row = rowIterator.next();
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
//             String tt=   cell.getStringCellValue();
                    vmc.setProductid( cell.getStringCellValue() );
//                    hmc.setProductId( 155 );
 printInFile (" 1 Productid" + vmc.getProductid())  ;             
                    
		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
                    vmc.setType( cell.getStringCellValue() );
  printInFile ("2 type" + vmc.getType())  ;
                    
//		row = rowIterator.next(); // пропускаем row
//		cellIterator = row.cellIterator();
//		cellIterator.next();
		cell = cellIterator.next();
                    vmc.setTyperu( cell.getStringCellValue() );
  printInFile ("3 typeru = " + vmc.getTyperu())  ;
                    
		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
                    vmc.setTypeurl(cell.getStringCellValue() );
  printInFile ("4 typeurl" + vmc.getType())  ;
  
		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
                vmc.setModel( cell.getStringCellValue() );
printInFile ("+5 Model" );	
  
		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
                vmc.setModelurl(cell.getStringCellValue() );
printInFile ("+6 modelurl" );		

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
                vmc.setManufacturer(cell.getStringCellValue() );
printInFile ("+7 manufacturer" );		
                
		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setCountry(cell.getStringCellValue() );
printInFile ("+ 8 country" );	
                
//		row = rowIterator.next(); // пропускаем row
//		cellIterator = row.cellIterator();
//		cellIterator.next();
		cell = cellIterator.next();
		vmc.setCountryru(cell.getStringCellValue() );
printInFile ("+ 9 countryru" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setCncsystem(cell.getStringCellValue() );
printInFile ("+ 10 cncsystem" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setCncsystemfull(cell.getStringCellValue() );
printInFile ("+ 11 setCncSystemFull" );	
                
                
		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setYear(Integer.parseInt(cell.getStringCellValue()) );
printInFile ("+ 12 setYear" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setMachinecondition(cell.getStringCellValue() );
printInFile ("+ 13 machinecondition" );	

//		row = rowIterator.next(); // пропускаем row
//		cellIterator = row.cellIterator();
//		cellIterator.next();
		cell = cellIterator.next();
		vmc.setMachineconditionru(cell.getStringCellValue() );
printInFile ("+ 14 machinecondition ru" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setMachinelocation(cell.getStringCellValue() );
printInFile ("+ 15  Machinelocation" );	

//		row = rowIterator.next(); // пропускаем row
//		cellIterator = row.cellIterator();
//		cellIterator.next();
		cell = cellIterator.next();
		vmc.setMachinelocationru(cell.getStringCellValue() );
printInFile ("+ 16 setMachinelocationru " );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setAxiscount(cell.getStringCellValue()  );
printInFile ("+ 17 axiscount" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setXmotion(Integer.parseInt(cell.getStringCellValue() ) );
printInFile ("+ 18 xmotion" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setYmotion(Integer.parseInt(cell.getStringCellValue() ) );
printInFile ("+ 19 ymotion" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setZmotion(Integer.parseInt(cell.getStringCellValue() ) );
printInFile ("+ 20 zmotion" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setXtablesize(checInt(cell.getStringCellValue() ) );
printInFile ("+ 21 xtablesize" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setYtablesize(checInt(cell.getStringCellValue() ) );
printInFile ("+ 22 ytablesize" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setTablerectangleload(checInt(cell.getStringCellValue() ));
printInFile ("+ 23 tablerectangleload" );	
        
		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setTableroundsize(cell.getStringCellValue() );
printInFile ("+ 24" );	
        
		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
                       try {
	vmc.setTableroundload(Integer.parseInt(cell.getStringCellValue() ) );      
       } catch (Exception e) {
           vmc.setTableroundload(0);
       }    	
printInFile ("+ 25" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setSpindlenose(cell.getStringCellValue() );
printInFile ("+ 26 spindlenose" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
       try {
	   vmc.setSpindlespeed(Integer.parseInt(cell.getStringCellValue() ));  
       } catch (Exception e) {
           vmc.setSpindlespeed(0);
       }  	
printInFile ("+ 27 spindlespeed" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setSpindlepower(cell.getStringCellValue() );
                
printInFile ("+ 28 spindlepower" );

                // int
		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
       try {
		vmc.setToolcount(Integer.parseInt(cell.getStringCellValue() ));           
       } catch (Exception e) {
           vmc.setToolcount(0);
       }              
printInFile ("+ 29 toolcount" );	



//--------------

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
        try {
		vmc.setToolmaxdiameter(Integer.parseInt(cell.getStringCellValue() ));      
       } catch (Exception e) {
                vmc.setToolmaxdiameter(0);
       }  
printInFile ("+ 30 toolmaxdiameter" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
        try {
		vmc.setToolmaxweight(Integer.parseInt(cell.getStringCellValue() ));;      
       } catch (Exception e) {
          vmc.setToolmaxweight(0);
       }          
printInFile ("+ 31 toolmaxweight" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
        try {
		vmc.setToolmaxlength(Integer.parseInt(cell.getStringCellValue() ));;      
       } catch (Exception e) {
          vmc.setToolmaxlength(0);
       }          
printInFile ("+ 32 toolmaxlength" );	


		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setToolchangingtooltotool(cell.getStringCellValue() );     	
printInFile ("+ 33 toolchangingtooltotool" );	


		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setToolchangingchiptochip(cell.getStringCellValue() );
printInFile ("+ 34 toolchangingchiptochip" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setPositioningaccuracy(cell.getStringCellValue() );
printInFile ("+ 35 positioningaccuracy" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setSpindleruntime(cell.getStringCellValue() );    
printInFile ("+ 36 spindleruntime" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();		          
		vmc.setMachineruntime(cell.getStringCellValue() );   
printInFile ("+ 37 machineruntime" );	


		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setPrice(Integer.parseInt(cell.getStringCellValue() ));
printInFile ("+ 38 " );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setPhoto1(cell.getStringCellValue() );
printInFile ("+ 39" );

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setPhoto2(cell.getStringCellValue() );
printInFile ("+ 40" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setPhoto3(cell.getStringCellValue() );
printInFile ("+ 41" );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setPhoto4 (cell.getStringCellValue() );
printInFile ("+ 42 vmc.setPhoto4 =" + vmc.getPhoto4() );	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setPhoto5 (cell.getStringCellValue() );
printInFile ("+ 43  vmc.getPhoto5() =" + vmc.getPhoto5());	

		row = rowIterator.next(); // пропускаем row
		cellIterator = row.cellIterator();
		cellIterator.next();
		cell = cellIterator.next();
		vmc.setInfo1en(cell.getStringCellValue() );
printInFile ("+ 44" );	

//		row = rowIterator.next(); // пропускаем row
//		cellIterator = row.cellIterator();
//		cellIterator.next();
		cell = cellIterator.next();
		vmc.setInfo2ru(cell.getStringCellValue() );
printInFile ("+ 45 Info2ru : " );	



vmc.setVideo1(stringFromCell("video 1"));
vmc.setVideo2(stringFromCell("video 2"));
vmc.setVideo3(stringFromCell("video 3"));
vmc.setSold(stringFromCell("sold"));

		return vmc;
	} 
   
   
   private static int checInt (String str){
       int r;
       try {
	   r = Integer.parseInt(str);      
       } catch (Exception e) {
           r=0;
       }  
     return r;
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
          File file = new File("d:\\2\\HMC exeption2- parser.txt");
//            File file = new File("HMC exeption.txt");
        try {
        	FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("--- HmcParser ----> "+new Date()+"): \n");
            fileWriter.write(str + "\n\n");
        } catch (IOException ex) {
//            Logger.getLogger(ControllerMachine.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }  
   
   
}
