package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Skyhopdate {

	public static void main(String[] args) throws InterruptedException {
		// 21/5/2019
	
		
		// Launch the Browser	
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa-new.skyhop.io/");
		driver.manage().window().maximize();
		
		//enter credentials
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("skyhopglobal");
		driver.findElement(By.xpath("//input[@name='user']")).sendKeys("skyhop1");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("test1234");
		
		//Hit search icon
		
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
		//explicit wait for page loading
		
		//Thread.sleep(50000);
		//WebDriverWait w = new WebDriverWait(driver, 50);
		
		WebDriverWait w=new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("ele_to_inv")));
		
		//w.until(ExpectedConditions.invisibilityOfElementLocated(By.id("fdate")));
		/*WebDriverWait w=new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("ele_to_inv")));*/
		//WebElement element = driver.findElement(By.id("fdate"));
		
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;

		jse.executeScript("arguments[0].click();", element); 
*/
		//driver.execute_script("arguments[0].click();", element)
		
	//	driver.findElement(By.id("fdate")).click();
		
		
		WebElement element = driver.findElement(By.id("fdate"));

		Actions actions = new Actions(driver);

		actions.moveToElement(element).click().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.id("nav-expander")).click();
		
		
		/*
		//select month using while loop
		while (!driver.findElement(By.cssSelector("[class='ui-datepicker-title'][class='ui-datepicker-month']")).getText().contains("December"))
		{
			driver.findElement(By.cssSelector("[class='ui-datepicker-next ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
		}

	}
*/
}
}
