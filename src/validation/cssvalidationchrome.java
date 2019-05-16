package validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssvalidationchrome {
	
	public static void main (String []ar) 
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Jeela");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("UM");
		
//		driver.close();
		
	}

}
