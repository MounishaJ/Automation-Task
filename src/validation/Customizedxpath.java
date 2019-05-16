package validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customizedxpath {

	//Customized xpath create xpath by using syntax as //tagname[@attribute='value'
	
	
	public static void main(String []arg)
	{
		
		System.setProperty("webdriver.chrome.driver","F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//<input id="username" class="input r4 wide mb16 mt8 username" type="email" name="username" >
  
//customized xpath  //input[@id='username']  //input[@class='input r4 wide mb16 mt8 username']   //input[@type='email']  //input[@type='username']
		
	
	
	driver.get("https://login.salesforce.com/?locale=in");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jeelamounisha");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("um2128");
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	//class="loginError"
	String errormsg=driver.findElement(By.id("error")).getText();
	System.out.println(errormsg);
	}
	
	
}
