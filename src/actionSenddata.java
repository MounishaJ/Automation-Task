import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionSenddata {

	public static void main(String[] args) {
		//20/5/2019

		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement move=driver.findElement(By.id("twotabsearchtextbox"));
		/*move to the search box and click search box enter text with uppercase letters on it
		 */
		Actions a=new Actions(driver);
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("mobiles").build().perform();
		
		//move to search box select the string value
		a.moveToElement(move).doubleClick().build().perform();
		
		
		//move to element and then right click on that contextclick is right click in selenium
		
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		
		
		
		//hold one topic is Dragand Drop
	}

}
