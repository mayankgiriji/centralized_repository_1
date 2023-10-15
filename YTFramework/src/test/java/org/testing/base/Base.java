package org.testing.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base
{
public Properties pr;
public ChromeDriver driver;
@BeforeMethod
public void parent() throws IOException
{
	
	File F=new File("../YTFramework/ObjectRepo.properties");
	FileReader fr=new FileReader(F);
	pr=new Properties();
	pr.load(fr);
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
}
@AfterMethod
public void tearDown() 
{
driver.close();
}
}
