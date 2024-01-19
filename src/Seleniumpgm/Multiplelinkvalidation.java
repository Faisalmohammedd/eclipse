package Seleniumpgm;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplelinkvalidation {
	ChromeDriver driver;
	@Before 
	public void set()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void Linkcount()
	{
		driver.get("https://www.google.co.in/");
		
		List <WebElement> zi= driver.findElements(By.tagName("a"));
		for(WebElement s:zi)
		{
			String links =s.getAttribute("href");
		}
	}
	public void verify(String link)
	{
		try {
			URL ob= new URL(link);
			
				HttpURLConnection zi=(HttpURLConnection)ob.openConnection();
				zi.connect();
				if(zi.getResponseCode()==200)
				{
					System.out.println("valid---"+link);
				}
				else if (zi.getResponseCode()==404);
				{
					
				System.out.println("broken link----"+link);
				
				}
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				
			}
		
			}
	}
	
		
	



