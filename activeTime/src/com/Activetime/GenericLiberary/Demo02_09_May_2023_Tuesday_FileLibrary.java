package com.Activetime.GenericLiberary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is a generic library class which content all the generic methods.
 * @author Sagar
 *
 */
public class Demo02_09_May_2023_Tuesday_FileLibrary {


	   /**
	    * This is Generic method which  use to read the data from property file.
	    * @param key
	    * @return
	    * @throws IOException
	    */
		public String readDataFromPropertyFile(String key) throws IOException {
			FileInputStream fis = new FileInputStream("./testdata/commondata.property.txt");
			Properties p = new Properties();
			p.load(fis);
			String value = p.getProperty(key);
			return value;
			
		}
		
		/**
		 * This Method is generic method Which is use to Read the data from the excelsheet.
		 * @param sheetname
		 * @param row
		 * @param cell
		 * @return
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
       
		public String readdatafromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
			FileInputStream fis1 = new FileInputStream("./testdata/TESTDATA.xlsx");
			Workbook wb = WorkbookFactory.create(fis1);
			String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
			return value;
			 
			}
	

}
