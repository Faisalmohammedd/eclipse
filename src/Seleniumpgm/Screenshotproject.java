
		package Seleniumpgm;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotproject {
	ChromeDriver driver;

	@Before
	public void browseropen()
	{
		driver=new ChromeDriver() ;
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");	
		
	}
	@Test
	public void scrnsht () throws Exception
	{
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[30]/td[2]/img"));
		File src1=dayelement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Screenshots//Screenshot2.png"));
		
	}

}
