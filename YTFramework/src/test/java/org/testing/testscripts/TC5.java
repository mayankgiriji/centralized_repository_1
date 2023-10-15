package org.testing.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;
import org.testng.annotations.Test;

public class TC5 extends Base
{
@Test

public void copy()
{

	//code for entering  email id
			WebElement enteremail=driver.findElement(By.id(pr.getProperty("enteremail")));
			enteremail.sendKeys("mayankgiritestemail@gmail.com");
			

	}
	
}




