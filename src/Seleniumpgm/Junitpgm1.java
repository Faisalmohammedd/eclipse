package Seleniumpgm;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm1 {
	ChromeDriver driver;
	@Before
	public void browseropen() 
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		
	}
	@Test
	public void test()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedresult="Google";
		if (actualtitle.equals(expectedresult))
		{
			System.out.println(" Pass");
		}
		else
		{
			System.out.println(" Fail");
		}
			
		
	}
	@After
	public void browserclose()
	{
		driver.close();
	}

}
	





