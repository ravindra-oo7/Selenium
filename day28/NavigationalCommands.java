package day28;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException 
	{
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		//driver.get(url) method takes url only in String formate
		//driver.get("https://testautomationpractice.blogspot.com/");
		
		//navigate.to(url) method takes url as String or Object of URL
		//driver.navigate().to("https://testautomationpractice.blogspot.com/");
		                             
		//URL myUrl = new URL("https://testautomationpractice.blogspot.com/");
		//driver.navigate().to(myUrl); 
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.navigate().to("https://www.youtube.com/watch?v=zc5L1Q_voSE&list=PLUDwpEzHYYLtQzEEEldbjPAR-gnStv4sR&index=29");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
