package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyDate {

	public static void main(String[] args) {
		// 21/5/2019
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.path2usa.com/travel-companions");
		
		
		driver.findElement(By.id("travel_date")).click();
		
		//select which month you want                 parent                       child    
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='prev']")).click();
		}
		
		
		
		//identify common attribute from date and based on the common attribute u can select date only
		List<WebElement> dates= driver.findElements(By.className("day"));
		int count=driver.findElements(By.className("day")).size();  //here da is common class name
		
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("21"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
