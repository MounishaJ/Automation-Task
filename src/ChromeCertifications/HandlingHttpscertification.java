package ChromeCertifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingHttpscertification {

	public static void main(String[] args) {
		// 29/5/2019
		
		
		
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
//another way
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
//below toyour localbrowser
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.google.com/");
	}

}
