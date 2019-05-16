package Excercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods {

	public static void main(String []args)
	{
	
		
		System.setProperty("webdriver.chrome.driver", "F:\\Web Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
//		driver.close();
		
		
		
	}
	
}
