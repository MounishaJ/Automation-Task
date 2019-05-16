package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertions {

	
	
	public static void main(String []arg) throws Exception
	{
		
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		
		driver.findElement(By.id("divpaxinfo")).click();
			
		
	 driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	 driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	 driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		 driver.findElement(By.id("btnclosepaxoption")).click();
	
	
		
		
	}
}
/*   5-8-2019
 *  Assertions 
 *  
 *   An assertion is used to compare the actual result of an application with the expected result.
     The assertion is considered to be met if the actual result of an application matches with that of the expected result.
 *    Reduce the coding lines
 *    use predefined methods
 *   Assertion methods are assertFalse(),assertTrue(),assertEquals(),assertNull().assertNotNull(),assertSame(),assertNotsame()
 *  If u perfor validation then asserts are useful because if u compare 2 things then the results print console andthen check both are equal or not but in asserts single lin eitchecks and if asserts fail it stops there only it wont move next line execution
 */

