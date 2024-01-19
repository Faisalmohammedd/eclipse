package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbcreatepage {
	WebDriver driver;
	By fbcreate=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbgetstart=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.id("login");
	
	
	
	public Fbcreatepage (WebDriver driver)
	{
		this.driver=driver;
	}
	public void click()
	{
		driver.findElement(fbcreate).click();
		driver.findElement(fbgetstart).click();
		
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(fbcreate).sendKeys(email);
		driver.findElement(fbpassword).sendKeys(password);
	}
	public void login() 
	{
		driver.findElement(fblogin).click();
		
	}

}
