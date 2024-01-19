package Seleniumpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	ChromeDriver driver;
	@Before
	public void set ()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/faisal.html");
		
	}
	@Test
	public void Buttonverify()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		driver.switchTo().alert().accept();
		
		
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Faisal");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Mohammed");	}

}
