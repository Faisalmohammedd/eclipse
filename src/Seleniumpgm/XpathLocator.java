package Seleniumpgm;
	import org.junit.Before;

	import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

	public class XpathLocator {
			ChromeDriver driver;
			@Before
			public void browseropen() 
			{
				driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
			}
			@Test
			public void test() {
				//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
				//driver.findElement(By.xpath("//div[@id='nav-xshop']/a[6]")).click();
				//driver.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]/span[2]")).click();
				//driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
				//driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div")).click();
				driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("abcd@gmail.com");
			}
	}
