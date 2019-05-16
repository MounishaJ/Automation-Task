package Excercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriver1 {

	//11-3-2019
	public static void main(String [] arg)
	{
		
			//Create Driver object
		                  //      Key                              value                   
		System.setProperty("webdriver.chrome.driver", "F:\\Web Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		// i need to hit the google.com browser
		driver.get("https://google.com");
		System.out.println(driver.getClass());
		
	}
}
