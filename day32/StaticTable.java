import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage()
				.timeouts()
				.implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// 1. Find Total number of Rows in Book Table
			List<WebElement> tableRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
			System.out.println("Rows In Table : "+tableRows.size());
		
		// 2. Find Total number of Column in Book Table
			int columnSize = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
			System.out.println("Columns in Table : "+columnSize);
		
		// 3. Read data from Specific row and Column eg. 4th row and 2nd column
			String str = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]")).getText();
			System.out.println("Name of Author : "+str);
		
		// 4. Read All data from Table
//		
//			//Approach-01
//			List<WebElement> data = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td"));
//			
//			for(int i=0;i<data.size();i++)
//			{
//				System.out.print(data.get(i).getText()+"\t");
//				if((i+1)%4==0)
//				{
//					System.out.println();
//				}
//			}
			
			//Approach-02
			
			System.out.println("BookName\t"+"Author\t"+"Subject\t"+"Price");
			for(int r=2;r<8;r++)
			{
				for(int c=1;c<5;c++)
				{
					String str1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
					System.out.print(str1+"\t");
				}
				System.out.println();
			}
		
		// 5. Print all books whose Author is Mukesh
			System.out.println("Books By Mukesh");
			for(int r=2;r<8;r++)
			{
					String str1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
					if(str1.equalsIgnoreCase("Mukesh"))
					{
						String authorsBook = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
						System.out.println("Book : "+authorsBook);

					}
			}
		
		// 6. Total Prize of All Books
			int total=0;
			for(int r=2;r<8;r++)
			{
					String str2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
					int prize = Integer.parseInt(str2);
					total = total+prize;	
			}		
			System.out.print("Total Prize Of All Books : "+total);
			
			
	}

}
