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

public class AgainDataPr2 {
	
	WebDriver driver;
	
@DataProvider (name = "data")
public Object[][]getdata() throws EncryptedDocumentException, IOException{
	
	AgainDataPr1 alt = new AgainDataPr1();
	
	Object[][] alr = alt.get();
	
	return alr;
}

@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	
	driver.get("https://www.stealmylogin.com/demo.html");
	
	driver.manage().window().maximize();
}
@Test(dataProvider = "data")
public void test(String username, String password) {
	  WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
	  WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	  
	  user.sendKeys(username);
	  
	  pass.sendKeys(password);
	  
}

@AfterMethod
public void taredown() {
	driver.close();

}
}
