package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		//Implicit wait() 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		 		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ashutosh Patil");
		
		driver.close();
	}

}
