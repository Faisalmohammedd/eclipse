package Seleniumpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasklocator {
		ChromeDriver driver;
		@Before
		public void browseropen() 
		{
			driver=new ChromeDriver();
			driver.get("https://register.rediff.com/");
		}
		@Test
		public void test() {
			driver.findElement(By.xpath("//input[@name='name62227334']")).sendKeys("faisal");
			
			
		}
}




