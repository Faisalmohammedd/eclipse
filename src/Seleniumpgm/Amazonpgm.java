package Seleniumpgm;

import org.junit.After;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {
		ChromeDriver driver;
		@Before
		public void browseropen() 
		{
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in/b/?_encoding=UTF8&node=15325111031&pd_rd_w=ptOnD&content-id=amzn1.sym.c1876313-8863-4440-9b25-912f10a7c641&pf_rd_p=c1876313-8863-4440-9b25-912f10a7c641&pf_rd_r=M6H3R2HQP8RR92RDGD5W&pd_rd_wg=zkQJ9&pd_rd_r=e427cc07-6fde-43e7-838e-f189c22b41cd");
		}
		@Test
		public void test()
		{
			String actualtitle=driver.getTitle();
			System.out.println(actualtitle);
			String expectedresult="Amazon";
			if (actualtitle.equals(expectedresult))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
				
			}
				}@After
			public void browserclose()
			{
				driver.close();
			}
			

}
			
