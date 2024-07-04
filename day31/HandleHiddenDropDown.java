package day31;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Login steps
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Clicking on PM
		driver.findElement(By.xpath("//span[normalize-space()='PIM'] [@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
		
		//Clicking for generate dropdown 
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[3]/div[1]/div[2]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		
		//Selecting one option
		//driver.findElement(By.xpath("//span[normalize-space()='Part-Time Contract']")).click();
	
		//Counting All Options
		List<WebElement> elements = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println("Total Options in Employment status : "+elements.size());
		
		for (WebElement ele:elements) 
		{
			System.out.println(ele.getText());	
		}
	}

}
