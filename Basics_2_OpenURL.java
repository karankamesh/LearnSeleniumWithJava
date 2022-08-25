package learnSeleniumWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics_2_OpenURL {

	public static void main(String[] args) throws InterruptedException {
		//In this project I used Firefox Browser.
		System.setProperty("webdriver.gecko.driver", "Location of geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//.get-helps to redirect to the given website mentioned in between the brackets.
		driver.get("https://www.google.com");
		

		//.findElement-helps to locate Elements(Such as Buttons, Text Field, Checkbox etc..)in Web Page.
		//By the help of Locators(Such as id, class name, name, XPath etc..).will discuss about Locators in upcoming files.
		//.sendKeys helps to send Text to Text Field.
		driver.findElement(By.name("q")).sendKeys("Sundar Pichai"+Keys.ENTER);
		
		Thread.sleep(3000); // This line helps to wait for the give time before executing next line.  In real time we should not use this
		
		//.close-helps to close the current window.
		driver.close();

	}

}
