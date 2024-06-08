package day28;

import java.net.URLClassLoader;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage()
				.timeouts()
				.implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Find Search box and send key to search
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"))
				.sendKeys("JavaScript");
		//find search button and click
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		//Collecting search result
		boolean searchResultAvialable = driver.findElement(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']")).isDisplayed();
		
		List<WebElement> urlList =new LinkedList<WebElement>();
		
		if(searchResultAvialable)
		{
			urlList = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']"));
		}
		
		//Printing and Visiting Each URL 
		for (WebElement ele:urlList) 
		{
			String linkText = ele.getText();
			System.out.println("Clicking on link text : "+linkText);
			ele.click();
			
			  // Optionally, wait for a bit to observe the click action
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
			
            // Navigate back to the search results page
            driver.navigate().back();

            // Refresh the urlList to avoid StaleElementReferenceException
            urlList = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));
			
		}
				
		//driver.close();
	}

}
