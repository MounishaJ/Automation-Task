package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveAssignment {

	static WebDriver driver;
	public static void main(String[] args) {
		// 27/5/2019
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script ="return document.getElementById(\"autocomplete\").value;";
		String text=(String) js.executeScript(script);
		//System.out.println(text);
		  int i=0;
		while(!text.equalsIgnoreCase("India"))
		{
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
		
		

	}

}
}
