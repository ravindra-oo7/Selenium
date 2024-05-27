package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {

	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://demoblaze.com/index.html");
		
		driver.manage()
				.window()
				.maximize();
		
		List<WebElement> hrefList = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links : "+hrefList.size());
		for(WebElement e:hrefList) 
		{
			System.out.println(e.getAttribute("href"));
		}

	}

}
