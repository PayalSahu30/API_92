package com.ShopperStack.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility 
{
FileInputStream fis;
public String readPropertyFileData(String Key) throws IOException
{
	fis=new FileInputStream("");
	Properties pro=new Properties();
	pro.load(fis);
	String value=pro.getProperty(Key);       //it will return String value
	return value;
	
}

public String readExcelFileData(String SheetName, int Rownum, int Cellnum) throws EncryptedDocumentException, IOException
{
	fis=new FileInputStream("");	
	Workbook wb= WorkbookFactory.create(fis);
	String value= wb.getSheet(SheetName).getRow(Rownum).getCell(Cellnum).getStringCellValue();
	return value;
}
}
