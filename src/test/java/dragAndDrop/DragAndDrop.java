package dragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");

		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);

		WebElement zone1 = driver.findElement(By.xpath("//span[text()='Draggable 1']"));
		WebElement zone2 = driver.findElement(By.xpath("//span[text()='Draggable 2']"));
		WebElement zone3 = driver.findElement(By.xpath("//span[text()='Draggable 3']"));
		WebElement zone4 = driver.findElement(By.xpath("//span[text()='Draggable 4']"));

		WebElement mainZone = driver.findElement(By.id("mydropzone"));

		act.dragAndDrop(zone1, mainZone).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(zone2, mainZone).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(zone3, mainZone).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(zone4, mainZone).build().perform();

	}
}
