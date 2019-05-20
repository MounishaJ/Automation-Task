package Tasks;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy;

public class Assignment4windowhandles {

	public static void main(String[] args) {
		// 5/20/2019
		
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.linkText("Click Here")).click();
		//System.out.println(driver.getTitle());
       
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
	//	System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
		
		driver.switchTo().window(parentid);
	  // System.out.println(driver.getTitle());
	   System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
		
		
	}

}
