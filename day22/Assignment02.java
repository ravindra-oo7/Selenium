package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment02 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoblaze.com/index.html");
		
		driver.manage().window().maximize();
		
		List<WebElement>images = driver.findElements(By.tagName("img"));
		
		System.out.println("Total Images : "+ images.size());
		
		for(int i=0;i<images.size();i++) 
		{
			System.out.println(images.get(i).getAttribute("src"));
		}
	}

}
