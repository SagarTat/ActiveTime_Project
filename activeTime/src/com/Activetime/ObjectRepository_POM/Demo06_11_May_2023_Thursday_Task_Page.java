package com.Activetime.ObjectRepository_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Activetime.GenericLiberary.Demo02_09_May_2023_Tuesday_FileLibrary;

public class Demo06_11_May_2023_Thursday_Task_Page {
	Demo02_09_May_2023_Tuesday_FileLibrary f1 = new Demo02_09_May_2023_Tuesday_FileLibrary();
	
	//Declaration
	@FindBy(xpath ="//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcust ;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	public WebElement custname;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	public WebElement custdesp;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	public WebElement creatcust;
	
	@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
	public WebElement cancelbtn;
	
//	@FindBy(xpath = "")
//	public WebElement  
	
	
	//initialization
	public Demo06_11_May_2023_Thursday_Task_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}
	public WebElement getNewcust() {
		return newcust;
	}
	public WebElement getCustname() {
		return custname;
	}
	public WebElement getCustdesp() {
		return custdesp;
	}
	public WebElement getCreatcust() {
		return creatcust;
	}
	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	
}
