package datafrom;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getdata {
	WebDriver driver;
	@DataProvider(name = "getdata")
public Object[][] getdata() throws EncryptedDocumentException, IOException{
	ExcelSheet get = new ExcelSheet();
	 Object[][] get1 = get.data();
	 
	 return get1;
	}
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("http://testphp.vulnweb.com/login.php");
		
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider = "getdata")
	public void test( String userName , String passWord) {
		 WebElement name = driver.findElement(By.xpath("//input[@name='uname']"));
		 
		 WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		 
		 name.sendKeys(userName);
		pass.sendKeys(passWord);
		 
	}
	@AfterMethod
	public void taredown() {
		driver.close();
	}
	
	
	
	
}
