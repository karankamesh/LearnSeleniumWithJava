package learnSeleniumWithJava;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basics_6_WorkingWithDropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement dropdown1 = driver.findElement(By.className("ui-selectonemenu"));
		dropdown1.click();
		Select select = new Select(dropdown1);
		select.selectByIndex(1);
		
		WebElement dropdown2 = driver.findElement(By.id("j_idt87:auto-complete_input"));
		dropdown2.sendKeys("S");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//*[@id='j_idt87:auto-complete_panel']/ul/li"));
		System.out.println(options.size());
		for (WebElement webElement : options) {
			if (webElement.getText().contains("Selenium")) {
				webElement.click();
				break;
			}
		}
		
		WebElement dropdown3 = driver.findElement(By.id("j_idt87:country"));
		dropdown3.click();
		Thread.sleep(1000);
		List<WebElement> options1 = driver.findElements(By.xpath("//*[@class='ui-selectonemenu-items-wrapper']/ul/li"));
		System.out.println(options1.size());
		for (WebElement webElement : options1) {
			if (webElement.getText().contains("India")) {
				webElement.click();
				break;
			}
		}
		
		WebElement dropdown4 = driver.findElement(By.id("j_idt87:city"));
		dropdown4.click();
		Thread.sleep(1000);
		List<WebElement> options2 = driver.findElements(By.xpath("//*[@id='j_idt87:city_items']/li"));
		System.out.println(options2.size());
		for (WebElement webElement : options2) {
			if (webElement.getText().contains("Chennai")) {
				webElement.click();
				break;
			}
		}
		
		WebElement dropdown5 = driver.findElement(By.id("j_idt87:lang"));
		dropdown5.click();
		Thread.sleep(1000);
		List<WebElement> options3 = driver.findElements(By.xpath("//*[@id='j_idt87:lang_items']/li"));
		System.out.println(options3.size());
		for (WebElement webElement : options3) {
			if (webElement.getText().contains("Tamil")) {
				webElement.click();
				break;
			}
		}
		
		WebElement dropdown6 = driver.findElement(By.id("j_idt87:value"));
		dropdown6.click();
		Thread.sleep(1000);
		List<WebElement> options4 = driver.findElements(By.xpath("//*[@id='j_idt87:value_items']/li"));
		System.out.println(options4.size());
		for (WebElement webElement : options4) {
			if (webElement.getText().contains("இரண்டு")) {
				webElement.click();
				break;
			}
		}
		
	}

}
