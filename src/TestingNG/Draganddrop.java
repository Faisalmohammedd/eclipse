package TestingNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
	}
	@Test
	public void test() 
	{
		WebElement src=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement test=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, test);
		act.perform();
		String text=test.getText();
		if(text.equals("dropped"))
		{
			System.out.println("dropped");
		}
		else
		{
			System.out.println("notexpected");
		}
		
		
		
	}
			
	}


