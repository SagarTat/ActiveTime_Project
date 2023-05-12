package com.Activetime.ObjectRepository_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo04_10_May_2023_Wednesday_Login_Page {
	
	//Declaration
		@FindBy(id="username")
		private WebElement untbx;
		
		@FindBy(name="pwd")
		private WebElement pwtbx;
		
		@FindBy(xpath="//div[.='Login ']") 
		private WebElement lgbtn;
		
		
		//Initialization
		public Demo04_10_May_2023_Wednesday_Login_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
	  
	
		//utilization -> source-> getMethod ->
        public WebElement getUntbx() {
			return untbx;
		}

		public WebElement getPwtbx() {
			return pwtbx;
		}

		public WebElement getLogin() {
			return lgbtn;
		}
		
}
