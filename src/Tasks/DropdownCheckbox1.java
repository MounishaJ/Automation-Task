package Tasks;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownCheckbox1 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		// 23/5/2019
		
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.anztechnologies.com/jquery-demo/jquery-demo2.php?ex=63.0_1");
		
		String[] str= {"CSS","Ora","Boot"};
	    for (int i = 0; i < str.length; i++) 
	    {
//	    	System.out.println("array " + str[i]);
	    	search(str[i]);
		} 
	}
	
	public static void search(String str) throws InterruptedException 
	{
//total count of checkboxes in dropdown
		driver.findElement(By.className("fs-label")).click();
		
		
		int total=driver.findElements(By.className("fs-option-label")).size();
//		System.out.println("count" + total);
	
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(str);
		
		for(int i=0;i<total;i++)
		{
		String name=driver.findElements(By.className("fs-option-label")).get(i).getText();
		
		
		
		if(name.contains(str))
		{
			 		
			driver.findElements(By.className("fs-option-label")).get(i).click();
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.CONTROL + "a", Keys.DELETE);
			driver.findElement(By.className("fs-label")).click();
			break;
		}
		
		}
	}
	

}
