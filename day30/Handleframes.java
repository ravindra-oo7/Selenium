package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframes {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		//will through error as driver pointing on our web page 
		//and we try to locate element which is inside frame which is other webpage
		
		//We need to switch our driver to frames
		
		
		
		
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame1 textbox1");
		        
		
	}

}
