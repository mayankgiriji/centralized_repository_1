package org.testing.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;
import org.testing.pages.subscribepage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC3 extends Base
{

@Test

public void subscription() throws InterruptedException
{
	//code for clicking on login button
	WebElement signinbutton=driver.findElement(By.id(pr.getProperty("signinbutton")));
	signinbutton.click();
	
	//code for entering the email
	WebElement enteremail=driver.findElement(By.id(pr.getProperty("enteremail")));
	enteremail.sendKeys("mayankgiritestemail@gmail.com");
	
	//code to click on next button
	WebElement next=driver.findElement(By.id(pr.getProperty("next")));
	next.click();
	Thread.sleep(9000);
	//code to enter password 
	WebElement pass=driver.findElement(By.xpath(pr.getProperty("pass")));
	pass.sendKeys("Testing@123");
	//code to click on next button 
	WebElement nextt=driver.findElement(By.id(pr.getProperty("nextt")));
	nextt.click();
	Thread.sleep(5000);
	

    //code to click on subscribe
	subscribepage subscribe=new subscribepage(driver, pr);
	subscribe.subscribe();
	//code to click on menu
    WebElement menu=driver.findElement(By.xpath(pr.getProperty("menu")));
    menu.click();
    Thread.sleep(5000);
    //code to click signout 
    WebElement signout=driver.findElement(By.xpath(pr.getProperty("signout")));
    signout.click();
    Thread.sleep(7000);
}
	@AfterMethod
	
	public void teardown()
	{
	driver.close();
	}
}