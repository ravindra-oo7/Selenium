package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {
      
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
//		driver.manage()
//				.timeouts()
//				.implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	
	// Alert Window
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		Thread.sleep(3000);
		
		Alert myAlert= myWait.until(ExpectedConditions.alertIsPresent());
		myAlert.accept();
		
		
		
	}

}
