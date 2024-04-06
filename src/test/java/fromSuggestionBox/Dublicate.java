package fromSuggestionBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dublicate {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	     WebElement send = driver.findElement(By.id("autocomplete"));
	     send.sendKeys("Ind");
	     
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-1")));	    
	   WebElement elem = driver.findElement(By.xpath("//ul[@id='ui-id-1']//li[2]"));
	  elem.click();
}
}
