package Seleniumpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobilesearch {
	ChromeDriver driver;
	@Before
	public void browseropen() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/b/");
				
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).sendKeys("submit");
	}

}
