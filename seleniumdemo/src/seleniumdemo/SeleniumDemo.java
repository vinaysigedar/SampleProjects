package seleniumdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\C5303772\\OneDrive - SAP SE\\Katalon_Studio_Windows_64-7.6.2\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//a[@class=\"gb_C\"]")).click();
		WebElement ele = driver.findElement(By.xpath("//iframe[@role=\"presentation\"]"));
		driver.switchTo().frame(ele);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@jsname and @jsaction]//li/a/span"));
		int size = elements.size();
		System.out.println("The size of the list is: "+size);
		for (int i = 0; i < size; i++) {
			System.out.println(elements.get(i).getText());
		}
		System.out.println("The Test Case is Passed now.....");
		driver.quit();
	}

}
