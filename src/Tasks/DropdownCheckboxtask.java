package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropdownCheckboxtask {

	public static void main(String[] args) throws InterruptedException {
		// 21/5/2019
		
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.anztechnologies.com/jquery-demo/jquery-demo2.php?ex=63.0_1");
		
				
		driver.findElement(By.xpath("//div[@class='fs-label']")).click();
	//total check box count
		int count=driver.findElements(By.xpath("//span[@class='fs-checkbox']")).size();
		System.out.println(count);
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("sql");
		driver.findElement(By.xpath("(//span[@class='fs-checkbox'])[2]")).click();
		
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.CONTROL + "a",Keys.DELETE);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ora");
		driver.findElement(By.xpath("(//div[@class='fs-option-label'])[3]")).click();
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.CONTROL + "a",Keys.DELETE);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='fs-label']")).click();
		
			
			
		}

}

/*
 * WebElement toClear = driver.findElement("locator");
toClear.sendKeys(Keys.CONTROL + "a");
toClear.sendKeys(Keys.DELETE);
 */
