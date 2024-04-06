package utilityMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mehod {

	    public static void main(String[] args) {
	    	WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.stealmylogin.com/demo.html");
	        login(driver, "Virendra", "123456");
	    }
	    public static void login(WebDriver driver, String username, String password) {
	        Utility.login(driver, username, password);
	    }
	}

