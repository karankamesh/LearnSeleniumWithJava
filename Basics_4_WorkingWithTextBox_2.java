package learnSeleniumWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics_4_WorkingWithTextBox_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium Tools\\Firefox Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		driver.findElement(By.name("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String age = driver.findElement(By.className("ui-message-error-detail")).getText();
		if (age.equalsIgnoreCase("age is mandatory")) {
			System.out.println("There is A Error Message");
		}
		
		driver.findElement(By.name("j_idt106:float-input"));
		Point position = driver.findElement(By.id("j_idt106:j_idt113")).getLocation();
		driver.findElement(By.name("j_idt106:float-input")).click();
		Point position1 = driver.findElement(By.id("j_idt106:j_idt113")).getLocation();
		if (position.equals(position1)) {
			System.out.println("The Position is Not Changed");		
		}else {
			System.out.println("The Position is Changed");
		}
		
		driver.findElement(By.name("j_idt106:auto-complete_input")).sendKeys("Karan");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span/ul/li[@role='option'][3]")).click();
		
		driver.findElement(By.name("j_idt106:j_idt116_input")).sendKeys("10/12/1997");
	    WebElement DOB = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[1]/a"));
	    String DOB2 = DOB.getAttribute("class");
		if (DOB2.contains("active")) {
			System.out.println("The Date is Selected");
			DOB.click();
		}
		WebElement spin = driver.findElement(By.name("j_idt106:j_idt118_input"));
		spin.sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='ui-button-text'])[3]")).click();
		String afterspin = driver.findElement(By.name("j_idt106:j_idt118_input")).getText();
		if (!spin.equals(afterspin)) {
			System.out.println("The Value Is Changed");	
		}else {
			System.out.println("The Value Is Not Changed");
		}
		
		driver.findElement(By.name("j_idt106:slider")).sendKeys("60");
		Thread.sleep(1000);
		String slider = driver.findElement(By.xpath("//div[@id='j_idt106:j_idt120']/span")).getAttribute("style");
		System.out.println(slider);
		if (slider.contains("60")) {
			System.out.println("The Slider Moves correctly");
		}else {
			System.out.println("The Slider Doesn't Move");
		}
		
		driver.findElement(By.name("j_idt106:j_idt122")).click();
		if (driver.findElement(By.xpath("/html/body/div[4]")).isDisplayed()) {
			System.out.println("The KeyBoard is Displayed");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/button[13]")).click();
		}else {
			System.out.println("The KeyBoard is Not Displayed");
		}
		
		

	}

}
