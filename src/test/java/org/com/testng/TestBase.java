package org.com.testng;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bsh.This;

public class TestBase {
	public static WebDriver driver;
	
	public static void Intialization(){
		String browsername = "chrome";
		
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:/Users/rbharga1/Downloads/Selenium workspace/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		}else{
			System.out.println("browser not found");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		
	}
	public  void failed(String testMethodname) throws IOException{
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:/Users/rbharga1/workspace/org.com.testng/screenshots/"+testMethodname
				+"_"+".jpg");
		try {
			FileUtils.copyFile(srcfile, destfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
