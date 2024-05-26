package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=9464490953243029491&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301536&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		
		driver.manage()
				.window()
				.maximize();
		 
//	//Locate Element Using name
//		
//		driver.findElement(By.name("field-keywords"))
//				.sendKeys("Laptop");
		
//	//Locate Element using id
//		
//		boolean logoDisplayStatus = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
//		System.out.println(logoDisplayStatus);
		
//	//Locate Element using linkText and partialLinkText
//		
//		//driver.findElement(By.linkText("Amazon miniTV")).click();
//		driver.findElement(By.partialLinkText("mini")).click();
		
//	//Locate Multiple elements
//		driver.findElement(By.linkText("Mobiles")).click();
//		List<WebElement> brandList= driver.findElements(By.className("a-spacing-micro"));
//		System.out.println("Total number of brands of mobiles : "+brandList.size());
		
	//Locate using Tag name	
		//List<WebElement> hrefLinks= driver.findElements(By.tagName("a"));
		//System.out.println("Total Number of Links : "+hrefLinks.size());
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total images : " + images.size());
		
		
	}

}
