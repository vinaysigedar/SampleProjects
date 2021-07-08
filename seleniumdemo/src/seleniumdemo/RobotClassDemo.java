package seleniumdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassDemo {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\C5303772\\OneDrive - SAP SE\\Katalon_Studio_Windows_64-7.6.2\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		String mainwindow=driver.getWindowHandle();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Set<String> allwindows=driver.getWindowHandles();
		for(String windows:allwindows)
		{
			if(!windows.equalsIgnoreCase(mainwindow))
				driver.switchTo().window(windows);
		}
		driver.get("https://www.google.com");
		driver.switchTo().window(mainwindow);
		driver.quit();
	}

}
