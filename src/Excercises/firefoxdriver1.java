package Excercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxdriver1 {
	
	//11-3-2019
	
	public static void main(String [] arg) 
	{
	
		System.setProperty("webdriver.gecko.driver", "F:\\Web Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getClass());//display driver in which class 
		System.out.println(driver.getCurrentUrl());//currently opened url
		
	}

}
