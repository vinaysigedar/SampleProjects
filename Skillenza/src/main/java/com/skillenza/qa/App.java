package com.skillenza.qa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\C5303772\\OneDrive - SAP SE\\Katalon_Studio_Windows_64-7.6.2\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://return-order-app.herokuapp.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//input[@name=\"order-id\"]")).sendKeys("1257945872");
		driver.findElement(By.xpath("//button[text()='Find Order']")).click();
		driver.findElement(By.xpath("//button[text()='Return This Product']")).click();
		String text = driver.findElement(By.xpath("//*[@class=\"result\"]")).getText();
		System.out.println("The text is " + text);

		try {
			FileWriter myWriter = new FileWriter("result.txt");
			myWriter.write(text);
			myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.close();
	}

}
