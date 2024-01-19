package Seleniumpgm;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooktask2 {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
	}
	@Test 
	public void Buttontestverify() {
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select day=new Select(dayelement);
		day.selectByValue("7");
		
		WebElement Month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select M=new Select(Month);
		M.selectByIndex(9);
		
		WebElement Year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select Y=new Select(Year);
		Y.selectByVisibleText("2001");
		
		List<WebElement> nc=day.getOptions();
		System.out.println(nc.size());
		
		
		
		List<WebElement> nc1 =M.getOptions();
		System.out.println(nc1.size());
		
		
		List<WebElement> nc3=Y.getOptions();
		System.out.println(nc3.size());
		
		
	}
}
