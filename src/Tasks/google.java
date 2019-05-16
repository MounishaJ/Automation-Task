package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String []arg)
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Web Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			
//			driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("monisha");
			
			
			driver.findElement(By.xpath("(//a[@class='gb_d'])[2]")).click();
			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Mounisha");
	}
}
