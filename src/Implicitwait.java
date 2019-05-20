import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {
	/*
	 * 14-5-2018
	 */
	public static void main(String []arg)
	{
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(" https://www.alaskaair.com/hotels/mp/home/en/?t=1558325639740&utm_source=alaska&utm_medium=partner-page&utm_campaign=alaska-globalnav-wherewefly-Q12019-home-tr");
		
		driver.findElement(By.xpath("//input[@name='Location']")).sendKeys("ooty");
		driver.findElement(By.xpath("//input[@name='Location']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@name='Location']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//button[@class='btn wl-btn-search search-submit-btn big']")).click();
		driver.findElement(By.className("//span[@class='ng-binding']")).click();
	
		
		

		 driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		 driver.findElement(By.id("H-destination")).sendKeys("nyc");
		 driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		 driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

		 //WebDriverWait d=new WebDriverWait(driver,20);
		 //d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
		 //Thread.sleep(5000L);

		 driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();
		    

	
	
	}

}
