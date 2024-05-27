package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();//Maximize the Browser window
		
//		//using tag id		ie. tag#id 
//		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
//		//Tag Name is optional eg "input#small-searchterms" == "#small-searchterms"
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");

//		//using tag.class	ie. tag.classname
//		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Denim");
//		//Tag Name is optional eg "input.search-box-text" == ".search-box-text"
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Denim");
		
//		//using tag attribute		ie. tag[attributeName="value"]
//		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Ravindra");
//		driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("Ravindra");

		//using tag class attribute		ie. tag.class[attribute="value"]
		// driver.findElement(By.cssSelector("input.search-box-text[placeholder=\"Search store\"]")).sendKeys("Ravindra");
		 driver.findElement(By.cssSelector(".search-box-text[placeholder=\"Search store\"]")).sendKeys("Ravindra");

		
	}

}
