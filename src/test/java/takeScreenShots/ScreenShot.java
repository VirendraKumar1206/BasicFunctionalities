package takeScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://defenceforumindia.com/community/");
	//here i will use type casting method for converting the webdriver instance into takeScreenshot interface 
	
	TakesScreenshot shot = (TakesScreenshot)driver;
	
	     File file = shot.getScreenshotAs(OutputType.FILE);  //it will capture the screenshot and inside the method i'll define the output type of screen shot
	  
	     File file1 = new File("C:\\Users\\HP\\Music\\ss\\image.png");
	     
	     FileUtils.copyFile(file, file1);
}
}
