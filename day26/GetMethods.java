package day26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://lentra.ai/");
	
		System.out.println("Title : "+ driver.getTitle());
		
		System.out.println("Page URL : "+driver.getCurrentUrl());
		
		System.out.println("Page Source : "+driver.getPageSource());
		
		System.out.println("ID of Browser Window : "+driver.getWindowHandle());
		
		
		driver.close();
	}

}
