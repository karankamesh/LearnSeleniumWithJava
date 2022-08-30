package learnSeleniumWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Basics_5_WorkingWithButtons2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium Tools\\Firefox Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		WebElement size = driver.findElement(By.id("j_idt88:j_idt98"));
		int width = size.getSize().getWidth();
		int height =size.getSize().getHeight();
		System.out.println("The Width of the Button : "+width+" "+"The Height of the Button : "+height);
		
		WebElement mouseover = driver.findElement(By.id("j_idt88:j_idt100"));
		Thread.sleep(2000);
		String color = mouseover.getCssValue("background");
		System.out.println(color);
		
		Actions action = new Actions(driver);
		action.moveToElement(mouseover).build().perform(); 
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).getCssValue("background-color"));
		 
		WebElement imagebutton = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		imagebutton.click();
	}

}
