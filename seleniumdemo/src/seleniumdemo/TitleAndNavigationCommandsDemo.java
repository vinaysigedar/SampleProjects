package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TitleAndNavigationCommandsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\C5303772\\OneDrive - SAP SE\\Katalon_Studio_Windows_64-7.6.2\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		// Get the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equalsIgnoreCase("Google")) {
			System.out.println("The title of the page is correct." + title);
		} else {
			System.out.println("Page Not Found");
		}
		driver.navigate().to("https://www.amazon.com");
		// Wait for certain element to present
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()=\"Hello, Sign in\"]")));
		title = driver.getTitle();
		System.out.println(title);
		// Navigate back to page
		driver.navigate().back();
		// Move forward
		driver.navigate().forward();
		// Refresh the page
		driver.navigate().refresh();
		// Quit the driver
		driver.quit();
	}

}
