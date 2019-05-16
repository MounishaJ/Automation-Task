package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autosuggestivedropdown {

	public static void main(String[] args) throws Exception {

			/*	3/5/2019
			 *   Autosuggestions dropdowns to select option
			 *   makemytrip.com 
			 */
		
		System.setProperty("webdriver.chrome.driver", "F:\\Web Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
			
		/* 6/5/2019
		 *  Auto suggestive drop down handling
		 *  Here from and to both fields are auto suggestive fields  
		 */
		
		// id =fromCity  From field
		
		    driver.findElement(By.id("fromCity")).click();
		    WebElement source= driver.findElement(By.xpath("//input[@placeholder='From']"));
		    		source.sendKeys("MAA");
					Thread.sleep(2000);
	            source.sendKeys(Keys.ARROW_DOWN);
			    source.sendKeys(Keys.ENTER);
		  
		//To field
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("MUM");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
		
		
		//departure date 
		
		driver.findElement(By.id("departure")).sendKeys("");
		
		
	}

}
