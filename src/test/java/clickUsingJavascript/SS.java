package clickUsingJavascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SS {

	
	    WebDriver driver;
	    WebDriverWait wait;

	    @BeforeTest
	    public void login() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        driver.get("https://jharkhandtest.schoolnetindia.com/your-desired-page");

	       // driver.get("https://jharkhandtest.schoolnetindia.com/Login/LoginPage");
	    }

	    @Test
	    public void otherlogin() throws InterruptedException {
	        WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LoginType")));
	        Select sel = new Select(login);
	        sel.selectByVisibleText("Other");

	        WebElement username = driver.findElement(By.id("userid"));
	        username.sendKeys("dmhgyuin");
	        WebElement password = driver.findElement(By.id("txtpassword"));
	        password.sendKeys("Pa24843");
	        driver.findElement(By.id("BtnLogin")).click();
	    }

	    @Test
	    public void rail() throws InterruptedException {
	       
	        driver.get("https://your-website-url");

	       
	        WebElement dropdownMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Library']")));
	        dropdownMenu.click();

	       
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='RAIL']")));

	        
	        WebElement addNewButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add New']")));
	        addNewButton.click();

	       
	        WebElement teacherQpReleaseDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='Select Date'])[4]")));
	        teacherQpReleaseDate.click();
	        WebElement teacherQpReleaseDateSelection = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@aria-label='April 5, 2024'])[2]")));
	        teacherQpReleaseDateSelection.click();

	       
	        WebElement teacherQpReleaseTimeHours = driver.findElement(By.id("TeacherQpReleaseHrs"));
	        Select selectTeacherQpReleaseTimeHours = new Select(teacherQpReleaseTimeHours);
	        selectTeacherQpReleaseTimeHours.selectByVisibleText("12");

	        WebElement teacherQpReleaseTimeMinutes = driver.findElement(By.id("TeacherQpReleaseMins"));
	        Select selectTeacherQpReleaseTimeMinutes = new Select(teacherQpReleaseTimeMinutes);
	        selectTeacherQpReleaseTimeMinutes.selectByVisibleText("00");

	      
	        WebElement akReleaseDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='Select Date'])[6]")));
	        akReleaseDate.click();
	        WebElement akReleaseDateSelection = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@aria-label='April 6, 2024'])[3]")));
	        akReleaseDateSelection.click();

	       
	        WebElement akReleaseTimeHours = driver.findElement(By.id("TeacherAkReleaseHrs"));
	        Select selectAkReleaseTimeHours = new Select(akReleaseTimeHours);
	        selectAkReleaseTimeHours.selectByVisibleText("13");

	        WebElement akReleaseTimeMinutes = driver.findElement(By.id("TeacherAkReleaseMins"));
	        Select selectAkReleaseTimeMinutes = new Select(akReleaseTimeMinutes);
	        selectAkReleaseTimeMinutes.selectByVisibleText("00");

	        
	        WebElement studentQpReleaseDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='Select Date'])[8]")));
	        studentQpReleaseDate.click();
	        WebElement studentQpReleaseDateSelection = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@aria-label='April 6, 2024'])[4]")));
	        studentQpReleaseDateSelection.click();

	      
	        WebElement studentQpReleaseTimeHours = driver.findElement(By.id("StudentQpReleaseHrs"));
	        Select selectStudentQpReleaseTimeHours = new Select(studentQpReleaseTimeHours);
	        selectStudentQpReleaseTimeHours.selectByVisibleText("14");

	        WebElement studentQpReleaseTimeMinutes = driver.findElement(By.id("StudentQpReleaseMins"));
	        Select selectStudentQpReleaseTimeMinutes = new Select(studentQpReleaseTimeMinutes);
	        selectStudentQpReleaseTimeMinutes.selectByVisibleText("00");

	       
	        WebElement studentAkReleaseDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='Select Date'])[10]")));
	        studentAkReleaseDate.click();
	        WebElement studentAkReleaseDateSelection = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@aria-label='April 6, 2024'])[5]")));
	        studentAkReleaseDateSelection.click();

	       
	        WebElement studentAkReleaseTimeHours = driver.findElement(By.id("StudentAkReleaseHrs"));
	        Select selectStudentAkReleaseTimeHours = new Select(studentAkReleaseTimeHours);
	        selectStudentAkReleaseTimeHours.selectByVisibleText("18");

	        WebElement studentAkReleaseTimeMinutes = driver.findElement(By.id("StudentAkReleaseMins"));
	        Select selectStudentAkReleaseTimeMinutes = new Select(studentAkReleaseTimeMinutes);
	        selectStudentAkReleaseTimeMinutes.selectByVisibleText("00");

	       
	        WebElement className = wait.until(ExpectedConditions.elementToBeClickable(By.id("className")));
	        Select selectClassName = new Select(className);
	        selectClassName.selectByVisibleText("8");

	       
	        WebElement subject = wait.until(ExpectedConditions.elementToBeClickable(By.id("drpsubject")));
	        Select selectSubject = new Select(subject);
	        selectSubject.selectByVisibleText("Mathematics");

	        
	        WebElement schoolType = wait.until(ExpectedConditions.elementToBeClickable(By.id("schoolType")));
	        Select selectSchoolType = new Select(schoolType);
	        selectSchoolType.selectByVisibleText("General");

	        // Upload File
	        driver.findElement(By.id("uploadQpAp")).click();
	        // Code for file upload can be added here

	       
	    }
	}

