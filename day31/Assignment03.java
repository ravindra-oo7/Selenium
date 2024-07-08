package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment03 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage()
			.timeouts()
			.implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> colors = driver.findElements(By.xpath("//select[@id='colors']//option"));
		System.out.println("Total Colors Options : "+colors.size());
		
		for(WebElement ele:colors)
		{
			System.out.print(ele.getText());
			if(ele.getText().equalsIgnoreCase("red") || ele.getText().equalsIgnoreCase("green"))
			{
				ele.click();
				System.out.print(" - Selected");
			}
			System.out.println();
		}
		
		
	}

}
