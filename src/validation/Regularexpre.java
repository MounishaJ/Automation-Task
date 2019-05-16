package validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regularexpre {

	public static void main(String []arg)
	{
	
		 System.setProperty("webdriver.chrome.driver","F://Web Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();

	
	driver.get("https://www.rediff.com/");
	//regular expression with xpath
	driver.findElement(By.cssSelector("a[title='sign in']")).click();
	
	
	
	}

}