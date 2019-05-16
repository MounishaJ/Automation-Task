package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown1 {
	
	
	/* 3/5/2019
	 *  parent to child traverse
	 * 
	 */
	public static void main(String []arg)
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Web Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
	/*	If duplicate elements are there then u can choose based on the indexes  
	 * 
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
	*/
		
		//another way parent to child traverse
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BOM']")).click();   //parent to child traverse
		
		
		
		
	}

}
