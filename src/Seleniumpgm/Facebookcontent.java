package Seleniumpgm;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookcontent {
ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@Test
public void test()
{
	String content=driver.getPageSource();
	if (content.contains("Login"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
}
}@After
public void browserclose() {
	driver.close();
}

}



