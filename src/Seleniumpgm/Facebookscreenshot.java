package Seleniumpgm;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebookscreenshot {
	ChromeDriver driver;
	@Before
	public void screenshot() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
	}
	@Test
	public void test() throws Exception
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D://Screenshots.png"));
		
	}
	
	
	

}

