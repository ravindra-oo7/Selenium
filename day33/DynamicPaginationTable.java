package day33;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

		public static void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			//List<WebElement> options = driver.findElements(By.xpath("//table[@id='productTable']//tr//td"));
			
			for(int k=2;k<=5;k++) //Pages=4 1st already loaded 
			{
				for(int i=1;i<6;i++) // Rows=5
				{
					for(int j=1;j<5;j++) //Columns=4
					{
						if(j==4)
						{
							driver.findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td["+j+"]//input")).click();
						}
						else
						{
							System.out.print(driver.findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td["+j+"]")).getText()+"\t\t");
						}
					}
					System.out.println();
				}
				if(k<5)
					driver.findElement(By.xpath("//ul[@id='pagination']//li["+k+"]//a")).click();
			}
			
			
			
		}
}
