package com.Activetime.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Activetime.GenericLiberary.Demo01_09_May_2023_Tuesday_Baseclass;
import com.Activetime.GenericLiberary.Demo02_09_May_2023_Tuesday_FileLibrary;
import com.Activetime.ObjectRepository_POM.Demo05_10_May_2023_Wednesday_Home_Page;
import com.Activetime.ObjectRepository_POM.Demo06_11_May_2023_Thursday_Task_Page;

public class Demo04_10_May_2023_Wednesday_Task extends Demo01_09_May_2023_Tuesday_Baseclass {
 
	@Test
  public void createCustomer() throws EncryptedDocumentException, IOException {
	 
	  Demo05_10_May_2023_Wednesday_Home_Page hp = new Demo05_10_May_2023_Wednesday_Home_Page(driver);
	  hp.getTasktab().click();
	  
	   Demo06_11_May_2023_Thursday_Task_Page tp = new Demo06_11_May_2023_Thursday_Task_Page(driver);
	  tp.getAddnewbtn().click();
	  tp.getNewcust().click();
	 
	 
	  Demo02_09_May_2023_Tuesday_FileLibrary f = new Demo02_09_May_2023_Tuesday_FileLibrary();
	 String creatcustomer = f.readdatafromExcel("sheet1", 1, 1);
	 tp.getCustname().sendKeys(creatcustomer);
	 String description = f.readdatafromExcel("sheet1", 1, 2);
	 tp.getCustdesp().sendKeys(description);
	 
	 String expectedresult = creatcustomer;
	 String actualresult = driver.findElement(By.xpath("(//div[.='"+creatcustomer+"'])[2]")).getText();     //Deepika
	 SoftAssert s = new SoftAssert();
	 s.assertEquals(actualresult, expectedresult);
	 s.assertAll(); 
	 
	 
	 
	 
	  
  }
}
