import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesHandling {

	public static void main(String[] args) {
		// 5/20/2019
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		//driver.switchTo().frame(1);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		//switch frame by using indexvalue
		driver.switchTo().frame(0);
		
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement destination=driver.findElement(By.id("droppable"));

		a.dragAndDrop(source, destination).build().perform();
		driver.switchTo().defaultContent();  //comeback to normal browser
	}

}
