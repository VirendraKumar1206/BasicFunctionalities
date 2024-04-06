package dropDown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingSelectClassMethod {
public static void main(String[] args) throws InterruptedException, IOException {
	//WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	   WebElement drop = driver.findElement(By.id("dropdown-class-example"));
	   
	   //now i will create a select class object and select class object constructor will be initialise by pass the stored variable element instance name
	   
	   Select sec = new Select(drop);
	   //there are three method from which we can select any element on the webdpage
	   sec.selectByIndex(3);
	   Thread.sleep(3000);
	   sec.selectByValue("option1");
	   Thread.sleep(3000);
	 sec.selectByVisibleText("Option3");
	 
	 //here we are going to perform screenShot operation
	 //so first i have to use typecasting method for converting the our webdriver instance into takeScreenShots interface and
//then with then with using then screenshot instance we will use .getScreenShotAs method for capturing the scrren and inside the method i'll
//also pass the outputtype of screenshot
	 TakesScreenshot shot =(TakesScreenshot)driver;
         File file1 = shot.getScreenshotAs(OutputType.FILE);
         File file2 = new File("C:\\Users\\HP\\Music\\ss\\image.png");
       FileUtils.copyFile(file1, file2);  
        
       
		 
}
}
