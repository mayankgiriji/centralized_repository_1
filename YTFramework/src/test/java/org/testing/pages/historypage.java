package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class historypage 
{
ChromeDriver driver;
Properties pr;
public historypage(ChromeDriver dr, Properties pr)
{
this.driver=driver;
this.pr=pr;
}
public void historypage()
{
WebElement historypage=driver.findElement(By.xpath(pr.getProperty("historypage")));
}
}

