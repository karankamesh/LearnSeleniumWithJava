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
		WebElement options1 = driver.findElement(By.id("j_idt87:country_input"));
		Select select1 = new Select(options1);
		int options2 = select1.getOptions().size();
		System.out.println(options2);
		select1.selectByValue("India");
	}

}
