package Seleniumpgm;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpg {
	ChromeDriver driver;
	@Before
	public void browseropen() 
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		

}
	@Test
	public void test()
	{
	
		List <WebElement> zi= driver.findElements(By.tagName("a"));
		System.out.println("link count " +zi.size());
	}
}

	
