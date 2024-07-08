package day31;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage()
		.timeouts()
		.implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		//Count Total Number Of Options in Country
		List<WebElement> countryOpt = driver.findElements(By.xpath("//select[@name='country']//option"));
		System.out.println("Total Options : "+countryOpt.size());
		
		//Print All Options
		for (Iterator iterator = countryOpt.iterator(); iterator.hasNext();) 
		{
			WebElement webElement = (WebElement) iterator.next();
			System.out.println(webElement.getText());
		}
		
		//Select One Option
		driver.findElement(By.xpath("//option[@value='4']")).click();
		
		
		
		
	}

}
