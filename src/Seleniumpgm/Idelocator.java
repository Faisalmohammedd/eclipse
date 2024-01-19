package Seleniumpgm;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idelocator {
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
	driver.findElement(By.id("email")).sendKeys("faisalkarimbanakkal77@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("faisal3448@");
	driver.findElement(By.name("login")).click();
}

@After
public void browserclose()
{
	driver.close();
}
}




