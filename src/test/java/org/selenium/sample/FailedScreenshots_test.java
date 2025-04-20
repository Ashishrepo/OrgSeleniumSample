	package org.selenium.sample;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListnerClass.class)
public class FailedScreenshots_test {
	
public static WebDriver d;

	@BeforeClass
	public void beforeClass() {
		System.out.println(System.getProperty("user.dir"));
		WebDriverManager.chromedriver().setup();
		ChromeDriver d= new ChromeDriver();
		
	}

	@Test
	public void Test1() {
		
		d= new ChromeDriver();
		d.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.7");
		Assert.assertEquals(true, false);
	}

	@AfterClass
	public void afterClass() {
		d.quit();
	}

}
