package CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 5/2/2019
		 * Css selector is 10 times faster than X-path 
		 * 
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Web Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("mounisha");
		driver.findElement(By.cssSelector("#password")).sendKeys("2128");
		driver.findElement(By.cssSelector("input[id='Login']")).click();
		
	}

}
