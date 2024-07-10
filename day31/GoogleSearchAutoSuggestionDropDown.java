package day31;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchAutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage()
				.timeouts()
				.implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage()
				.window()
				.maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
		Thread.sleep(10);
		
		List<WebElement> options =  driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		System.out.println("Oprions : "+options.size());
		
		for(int i=0;i<options.size();i++)
		{
			String opt = options.get(i).getText();
			System.out.println(opt);
			if(opt.equalsIgnoreCase("Selenium webdriver"))
			{
				options.get(i).click();
			}
			
		}
			
	}

}
