package Seleniumpgm;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}

@Test
public void test()
{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("faisalkarimbanakkal77@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("faisal3448@");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	

	
}



}
