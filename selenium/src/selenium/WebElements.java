package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements {

	public static void main(String[] args) {
       System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\Documents\\Selenium\\GeckoDriver\\geckodriver.exe");
		
		// through dynamic binding 
		WebDriver driver=new FirefoxDriver();
		
		
		// to open the browser and open the website in the browser
		driver.get("https://www.google.com");
		
		// find page elements by its ID 
		WebElement element =driver.findElement(By.id("APjFqb"));
		
	/* CLICK AND GIVE INPUT */
		
		// give the text we want to search in google
		element.sendKeys("Lion Images");
		
		// after  type our search press ENTER
		element.sendKeys(Keys.ENTER);
		
		// to clear the text inside the text box
		element.clear();
		
  /* TO GET THE ATTRIBUTES AND CSS VALUES OF THE ELEMENT */
		
		// to get the inner text of the element
		String text=element.getText();
		
		// to get the tag name of the element
		String tagName=element.getTagName();
		
		// to get the value of the text box attribute 
		String value=element.getAttribute("title");
		
		// to get the CSS value of the element
		String cssValue=element.getCssValue("font-family");
		
		
		System.out.println("Tag Name : "+ tagName);
		System.out.println("Text : "+ text);
		System.out.println("title : "+ value);
		System.out.println("font-family : "+ cssValue);
		
		/* OUR ELEMENTS ARE IN THE STATE */
		
		// is our element is visble
		boolean isvisible=element.isDisplayed();
		
		// our element is on the enable state
		boolean isEnable=element.isEnabled();
		
		//our element is selected
		boolean isSelect=element.isSelected();
		
		System.out.println("visible : "+ isvisible);
		System.out.println("isEnable: "+ isEnable);
		System.out.println("select : "+ isSelect);
		

	}

}
