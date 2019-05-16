package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void main(String[]args) throws Exception
	{
		
		// 2/5/2019
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Web Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		/*
		 * Static drop downs to identify based on the Select Tag
		 * Its a traditional one
		 * 
		 */
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByIndex(2);   //based on heindex value
		Thread.sleep(2000);
		s.selectByValue("INR");
		Thread.sleep(2000);
		s.selectByVisibleText("USD");
		
		
		/*
		 * You can deselect selected options also
		 * 
		 */
	}
	
	
}
