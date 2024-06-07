package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
			
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement txtuserName = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
		
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ashutosh Patil");
	
		driver.close();
	}

}
