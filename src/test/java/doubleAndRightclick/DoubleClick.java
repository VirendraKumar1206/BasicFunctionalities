package doubleAndRightclick;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		WebElement dbl = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		Actions act = new Actions(driver);
		act.doubleClick(dbl).build().perform();

		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
