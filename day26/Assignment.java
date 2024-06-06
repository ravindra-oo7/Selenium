package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println("Title : "+ driver.getTitle());
		
		System.out.println("Page URL : "+driver.getCurrentUrl());
		
		//System.out.println("Page Source : "+driver.getPageSource());
		
		System.out.println("ID of Browser Window : "+driver.getWindowHandle());
	
		boolean imgStatus = driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).isDisplayed();
		System.out.println("Image Status : "+imgStatus);
	
		boolean textboxStatus = driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
		System.out.println("Name TextBox Status : "+textboxStatus);
	
		boolean radioButtonStatus = driver.findElement(By.xpath("//input[@class='form-check-input'  and @id='male']")).isSelected();
		System.out.println("Gender Male Radio Button Status : "+radioButtonStatus);
	
		driver.findElement(By.xpath("//input[@class='form-check-input'  and @id='male']")).click();
	
		boolean radioButtonStatus2 = driver.findElement(By.xpath("//input[@class='form-check-input'  and @id='male']")).isSelected();
		System.out.println("Gender Male Radio Button Status After Selecting: "+radioButtonStatus2);
	
	
	
	}

}
