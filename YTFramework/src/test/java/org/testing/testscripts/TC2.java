package org.testing.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC2 extends Base
{

@Test

public void history() throws InterruptedException

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
	
	
    //code to click on history 
	WebElement historyy=driver.findElement(By.xpath(pr.getProperty("historyy")));
	historyy.click();
	Thread.sleep(5000);
}

@AfterMethod

public void tearDown() 
{
driver.close();
    }
}



