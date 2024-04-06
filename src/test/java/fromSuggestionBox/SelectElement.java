package fromSuggestionBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectElement {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open the webpage
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Find the input field for the suggestion box
        WebElement inputField = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

        // Enter "ind" into the input field
        inputField.sendKeys("ind");

        //here we are Waiting for the suggestion box options to become visible
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-1")));

        // Locate all the options in the suggestion box
        // and click the second option
        // (assuming that the desired option is the second one)
        WebElement desiredOption = driver.findElement(By.xpath("//ul[@id='ui-id-1']//li[2]"));
        
        Thread.sleep(5000);
        desiredOption.click();

        // Close the browser
        driver.quit();
    }
}
