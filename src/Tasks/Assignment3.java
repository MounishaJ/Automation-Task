package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
/* 14-5-2019
 * 
 */

		
		System.setProperty("webdriver.chrome.driver", "F://Web drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		
		driver.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
		System.out.println(driver.findElement(By.id("results")).getText());
	}

}
