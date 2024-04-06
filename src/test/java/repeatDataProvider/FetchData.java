package repeatDataProvider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchData {
	WebDriver driver;
	ExtentReports report;
	 ExtentTest test;
	
	@DataProvider(name = "FetchData")
public Object[][]getdta() throws EncryptedDocumentException, IOException{
	Extract ext = new Extract();
	
 	Object[][] getdata = ext.Get();
 	
 	return getdata;
}
	@BeforeMethod
	
	public void setup() {
		WebDriverManager.chromedriver().setup();
		
		 report = new ExtentReports(System.getProperty("user.dir") + "/extentReport.html");
		  test = report.startTest("extentReportDemo");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.stealmylogin.com/demo.html");
		test.log(LogStatus.PASS, "webpage is opening");
		
	}
	
	
	@Test(dataProvider = "FetchData")
	public void test(String username, String pass) {
		 WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		 test.log(LogStatus.PASS, "it is locating the username");
		      WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		      test.log(LogStatus.PASS, "it is locating the password");
		      
		      
		      user.sendKeys(username);
		      test.log(LogStatus.PASS, "here we send the username value");
		      password.sendKeys(pass);
		      test.log(LogStatus.PASS, "we are send the password value");
		      
		     driver.findElement(By.xpath("//input[@type='submit']")).click();
		      test.log(LogStatus.PASS, "button is clickable");
		      
	}
	@AfterMethod
	public void taredown() {
		driver.close();
		report.endTest(test);
		report.flush();
		
	}
	
}
