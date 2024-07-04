package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage()
				.timeouts()
				.implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//Open Dropdown
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//select single option
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//capture all options
		List<WebElement> options = driver.findElements(By.xpath("//ul//label[@class='checkbox']"));
		System.out.println("Number Of checkboxes : "+options.size());
		
		//Printing all options and select 
		for (WebElement webElement : options) 
		{
			String optName = webElement.getText();
			System.out.println(optName);
			
			if( optName.equals("Oracle")||optName.equals("Python"))
			{
				webElement.click();
			}
			
		}
		 		
		 
	}

}
