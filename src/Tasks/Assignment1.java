package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
	/*    5-9-2019
	 * Prerequisite Flow :
		Navigate to Below URL:
		http://qaclickacademy.com/practice.php
		There are 3 Checkboxes displayed in the Page. Refer below image
	Questions for this Assignment
		Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		How to get the Count of number of check boxes present in the page
	 * 
	 */
		
		//1=> Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
//		driver.findElement(By.id("checkBoxOption1")).click();
//		System.out.println(driver.findElement(By.id("checkBoxOption1")));
//		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		

		
		//How to get the Count of number of check boxes present in the page
		
		
		
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		
	}

}
