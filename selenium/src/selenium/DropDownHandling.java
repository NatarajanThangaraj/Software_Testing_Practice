package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
	public static void main(String[] args) {
	       System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\Documents\\Selenium\\GeckoDriver\\geckodriver.exe");
			
			// through dynamic binding 
			WebDriver driver=new FirefoxDriver();
			
			
			// to open the browser and open the website in the browser
			driver.get("https://www.google.com");
			
			// find page elements by its ID 
			WebElement element =driver.findElement(By.id("APjFqb"));
			
			//Select the Drop-Down 
			Select dropDown=new Select(element);
			
   // 1. to select a option based on the INDEX
			dropDown.selectByIndex(0);
			
  // 2. to select a option based on the value
			dropDown.selectByValue("java");
			
 // 3. to select a option based on the visible text in the option
			dropDown.selectByVisibleText("JavaNotes");	
			
 // 4.to get all  options in the dropdown
		List<WebElement>list=dropDown.getOptions();
		
 System.out.println("Options in the DropDown "+list);		
	}
}
