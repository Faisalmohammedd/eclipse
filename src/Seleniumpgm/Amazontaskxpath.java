package Seleniumpgm;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontaskxpath {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test()
	{
	
		driver.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]/span[2]")).click();
		
		driver.findElement(By.xpath("//a*[@id=\"nav-hamburger-menu\"]")).click();
		


}
}
	

