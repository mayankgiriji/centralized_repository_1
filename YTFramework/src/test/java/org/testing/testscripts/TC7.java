package org.testing.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC7 extends Base
{
@Test

public void comments() throws InterruptedException
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
	
	//code to click on video
	WebElement video=driver.findElement(By.xpath(pr.getProperty("video")));
	video.click();
	Thread.sleep(3000);
	Actions action = new Actions(driver);
	action.scrollByAmount(0, 400).build().perform();
	Thread.sleep(9000);
	
	
	//code to add comments on any video 
	driver.findElement(By.xpath("//div[@id='placeholder-area']/yt-formatted-string")).click();
	Thread.sleep(4000);
	WebElement comments=driver.findElement(By.xpath(pr.getProperty("comments")));
	//comments.click();
	comments.sendKeys("Nice");
	Thread.sleep(4000);
	
	//code to click on comment to post 
	WebElement postcomment=driver.findElement(By.xpath(pr.getProperty("postcomment")));
	postcomment.click();
	
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

public void tearDown() 
{
	driver.close();
}



	

}
