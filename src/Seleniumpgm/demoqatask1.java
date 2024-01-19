package Seleniumpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqatask1 {
	ChromeDriver driver;
	@Before
	public void set ()
	{
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
	
	}
	@Test
	public void Buttonverify() {
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		 Alert a=driver.switchTo().alert();
		String actualtext= a.getText();
		
		if(actualtext.equals("You clicked a button"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
	}
	@Test 
	public void test2 ()
	{
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Alert a=driver.switchTo().alert();
		 String actualtext=a.getText();
		 if (actualtext.equals("You clicked a button"))
		 {
			 System.out.println("pass");
			 
		 }
		 else
		 {
			 System.out.println("fail");
			 
		 }
		 a.accept();
		 
	}
}
