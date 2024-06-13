package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		//Frame-01
		WebElement frame1Element = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1Element);

		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame1 textbox1");
		
		//First Switch to default content page
		driver.switchTo().defaultContent();
		
		//Frame-02
		WebElement frame2Element = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		
		driver.switchTo().frame(frame2Element);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame2 TextBox2 ");
		
		//Frame-03
		driver.switchTo().defaultContent();
		
		WebElement frame3Element = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3Element);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Frame3 textBox3");
		
		driver.switchTo().frame(0);//Switching to inner iframe using index
		
		//driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		
		//Click using JavascriptExeCuter
		WebElement rdBttn = driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",rdBttn);
		
		driver.switchTo().defaultContent();
	}

}
