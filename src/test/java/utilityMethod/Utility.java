package utilityMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class Utility {
	
		    public static void login(WebDriver driver, String username, String password) {
		       
		        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		       
		       
		        
		        driver.findElement(By.xpath("//input[@value='login']")).click();
		  
		}
	}


