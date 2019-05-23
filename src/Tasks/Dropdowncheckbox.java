package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowncheckbox 
{
	static WebDriver driver;
			public static void main(String []arg)
			{
				
			System.setProperty("webdriver.chrome.driver", "F:\\Web Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.anztechnologies.com/jquery-demo/jquery-demo2.php?ex=63.0_1");
				
			String[] str= {"CSS","Oracle","Bootstrap"};
		    for (int i = 0; i < str.length; i++) 
		    {
//			   System.out.println(str[i]);
		       display(str[i]);
			} 
			}
			
		public static void display(String exp)
		{
		driver.findElement(By.className("fs-label")).click();
		int count=driver.findElements(By.className("fs-option-label")).size();
		System.out.println(count);
				
		 for(int i=0;i<count;i++)
		 {
			
			String text= driver.findElements(By.className("fs-option-label")).get(i).getText();
			System.out.println(text);
			
			if(text.equalsIgnoreCase(exp))
			{
				driver.findElements(By.className("fs-option-label")).get(i).click();
				driver.findElement(By.className("fs-label")).click();
				break;
			}
		 }
		}
}
