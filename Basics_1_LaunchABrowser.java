package learnSeleniumWithJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics_1_LaunchABrowser {

	public static void main(String[] args) {

		// How to open Chrome browser using Selenium+Java
		System.setProperty("webdriver.chrome.driver", "Location of chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.close();

		//How to open Microsoft Edge browser using Selenium+Java 
		System.setProperty("webdriver.edge.driver", "Location of msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		driver1.close();

		//How to open Firefox browser using Selenium+Java
		System.setProperty("webdriver.gecko.driver", "Location of geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.close();



	}

}