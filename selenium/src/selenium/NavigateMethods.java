package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateMethods {

	public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\Documents\\Selenium\\GeckoDriver\\geckodriver.exe");
		
		// through dynamic binding 
		WebDriver driver=new FirefoxDriver();
		
		// to open the browser and open the website in the browser
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.javatpoint.com");
		
		// to go to the next page before the current page loaded completely
		driver.navigate().to("https://www.javatpoint.com/mysql-tutorial");
		
		// to come back
	    driver.navigate().back();
		
		// to go to the prevoius tab
		driver.navigate().forward();
		
		// to refersh the page
		driver.navigate().refresh();
		System.out.println("Hello bro");
	}

}
