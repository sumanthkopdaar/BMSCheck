import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BMSSearch {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@Test
	public void BookShow() {
		driver.get("https://in.bookmyshow.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='bwc__sc-1iyhybo-6 ilhhay']")));
		searchBox.sendKeys("Bengaluru" + Keys.ENTER);
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='sc-1iyhybo-11jgrLow']"))); 

		List<WebElement> options = dropdown.findElements(By.tagName("li"));
		WebElement secondOption = options.get(1);

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(	)))
		
	}
	
	@AfterTest
	public void tearDown() {
		if(driver != null) {
			System.out.println("Finally in TestNG, Great");
		}
			
	}
	

}
