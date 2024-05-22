package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.netty.handler.codec.http.Cookie;

public class ManageCommonds {
public static void main(String[] args) {
		
		                 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\Documents\\Selenium\\GeckoDriver\\geckodriver.exe");
		
		// through dynamic binding 
		WebDriver driver=new FirefoxDriver();
		
		// to open the browser and open the website in the browser
		driver.get("https://www.google.com");
		
		Set<org.openqa.selenium.Cookie> cookie=driver.manage().getCookies();
}
}
