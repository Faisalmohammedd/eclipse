package Seleniumpgm;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demopgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedresult="Google";
		if (actualtitle.equals(expectedresult))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
			
		
		
	}
	

}
}
 