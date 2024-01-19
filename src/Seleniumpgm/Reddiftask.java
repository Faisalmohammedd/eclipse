package Seleniumpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Reddiftask  {
		
		ChromeDriver driver;

		@Before
		public void browseropen()
		{
			driver=new ChromeDriver() ;
			driver.get("https://register.rediff.com/register/register.php?FormName=user_details");	
			driver.manage().window().maximize();
		}

		@Test
		public void logodisplay() 
		{
			WebElement logo= driver.findElement(By.xpath("//tbody/tr/td/img"));
			if(logo.isDisplayed())
			{
				System.out.println("Logo is present");
			}
			else
			{
				System.out.println("Logo is not present");
			}
			
			
			WebElement checkbox= driver.findElement(By.xpath("//tbody/tr/td/input"));
			if(checkbox.isSelected())
			{
				System.out.println("Checkbox is checked");
			}
			else
			{
				System.out.println("Checkbox is unchecked");
			}		
			

			WebElement radiobtn= driver.findElement(By.xpath("//tbody/tr[24]/td[3]/input"));
			if(radiobtn.isEnabled())
			{
				System.out.println("Radio button is checked");
			}
			else
			{
				System.out.println("Radio button is unchecked");
			}
			
			
		}
	}

		
	
	

