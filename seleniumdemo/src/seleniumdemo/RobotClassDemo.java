package seleniumdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassDemo {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\C5303772\\OneDrive - SAP SE\\Katalon_Studio_Windows_64-7.6.2\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Robot robot=new Robot();
		String mainwindow=driver.getWindowHandle();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		Set<String> allwindows=driver.getWindowHandles();
		ArrayList<String> tabs=new ArrayList<String>(allwindows);
		for(String windows:allwindows)
		{
		if(!mainwindow.equalsIgnoreCase(windows))
			driver.switchTo().window(windows);
		}
		driver.get("https://www.amazon.com");
		driver.navigate().refresh();
		driver.close();
		driver.switchTo().window(mainwindow);
		driver.navigate().refresh();
		driver.close();
	}

}
