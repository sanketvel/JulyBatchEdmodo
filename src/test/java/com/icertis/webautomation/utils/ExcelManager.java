package com.icertis.webautomation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelManager 
{
	
	
	static XSSFSheet sheet_global;
	static XSSFWorkbook wbook;
	static String FILE_PATH = System.getProperty("user.dir") + "//src//test//java//com//icertis//webautomation//utils//data//";
	
	public static void create_sheet(String filename,String sheetname)
	{
		
		 String FILE_NAME = FILE_PATH + filename;
		
		 wbook = new XSSFWorkbook();
		 sheet_global = wbook.createSheet(sheetname);
		 
		 try
		 {
		     FileOutputStream fileo = new FileOutputStream(FILE_NAME);	
		     wbook.write(fileo);
		 }
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		 
	}
	
	public static void set_data_sheet(String filename,int rd,int cd,String data)
	{
		
		 String FILE_NAME = FILE_PATH + filename;
		 // create row for username and password
		 Row r = sheet_global.createRow(rd);
		 Cell c0 = r.createCell(cd);
		 c0.setCellValue(data);
		 
		 try
		 {
		     FileOutputStream fileo = new FileOutputStream(FILE_NAME);	
		     wbook.write(fileo);
		 }
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		  
		
	}
	
	public static String read_sheet(String filename_path,int sno,int r,int c)
	{
		 try
		 {
		         FileInputStream file = new FileInputStream(new File(filename_path));
		         XSSFWorkbook workbook = new XSSFWorkbook(file);
		         XSSFSheet sheet = workbook.getSheetAt(sno);
		         return sheet.getRow(r).getCell(c).toString();
		 }
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
			 return null;
		 }
         
	}

}
