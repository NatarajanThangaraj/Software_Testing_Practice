package selenium;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DriverMethods {

	public static void main(String[] args) {
		
		//                   which web driver we use     absolute path of the browserDriver.exe
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\Documents\\Selenium\\GeckoDriver\\geckodriver.exe");
		
		// through dynamic binding 
		WebDriver driver=new FirefoxDriver();
		
		// to open the browser and open the website in the browser
		driver.get("https://www.google.com");
		
		driver.get("https://www.javatpoint.com");
		
		// to get the current URL of the web page
		String url= driver.getCurrentUrl();
		
		
		// to get the web page title
		String title=driver.getTitle();
		
		
		// to get the page source like(HTML,CSS,JS code) locaters,ID class name etc.
		String src=driver.getPageSource();
		
		
		// to get the unique id of the current window
		String windowHandle=driver.getWindowHandle();
		
		
		// to get the all unique id of the multiple windows
		Set<String> windowHandles=driver.getWindowHandles();
		
		
		
		System.out.println("  URL "+url);
		System.out.println("  Title "+title);
		//System.out.println(" page source  "+src);
		System.out.println(" window handle "+windowHandle);
		System.out.println(" window handles "+ windowHandles);
	}

}
