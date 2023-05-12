package com.Activetime.GenericLiberary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Activetime.ObjectRepository_POM.Demo05_10_May_2023_Wednesday_Home_Page;
import com.Activetime.ObjectRepository_POM.Demo04_10_May_2023_Wednesday_Login_Page;

public class Demo01_09_May_2023_Tuesday_Baseclass {
	
	
	public static WebDriver driver;
	Demo02_09_May_2023_Tuesday_FileLibrary f = new Demo02_09_May_2023_Tuesday_FileLibrary();
	
	@BeforeSuite
	public void databaseconnection() {
        Reporter.log("database connected",true);
	} 
	
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = f.readDataFromPropertyFile("url");
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do"); 
		Reporter.log("Browser lunched",true);
	}
	
	
	@BeforeMethod
	public void login() throws IOException {
//		String UN = f.readDataFromPropertyFile("username");
//		driver.findElement(By.id("usename")).sendKeys("UN");
//		String PW = f.readDataFromPropertyFile("password");
//		driver.findElement(By.name("pwd")).sendKeys("PW");
//		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		Demo04_10_May_2023_Wednesday_Login_Page lp = new Demo04_10_May_2023_Wednesday_Login_Page(driver);
		String UN = f.readDataFromPropertyFile("username");
		String PW = f.readDataFromPropertyFile("password");
		lp.getUntbx().sendKeys(UN);
		lp.getPwtbx().sendKeys(PW);
		lp.getLogin().click();
		Reporter.log("Logged in successfully",true);
	}
	
	
	@AfterMethod
	public void logout() {
		
		Demo05_10_May_2023_Wednesday_Home_Page hp = new Demo05_10_May_2023_Wednesday_Home_Page(driver);
		hp.getLogoutlnk().click();
		//driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logged out successfully",true);
	}
	
	
	@AfterClass
	public void closebrowser() {
		Reporter.log("Browser Closed",true);
	}
	
	
	@AfterSuite
	public void databasedisconnected() {
		Reporter.log("database disconnected",true);
	}
	

}
