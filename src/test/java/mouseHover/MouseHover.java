package mouseHover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	 WebElement mouseHover = driver.findElement(By.id("mousehover"));
	 
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	js.executeScript("arguments[0].scrollIntoView()", mouseHover);
	wait.until(ExpectedConditions.visibilityOf(mouseHover));
	 Actions act = new Actions(driver);
	 act.moveToElement(mouseHover).build().perform();
	 
	 
	 
}
}
