package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println("The title of the page is "+title);
		driver.close();
		

	}

}
