import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowrealtimeex {

	public static void main(String[] args) {
		// 5/20/2019

		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		
		driver.findElement(By.linkText("Help")).click();
		System.out.println("Before Switching");
		System.out.println(driver.getTitle());
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println("After Switching");
		System.out.println(driver.getTitle());
		
		System.out.println("Back to parent");
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
				
	}

}
