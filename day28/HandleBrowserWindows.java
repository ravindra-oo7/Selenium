package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage()
				.timeouts()
				.implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']")).click();
		
		System.out.println("Parent Browser Window : "+driver.getTitle());
		
		//driver is on parent window
		//to switch driver on child window
		
		Set<String>windowIdDs = driver.getWindowHandles();

		
//		//Approch-01
//		List<String> windowList = new ArrayList(windowIdDs);
//		
//		String parentID = windowList.get(0);
//		String childID = windowList.get(1);     
//		
//		//switch to child window
//		driver.switchTo().window(childID);
//		System.out.println("Child Browser Window : "+driver.getTitle());
//
//		//switch to parent window
//		driver.switchTo().window(parentID);
//		System.out.println("Parent Browser Window : "+driver.getTitle());

		//Approach-02
		for (String winID : windowIdDs) 
		{
			String title = driver.switchTo().window(winID).getTitle();
			
			if(title.equals("Your Store"))
			{
				System.out.println("URL of 'Your Store' Page : "+driver.getCurrentUrl());
			}
			
			
		}
		
		
		
	}

}
