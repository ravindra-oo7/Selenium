package day24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
	
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("Apple");
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
//		
//		driver.findElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']")).click();
		
		// driver.findElement(By.xpath("//button[@id='add-to-wishlist-button-4' and @class='button-2']")).click();
		// Above script fail due to "and" operator.
		// Both Attribute should be correct
		// to avoid this we can use "or" operator 
		
		
//		List<WebElement> wishlistButtons =driver.findElements(By.xpath("//button[text()='Add to wishlist']"));
//		System.out.println(wishlistButtons.size());
		
//		//XPath with contains()
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Samsung");
		
//		//XPath with start-with()
//		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Motorola");

		//Chained Xpath
		boolean status = driver.findElement(By.xpath("//div[@class='product-item']/div/a/img")).isDisplayed();
		System.out.println(status);
		
		
		
		
	}

}
