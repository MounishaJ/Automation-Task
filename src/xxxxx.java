import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xxxxx {

	WebDriver driver;
	
	@Test
	public void test()
	{
	System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://projects.appdevelopment.com/bac_qa_43298787/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys("solution");
	System.out.println(driver.findElement(By.xpath("//input[@type='search']")).getText());
	

}
}