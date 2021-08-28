package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.vwo.com/#/login");
		String title = driver.getTitle();
		System.out.println("The tile of the page is:" + title);
		//Enter the username
		driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys("//input[@id=\"login-username\"]");
		//Enter password
		driver.findElement(By.xpath("//input[@id=\"login-password\"]")).sendKeys("Wingify@123");
		//Click on sign in
		driver.findElement(By.xpath("//button[@id=\"js-login-btn\"]")).click();
		// Wait for sometime for the next page to load
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Dashboard']")));
		//Go to campaign
		driver.get("https://app.vwo.com/#/test/ab/6/edit/variations");
		String window1=driver.getWindowHandle();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@ng-click=\"editCampaign(variation.id, section.id)\"]")));
		//Click on edit
		driver.findElement(By.xpath("//button[@ng-click=\"editCampaign(variation.id, section.id)\"]")).click();
		Set<String> tabs=driver.getWindowHandles();
		Iterator<String> stringIterator=tabs.iterator();
		while(stringIterator.hasNext())
		{
			String window2=stringIterator.next();
			if(!window1.equalsIgnoreCase(window2))
				driver.switchTo().window(window2);
		}
		
	}
}
