package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	public static void main(String[] args ) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		boolean status = driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']")).isDisplayed();
		System.out.println("Image Displayed status : "+status);
		
		boolean status2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).isEnabled();
		System.out.println("Button Status : "+status2);
	
		
	
	}
}
