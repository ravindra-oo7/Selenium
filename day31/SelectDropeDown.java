package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropeDown {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage()
				.timeouts()
				.implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage()
				.window()
				.maximize();
		
		WebElement dropDownElement= driver.findElement(By.xpath("//select[@id='country']"));
		
		Select selectDrpDwn = new Select(dropDownElement);

	//Select Option from drop down
		
		//selectDrpDwn.selectByVisibleText("Japan");
		//selectDrpDwn.selectByValue("japan");
		selectDrpDwn.selectByIndex(6);
		
	//Capture the options from the dropedown
		
		List<WebElement> options= selectDrpDwn.getOptions();
		System.out.println("Number Of Options : "+options.size());
		for (WebElement webElement : options) 
		{
			System.out.println(webElement.getText());
		}
	
		
		
	}

}
