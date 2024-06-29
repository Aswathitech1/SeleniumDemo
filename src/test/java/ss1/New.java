package ss1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class New {
	WebDriver driver;
	 String  BaseUrl = "https://www.google.com";
	 
	 @BeforeTest
	 public void test()
	 {
		 driver = new ChromeDriver();
		 driver.get(BaseUrl);
	 }
	 @Test
	 public void test1()
	 {
	 }
	 }


