package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		String email = "vinq" + Math.random() + "@1secmail.com";
		System.setProperty("webdriver.chrome.driver",
				"E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.vwo.com/#/login");
		String title = driver.getTitle();
		System.out.println("The tile of the page is:" + title);
		// Click on Start a free trial link
		driver.findElement(By.xpath("//a[text()='Start a free trial']")).click();
		Thread.sleep(2000);
		// Add an email address
		driver.findElement(By.xpath("//input[@data-qa=\"free-trial-su-v1-email\"]")).sendKeys(email);
		// Click on Create a free trial account
		driver.findElement(By.xpath("//button[text()='create a free trial account']")).click();
		Thread.sleep(2000);
		// Wait for sometime for the next page to load
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"account-setup-password\"]")));
		// Fill the password
		driver.findElement(By.xpath("//input[@id=\"account-setup-password\"]")).sendKeys("Vin@y1234");
		Thread.sleep(2000);
		// Enter the phone number
		driver.findElement(By.xpath("//input[@name=\"number\"]")).sendKeys("2078976542");
		Thread.sleep(2000);
		// Enter the full name
		driver.findElement(By.xpath("//input[@name=\"full-name\"]")).sendKeys("Vinay Sigedar");
		Thread.sleep(2000);
		// Select the average monthly traffic
		List<WebElement> elementlist = driver.findElements(By.xpath("//a[@class=\"chosen-single chosen-default\"]//b"));
		elementlist.get(0).click();
		// driver.findElement(By.xpath("//li[text()='up to 1 million
		// visitors/month']")).click();
		elementlist.get(1).click();
		driver.findElement(By.xpath("//li[text()='Software / SaaS / Downloads']")).click();
		/*
		 * Select select = new
		 * Select(driver.findElement(By.xpath("//select[@name=\"traffic\"]")));
		 * driver.findElement(By.xpath("(//span[text()='Choose one'])[1]")).click();
		 */
		// driver.findElement(By.xpath("(//div[@class=\"chosen-search\"])[1]")).sendKeys("up
		// to 10k visitors/month");
		// select.selectByVisibleText("up to 10k visitors/month");
		// select.selectByIndex(1);
		// select.selectByValue("up to 10k visitors/mo");
		Thread.sleep(2000);
		// Select the industry
		/*
		 * Select industry = new
		 * Select(driver.findElement(By.xpath("//select[@name=\"industry\"]")));
		 * driver.findElement(By.xpath("(//span[text()='Choose one'])[2]")).click();
		 */
		// driver.findElement(By.xpath("(//div[@class=\"chosen-search\"])[2]")).sendKeys("eCommerce
		// / Internet Retail");
		// industry.selectByVisibleText("eCommerce / Internet Retail");
		// industry.selectByIndex(1);
		// industry.selectByValue("string:ecommerce");
		// Thread.sleep(2000);
		// Click on Next button
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		// Select the Product
		WebElement product = driver.findElement(By.xpath("//input[@id=\"prod-deploy\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", product);
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@id=\"combo1\"]")).click();
		// Click on Next button
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		// Wait for sometime
		Thread.sleep(5000);
		// Click on Next button
		// driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		// Enter the URL
		// driver.findElement(By.xpath("name=\"primaryUrl\"")).sendKeys("www.demo.com");
		// Click on Next button
		// driver.findElement(By.xpath("//span[text()='Next']")).click();
		// Thread.sleep(2000);
		// Click on Next button
		// driver.findElement(By.xpath("//span[text()='Next']")).click();
		// Click on finish button
		driver.findElement(By.xpath("//a[text()='Finish']")).click();
		// Click on Go To Dashboard link
		driver.findElement(By.xpath("//a[text()='Go to Dashboard']")).click();
		// Wait till dashboard element is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Dashboard']")));
		// Verify dashboard is present
		// driver.findElement(By.xpath("//h1[text()='Dashboard']")).isDisplayed();
		// Verify the text Vinay is displayed
		// String subtitle =
		// driver.findElement(By.xpath("//p[@data-qa=\"page-sub-title\"]")).getText();
		// subtitle.contains("Vinay");
		// System.out.println("The subtitle of the dashboard is validated
		// successfully");
		// Verify Verify Account button is displayed
		driver.findElement(By.xpath("//button[text()=' Verify Account ']")).isDisplayed();
		// Quit the driver
		driver.quit();
	}

}
