package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Datewithbasic {

	public static void main(String[] args) {
		
		/* 5-10-2019
		 * Date selection with basic only later lectures it explains in deeply
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://book.spicejet.com/");
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
//		
//driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
//	
//	////a[@class='ui-state-default ui-state-highlight ui-state-active'] 	
//		
//	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
//		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		
//		
//
	}

}
