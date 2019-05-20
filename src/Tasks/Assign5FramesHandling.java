package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5FramesHandling {

	public static void main(String[] args) {
		// 5/20/2019
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Nested Frames")).click();
	  driver.switchTo().frame("frame-top");
	  driver.switchTo().frame("frame-middle");
	  System.out.println(driver.findElement(By.id("content")).getText());

		
		
	}

}
