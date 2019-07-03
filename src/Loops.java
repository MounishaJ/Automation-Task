

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loops {

////div[@id='customer_list_filter']//input[@placeholder='Search']
																					//	innerText
	 //String content = (String)((JavascriptExecutor)driver).executeScript("arguments[0].innerHTML;", cp.Searchedword());

			// System.out.println("rdtyy"+(String)((JavascriptExecutor)driver).executeScript("arguments[0].innerHTML;", cp.search()));
	//hidden_text = element.get_attribute("textContent")
			
	public static void main(String []args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://projects.appdevelopment.com/bac_qa_43298787/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("mjeela@compindia.com");
		driver.findElement(By.id("password")).sendKeys("test123@");
		driver.findElement(By.id("login_submit")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("solution",Keys.ENTER);
		//driver.findElement(By.xpath(" //span[@class='check_box_txt']")).click();
		Thread.sleep(3000);
		System.out.println("mytext"+driver.findElement(By.xpath("//input[@type='search']")).getAttribute("value"));
		
	}
}
// 
