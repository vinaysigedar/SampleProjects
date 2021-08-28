package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"))).build().perform();
		driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("vinay123@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		driver.close();

	}

}
