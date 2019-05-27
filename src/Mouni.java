import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouni {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// 23/5/2019

		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qa-new.skyhop.io/site/sessions");
		driver.manage().window().maximize();

//login credentials
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("skyhopglobal");
		driver.findElement(By.xpath("//input[@name='user']")).sendKeys("accounting");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("test1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.get("https://qa-new.skyhop.io/site/vehicle");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("[class='widget-buttons'] [data-slidepanel='panel']")).click();
		Thread.sleep(3000);

//scroll the page
		scroll(driver.findElement(By.id("v_l_expiry")));

//selectAirport
		String[] str = { "bna","tpa"  };
		for (int i = 0; i < str.length; i++) {

			selectAirport(str[i]);
		}

	}

	public static void selectAirport(String str) throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		int size = driver.findElements(By.xpath("//label[@class='checkbox']")).size();
		
		for (int i = 0; i < size; i++) {
			String text = driver.findElements(By.xpath("//label[@class='checkbox']")).get(i).getText();
			if (text.equalsIgnoreCase(str)) {
				driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(str);
				Thread.sleep(2000);
				driver.findElements(By.xpath("//label[@class='checkbox']")).get(i).click();
				driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.CONTROL + "a", Keys.DELETE);
				driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
				break;
			}
		}

	}

	public static void scroll(String id) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element;
		 element = driver.findElement(By.id(id));
		 // now execute query which actually will scroll until that element is not appeared on page.
		 
		je.executeScript("arguments[0].scrollIntoView(true);",element);
	
	}
	
	public static void scroll(WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		
		 // now execute query which actually will scroll until that element is not appeared on page.
		 je.executeScript("arguments[0].scrollIntoView(true);",element);
	
	}
}
/*https://phptravels.com/demo/

http://thedemosite.co.uk/

http://newtours.demoaut.com/

 http://the-internet.herokuapp.com/

http://automationpractice.com/index.php

http://book.theautomatedtester.co.uk/

 https://s1.demo.opensourcecms.com/wordpress/*/
