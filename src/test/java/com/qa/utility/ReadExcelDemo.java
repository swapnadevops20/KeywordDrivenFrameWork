package com.qa.utility;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelDemo {
	
	static Workbook book;
	static Sheet sheet;
	
	public static void readexcel(String path,String SheetName) throws IOException
	{
		FileInputStream file=new FileInputStream(path);
		book=WorkbookFactory.create(file);  //create a workbook if the file is not there otherwise it fetch the sheet from the location
		sheet=book.getSheet(SheetName);
		
	
	
	}

	public static String getData(int rownum,int col)
	{
		String data=sheet.getRow(rownum).getCell(col).toString();
		return data; 
	}
	
}
