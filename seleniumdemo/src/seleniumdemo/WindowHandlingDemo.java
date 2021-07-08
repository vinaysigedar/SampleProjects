package seleniumdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\C5303772\\OneDrive - SAP SE\\Katalon_Studio_Windows_64-7.6.2\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		String mainwindow=driver.getWindowHandle();
		Set<String> allwindows=driver.getWindowHandles();
		List<String> tabs=new ArrayList<String>(allwindows);
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath("//input[@name=\"emailid\"]")).sendKeys("abcd@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		Thread.sleep(3000);
		String details=driver.findElement(By.xpath("//table[@border='1']//tbody")).getText();
		System.out.println("The login credentials to the site are: " +details);
		driver.close();
		driver.switchTo().window(tabs.get(0));
		boolean b1=driver.findElement(By.xpath("//a[text()='Click Here']")).isDisplayed();
		System.out.println(b1);
		if(b1==true)
		{
			System.out.println("The control shifted to the parent window.");
		}
		else
		{
			System.out.println("The control is still on the child window. Test failed.");
		}
		driver.quit();
	}

}
