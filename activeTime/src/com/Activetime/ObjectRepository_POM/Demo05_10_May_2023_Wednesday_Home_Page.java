package com.Activetime.ObjectRepository_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo05_10_May_2023_Wednesday_Home_Page {
     //declaration
	@FindBy(xpath = "//div[.='Tasks']")
     private WebElement tasktab;
     
	@FindBy(xpath = "//div[.='Reports']")
    private WebElement reporttab;
	
	@FindBy(xpath = "//div[.='Users']")
    private WebElement usertab;
	
//	@FindBy(xpath = "//div[.='Time-Track']")
//    private WebElement timetrack;
	
	@FindBy(linkText = "Logout")
    private WebElement logoutlnk;
	
	
	//Initialization 
	public Demo05_10_May_2023_Wednesday_Home_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	
	//Utilization -> source-> getMethod ->
	public WebElement getTasktab() {
		return tasktab;
	}

	public WebElement getReporttab() {
		return reporttab;
	}

	public WebElement getUsertab() {
		return usertab;
	}

	public WebElement getLogoutlnk() {
		return logoutlnk;
	}
	
	
	
	
	
}
