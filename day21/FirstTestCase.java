package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* 
Test Case
-----------------------
1)Launch Browser(Chrome)
2)Open URL http://demo.opencart.com/
3)Validate title should be "OpenCart - Demo"
4)Close browser

*/

public class FirstTestCase {

	public static void main(String[] args) 
	{
		
	//1)Launching Browser (Chrome)
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		
	//2)Open URL http://demo.opencart.com/
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
	
	//3)Validate title should be "Your Store"
		String act_title = driver.getTitle();
		
		
		if(act_title.equals("OpenCart - Demo"))
		{
			System.out.println("Test Passed");
		}
		else 
		{
			System.out.println("Test Failed");
		}
	//4)Close browser
		driver.close();
		//driver.quit();
		
	}

}
