package learnSeleniumWithJava;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics_7_WorkingWithRadiobutton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/radio.xhtml");

		List<WebElement> checkBox1 = driver.findElements(By.xpath("//*[@id='j_idt87:console1']/tbody/tr/td"));
		Thread.sleep(1000);
		for (WebElement webElement : checkBox1) {
			if (webElement.getText().equalsIgnoreCase("firefox")) {
				webElement.click();
				break;
			}
		}	
		
	}
}