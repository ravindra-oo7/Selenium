package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage()
				.timeouts()
				.implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
//	
//	// Alert Window
//		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
//		
//		Thread.sleep(3000);
//		//driver.switchTo().alert().accept();
//		
//		//Capturing Text in Alert
//		Alert myAlert =	driver.switchTo().alert();
//
//		System.out.println(myAlert.getText());
//		myAlert.accept();
//		
//	//Confirmation Alert window
//		driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
//		
//		Thread.sleep(3000);
//
//		//driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
	
	//Prompt Alert	
		driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
		driver.switchTo().alert().sendKeys("Ravindra");
		Thread.sleep(3000);

		driver.switchTo().alert().accept();
		
		
	}

}
