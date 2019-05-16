package Excercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEdriver1 {
	
	//11-3-2019
	
		public static void main(String [] arg) 
		{
		
			System.setProperty("webdriver.ie.driver", "F:\\Web Drivers\\MicrosoftWebDriver.exe");
			WebDriver driver=new InternetExplorerDriver();
			
			driver.get("https://google.com/");
			String title=driver.getTitle();
			System.out.println(title);
			System.out.println(driver.getClass());//display driver in which class 
			System.out.println(driver.getCurrentUrl());//currently opened url
			
		}


}
