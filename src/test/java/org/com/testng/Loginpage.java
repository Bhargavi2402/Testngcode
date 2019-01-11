package org.com.testng;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;

import datadriven.Dataread;
import net.bytebuddy.asm.Advice.Argument;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng
.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.beans.Visibility;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
public class Loginpage {
	static WebDriver driver;
	String path = "C:/Users/rbharga1/workspace/org.com.testng/src/main/java/Testdata"
			+ ""+"/MakemytripTestdata.xlsx";
	 @BeforeMethod
	  public void setup() {
		  System.setProperty("webdriver.chrome.driver", "C:/Users/rbharga1/Downloads/Selenium workspace/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			try {
				
				driver.get("https://www.makemytrip.com/");
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
			
		  
	  }
	  
	  @AfterMethod
	  public void close(){
		  driver.close();
	  }

	  
	  @Test
		public void loginpage() throws IOException{
			
			driver.findElement(By.id("ch_login_icon")).click();
			Dataread.setExcelfile(path, "login");
			String User = Dataread.getceldata(1, 1);
			String pass = Dataread.getceldata(1, 2);
			driver.findElement(By.id("ch_login_email")).sendKeys(User);
			driver.findElement(By.id("ch_login_password")).sendKeys(pass);
			driver.findElement(By.xpath("//button[@id='ch_login_btn']")).click();
			Dataread.setceldata("pass",1, 3);
		
			 }
}
