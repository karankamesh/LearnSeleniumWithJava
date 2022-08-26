package learnSeleniumWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics_3_TypesOfLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium Tools\\Firefox Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//For this locator practices I used the below link. 
		driver.get("https://www.google.com");
		
		//1. className - helps to Locates an element using the Class attribute.
		driver.findElement(By.className("")); 
		
		//2. id - helps to Locates an element using the ID attribute.
		driver.findElement(By.id(""));
		
		//3. name - helps to Locates an element using the Name attribute.
		driver.findElement(By.name(""));
		
		//4. tagName - helps to Locates an element using the HTML tag.
		driver.findElement(By.tagName("")); 
		
		//5. linkText - helps to Locates a link using link text.
		driver.findElement(By.linkText(""));
		
		//6. partialLinkText - helps to Locates a link using the link's partial text.
		driver.findElement(By.partialLinkText("")); 
		
		//7. xpath - helps to Locates an element using XPath query.
		driver.findElement(By.xpath(""));  
		
		//8. cssSelector - helps to Locates an element using the CSS selector.
		driver.findElement(By.cssSelector(""));     
		
		//We will use this locators in upcoming projects and in that project each locators will be explained.
		 
	}	

}
