package windowHandle;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();

		String link_child = "https://www.selenium.dev/";

		String link_parent = driver.getWindowHandle();

		Set<String> all_links = driver.getWindowHandles();

		for (String single_link : all_links) {
			driver.switchTo().window(single_link);
			if (single_link.contains(link_child)) {
				break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
	

		TakesScreenshot shot = (TakesScreenshot) driver;
		File file = shot.getScreenshotAs(OutputType.FILE);
		File file1 = new File("C:\\Users\\HP\\Music\\ss\\image.png");
		FileUtils.copyFile(file, file1);

	}
}
