package day34;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	// Select Future Date
	static void selectFutureDate(WebDriver driver,String day,String month,String year)
	{
		// For Month and Year
			while (true) 
			{
				String curMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				String curYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				if(curMonth.equalsIgnoreCase(month) && curYear.equals(year))
				{
					break;
				}
				
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click(); // Next Month
			}
		
		// For Day
			for(int i=1;i<6;i++)
			{
				for(int j=1;j<8;j++)
				{
					String currDay = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr["+i+"]//td["+j+"]")).getText();	
					
					if(currDay.equals(day))
					{
						driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr["+i+"]//td["+j+"]")).click();
						break;
					}
				}
			}
	}
	
	//Select Past Date
	private static void selectPastDate(WebDriver driver, String day, String month, String year) 
	{
			// For Month and Year
				while (true) 
				{
					String curMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					String curYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					
					if(curMonth.equalsIgnoreCase(month) && curYear.equals(year))
					{
						break;
					}
					
					driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click(); // Previous Month	
				}
				
			// For Day
				for(int i=1;i<6;i++)
				{
					for(int j=1;j<8;j++)
					{
						String currDay = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr["+i+"]//td["+j+"]")).getText();	
						
						if(currDay.equals(day))
						{
							driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr["+i+"]//td["+j+"]")).click();
							break;
						}
					}
				}
	}
	


	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage()
				.timeouts()
				.implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage()
				.window()
				.maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		// Switch Frame
		driver.switchTo().frame(0);
		
		// Taking Input 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day (dd): ");
		String day = sc.next();
		System.out.print("Enter month (January): ");
		String month = sc.next();
		System.out.print("Enter year (yyyy): ");
		String year = sc.next();
		
		
		// Method-01 : using sendkeys
//			driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(month+"/"+day+"/"+year); // mm/dd/yyyy
		
		// Method-02 : using datepicker
			driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //opens datepicker
			
			// Select Future Date
			//selectFutureDate(driver, day, month, year);
		
			// Select Past Date
			selectPastDate(driver, day, month, year);
	}



	

}
