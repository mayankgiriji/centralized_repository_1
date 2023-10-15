package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class subscribepage
{
ChromeDriver driver;
Properties pr;
public subscribepage(ChromeDriver driver, Properties pr)
{
this.driver=driver;
this.pr=pr;
}
public void subscribe()
{
WebElement subscribe=driver.findElement(By.xpath(pr.getProperty("subscribe")));
}
}
