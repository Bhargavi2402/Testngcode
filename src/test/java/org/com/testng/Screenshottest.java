package org.com.testng;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Argument;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng
.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static org.testng.Assert.assertEquals;

import java.beans.Visibility;
import java.io.File;
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

@Listeners(CustomListener.class)
public class Screenshottest extends TestBase   {

	@BeforeMethod
	public void setup(){
		Intialization();
	}
	@AfterMethod
	public void close(){
		driver.quit();
	}
	@Test
	public void takescreenshot1(){
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void takescreenshot2(){
		Assert.assertEquals(false, true);
	}
	@Test
	public void takescreenshot3(){
		Assert.assertEquals(false, true);
	}
}
