package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage()
				.timeouts()
				.implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
//		// 1) Select Specific checkbox
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();
	
		// 2) select all the checkboxes
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @ type='checkbox']"));
		
//		for(int i=0;i<checkBoxes.size();i++)
//		{
//			checkBoxes.get(i).click();
//			
//		}
		
//		for (WebElement webElement : checkBoxes) 
//		{
//			webElement.click();
//		}
		
		// 3) select last 3 checkBoxes
		int count=3;
		for(int i=checkBoxes.size()-1;i>=0;i--)
		{
			if(count>0)
			{
				checkBoxes.get(i).click();
				count--;
			}
		}
		
	}

}
