import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkarte2e {

	public static void main(String[] args) {
		// 20/5/2019
		
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles");

	}

}
