package org.testing.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;
import org.testing.utilities.Screenshotcapture;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC1 extends Base 
{

	@Test

	public void signin() throws InterruptedException, IOException
	{
		String expectedurl="https://www.youtube.com/";
		//code for clicking on signin button
		WebElement signinbutton=driver.findElement(By.id(pr.getProperty("signinbutton")));
		signinbutton.click();

		//code for entering  email id
		WebElement enteremail=driver.findElement(By.id(pr.getProperty("enteremail")));
		enteremail.sendKeys("mayankgiritestemail@gmail.com");

		//code to click on next
		WebElement next=driver.findElement(By.id(pr.getProperty("next")));
		next.click();
		Thread.sleep(9000);

		//code to enter password 
		WebElement pass=driver.findElement(By.xpath(pr.getProperty("pass")));
		pass.sendKeys("Testing@123");

		//code to take screenshot 
		Screenshotcapture.takescreenshot(driver,"D://screenshots//first_tc.png");

		//code to capture lof

		//code to click on next button 
		WebElement nextt=driver.findElement(By.id(pr.getProperty("nextt")));
		nextt.click();
        String actualurl=driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl);
		
		
		

	}
	@AfterMethod

	public void tearDown() 
	{
		driver.close();
	}

}



