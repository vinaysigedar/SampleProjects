package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\C5303772\\OneDrive - SAP SE\\Katalon_Studio_Windows_64-7.6.2\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().back();
		String title=driver.getTitle();
		System.out.println("The tile of the page is "+title);
		driver.navigate().forward();
		title=driver.getTitle();
		System.out.println("The tile of the page is "+title);
		driver.navigate().refresh();
		driver.close();
	}

}
