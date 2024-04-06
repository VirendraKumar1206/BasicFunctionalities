package clickUsingJavascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickFunction {
public static void main(String[] args) throws InterruptedException {
	//WebDriverManager.chromedriver().setup();

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	//WebDriverManager.chromedriver().driverVersion("123.0.6312.106").setup();
	
	WebDriver driver = new ChromeDriver();
	
	
	
	driver.get("https://demo.seleniumeasy.com/input-form-demo.html");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name = 'first_name']")).sendKeys("Virendra");
	driver.findElement(By.xpath("//input[@name = 'last_name']")).sendKeys("kumar");
	driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("chakravartivirendra45@gmail.com");
	driver.findElement(By.xpath("//input[@name = 'phone']")).sendKeys("8448037120");
	driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys("Wazirabad, New Delhi");
	driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("New Delhi");
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	 WebElement scroll = driver.findElement(By.xpath("(//div[@class='form-group has-feedback has-success'])[5]"));
	 
	     WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
	
	     
	     Thread.sleep(3000);
	     
	     Select sel = new Select(state);
	     
	     js.executeScript("arguments[0].scrollIntoView()", scroll);
	     
	     Thread.sleep(3000);
	   //  sel.selectByIndex(5);
	     sel.selectByVisibleText("Washington");
	     Thread.sleep(3000);
}
}
