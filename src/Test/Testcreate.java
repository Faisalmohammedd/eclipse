package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Fbcreatepage;

public class Testcreate {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
    public void url()
{
		driver.get("https://www.facebook.com/");
	
}
	@Test
	public void testlogin()throws Exception
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.click();
		ob.setvalues("faisalkarimbanakkal77@gmail.com","faisal3456");
		ob.login();
	}
}
