package learnSeleniumWithJava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics_8_WorkingWithCheckBox {

	public static void main(String[] args) throws InterruptedException {

		String[] Language = { "Java", "Python", "C-Sharp" };
		String[] cities = { "Miami", "London", "Berlin" };

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");

		WebElement checkBox1 = driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']/div[2]"));
		Thread.sleep(2000);
		checkBox1.click();

		WebElement checkBox2 = driver.findElement(By.id("j_idt87:j_idt102_input"));
		String text = checkBox2.getAttribute("disabled");
		if (text.equalsIgnoreCase("disabled")) {
			System.out.println("The Checkbox is Enabled");
		} else {
			System.out.println("The Checkbox is Disabled");
		}
		List<WebElement> languages = driver.findElements(By.xpath("//*[@id='j_idt87:basic']/tbody/tr/td"));
		for (int i = 0; i < languages.size(); i++) {
			String Favouritelang = languages.get(i).getText();
			List langlist = Arrays.asList(Language);
			if (langlist.contains(Favouritelang)) {
				driver.findElements(By.xpath("//*[@id='j_idt87:basic']/tbody/tr/td")).get(i).click();
			}
		}

		WebElement checkBox3 = driver.findElement(By.id("j_idt87:multiple"));
		checkBox3.click();

		List<WebElement> city = driver.findElements(By.xpath("//*[@class='ui-selectcheckboxmenu-items-wrapper']/ul/li/label"));
		for (int i = 0; i < city.size(); i++) {
			System.out.println(city.get(i).getText());
			String favoCity = city.get(i).getText();
			List citylist = Arrays.asList(cities);
			if (citylist.contains(favoCity)) {
				driver.findElements(By.xpath("//*[@class='ui-selectcheckboxmenu-items-wrapper']/ul/li/label")).get(i).click();
			}
		}
		
		driver.quit();

	}

}
