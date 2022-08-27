package learnSeleniumWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics_4_WorkingWithTextBox_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium Tools\\Firefox Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/input.xhtml");

		driver.findElement(By.name("j_idt88:name")).sendKeys("Karan");
		
		driver.findElement(By.name("j_idt88:j_idt91")).sendKeys(" Example");
		
		boolean disabled = driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
		System.out.println("The Text Box is Enabled :"+disabled);
		
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		
		String text =  driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
		System.out.println("The Text is : "+text);
		
                driver.findElement(By.name("j_idt88:j_idt99")).sendKeys("example@gmail.com"+Keys.TAB);
                WebElement control = driver.switchTo().activeElement();
                String value = control.getAttribute("placeholder");
		if (value.equals("About yourself")) {
			System.out.println("The control is Moved");
			control.sendKeys("My Name Is Karan");
		}else {
			System.out.println("The control is Not Moved");
		}
		
		

	}

}
