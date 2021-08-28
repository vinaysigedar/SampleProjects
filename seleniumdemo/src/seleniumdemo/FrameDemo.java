package seleniumdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		// Click on the tile icon to get the list of menus
		driver.findElement(By.xpath("//a[@class=\"gb_C\" and @role=\"button\"]")).click();
		// The app names are under the tag iframe so to fetch those app names we need to
		// switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@role=\"presentation\"]")));
		// Fetch all the app names in list
		List<WebElement> allMenus = driver.findElements(By.xpath("//div[@jsname and @jsaction]//li/a/span"));

		// Printing all app names by running enhanced for loop
		for (WebElement menu : allMenus) {
			System.out.println(menu.getText());
		}
		driver.close();
	}

}
