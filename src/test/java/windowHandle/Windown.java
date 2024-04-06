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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windown {

	WebDriver driver;
	ExtentReports Rt;
	ExtentTest test;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();

		Rt = new ExtentReports(System.getProperty("user.dir") + "/extentreport.html");
		test = Rt.startTest("extentreport");

		driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Windows.html");
		test.log(LogStatus.PASS, "webpage is opened");
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws IOException {

		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		test.log(LogStatus.PASS, "button is clickable");

		String child_url = "https://www.selenium.dev/";
		test.log(LogStatus.PASS, "url of child is getting");

		String parent = driver.getWindowHandle();
		test.log(LogStatus.PASS, "parent's page url is getting");

		Set<String> all_url = driver.getWindowHandles();
		test.log(LogStatus.PASS, "url of all tab are getting ");

		for (String single : all_url) {
			driver.switchTo().window(single);
			test.log(LogStatus.PASS, "driver is navigating to all tabs");
			if (single.contains(child_url)) {
				test.log(LogStatus.PASS, "it is breaking the loop when condition is true");
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		test.log(LogStatus.PASS, "download button is clickable");

		TakesScreenshot shot = (TakesScreenshot) driver;
		File file1 = shot.getScreenshotAs(OutputType.FILE);
		File file2 = new File("C:\\Users\\HP\\Music\\ss\\image.png");
		FileUtils.copyFile(file1, file2);
	}

	@AfterMethod
	public void taredown() {
		Rt.endTest(test);
		Rt.flush();
		driver.close();
	}

}
