package Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTask {

	public static void main(String[] args) {
		// 29/5/2019
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement table=driver.findElement(By.id("product"));
		int rowcount=table.findElements(By.tagName("tr")).size();
		int columncount=table.findElements(By.tagName("th")).size();
		System.out.println(rowcount);
		//System.out.println(columncount);
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());


		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));


		System.out.println(secondrow.get(0).getText());


		System.out.println(secondrow.get(1).getText());


		System.out.println(secondrow.get(2).getText());

		}

	}

