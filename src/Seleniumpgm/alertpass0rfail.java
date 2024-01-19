package Seleniumpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpass0rfail {
	ChromeDriver driver;
@Before
public void set ()
{
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/user/OneDrive/Desktop/faisal.html");
	
}
@Test
public void Buttonverify()
{
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	Alert a=driver.switchTo().alert();
	String actualtext=a.getText();
	if(actualtext.equals("hello i am alert box"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	a.accept();
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Faisal");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Mohammed");	}

}



