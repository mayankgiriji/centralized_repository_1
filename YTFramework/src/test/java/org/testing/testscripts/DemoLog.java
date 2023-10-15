package org.testing.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;
import org.testing.utilities.Logsscapture;
import org.testng.annotations.Test;

public class DemoLog extends Base{

	@Test
	public void  demo() {
		WebElement signinbutton=driver.findElement(By.id(pr.getProperty("signinbutton")));
		signinbutton.click();
		Logsscapture.takelog("demo class", "Logged in");
	}
}
