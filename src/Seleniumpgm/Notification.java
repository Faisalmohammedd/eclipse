package Seleniumpgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Notification {
	WebDriver driver;
	@BeforeTest
	public void test() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable--notification");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
	}
	@Test()
	public void urlloading() {
		driver.get("https://www.justdial.com/");
	}

}
