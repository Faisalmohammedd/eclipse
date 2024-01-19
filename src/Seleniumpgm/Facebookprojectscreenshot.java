package Seleniumpgm;



import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebookprojectscreenshot {
	ChromeDriver driver;

	@Before
	public void browseropen()
	{
		driver=new ChromeDriver() ;
		driver.get("https://www.facebook.com/signup");	
		
	}
	@Test
	public void scrns() throws Exception 
	{
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		File src1=dayelement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Screenshotss//Screenshot.png"));
		
	

	}
		
	}
	
		
	
	
		
	
	
		
		
		
	



