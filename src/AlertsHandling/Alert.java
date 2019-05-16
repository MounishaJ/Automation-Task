package AlertsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	//5-8-2019
	/*java alerts(popups) 
	 * If u can see html code then its web related popups
	 * If the popup is not related to html then its java popups
	 * handling java alerts using webdriver API
	 */
	public static void main (String []arg) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("mounisha");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();    //alert cancel,dismiss
		driver.findElement(By.xpath("//input[@name='submit']")).click(); 
		Thread.sleep(5000);
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		driver.switchTo().alert().accept(); //alert accepts,ok,Done
		driver.switchTo().alert().accept();
		
		/*
		 * Java Alert some alerts have text booxes to enter.
		 * so you can switch to alert and then use sendkeys to entre the text on alert text boxes. 
		 * driver.switchTo().alert().sendkeys("mounisha");
		 */
		
	}
	
	
}
