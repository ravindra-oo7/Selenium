package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment03 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoblaze.com/index.html");
		
		driver. manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Samsung galaxy s6")).click();;
	}

}
