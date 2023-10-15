package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage 
{
	ChromeDriver driver; 
	Properties pr;
	
	public loginpage(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void signin(String username,String password )
	{
		WebElement signinbutton=driver.findElement(By.id(pr.getProperty("signinbutton")));
	}
}