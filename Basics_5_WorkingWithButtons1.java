package learnSeleniumWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics_5_WorkingWithButtons1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium Tools\\Firefox Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/button.xhtml");

		WebElement button1 = driver.findElement(By.id("j_idt88:j_idt90"));
		button1.click();
		String title = driver.getTitle();
		System.out.println("The Tttle is " + title);
		
		driver.navigate().back();
		
		WebElement button2 = driver.findElement(By.id("j_idt88:j_idt92"));
		if (button2.isEnabled()) {
			System.out.println("The Button is Enable");
		}else {
			System.out.println("The Button is Disabled");
		}
		
		WebElement button3 = driver.findElement(By.id("j_idt88:j_idt94"));
		Point location = button3.getLocation();
		int xaxis = location.getX();
		int yaxis = location.getY();
		System.out.println("The Xaxis is :"+xaxis +" " +"The Yaxis is :"+yaxis);
		
		WebElement button4 = driver.findElement(By.id("j_idt88:j_idt96"));
		String buttoncolor = button4.getCssValue("color");
		System.out.println(buttoncolor);

	}

}
