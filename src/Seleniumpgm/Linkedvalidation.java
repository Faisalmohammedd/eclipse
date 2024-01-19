package Seleniumpgm;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedvalidation {
	ChromeDriver driver;
	String baseurl="https://www.google.co.in/";
	
	
@Before
public void set()
{


	driver=new ChromeDriver();

}
@Test
public void Linkcount () throws Exception
{
	driver.get(baseurl);
	URL ob=new URL(baseurl);
	HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	con.connect();
	if(con.getResponseCode()==200)
	{
		System.out.println("valid---"+baseurl);
		
	}
	else {
		System.out.println("invalid---"+baseurl);
	}
		
}

}
