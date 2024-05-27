package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#small-searchterms"))
			.sendKeys("samsung");
		driver.findElement(By.cssSelector("button.button-1")).click();

		driver.findElement(By.cssSelector("button.button-2")).click();
	
		driver.findElement(By.cssSelector("a.ico-cart")).click();
		
		driver.findElement(By.cssSelector("input.qty-input[aria-label=\"Qty.\"]")).clear();
		
		driver.findElement(By.cssSelector("input.qty-input[aria-label=\"Qty.\"]")).sendKeys("5");

		
	}

}
