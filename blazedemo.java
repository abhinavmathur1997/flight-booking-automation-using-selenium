package demo;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class blazedemo {
	public static void main(String[] args)
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://blazedemo.com/index.php");
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement selectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("fromPort")));

	        Select select = new Select(selectElement);
	        select.selectByValue("Philadelphia");
	        
	        WebElement selectElement1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("toPort")));

	        Select select1 = new Select(selectElement1);
	        select1.selectByValue("Rome");
	        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
	        driver.findElement(By.id("inputName")).sendKeys("Abhinav Mathur");
	        driver.findElement(By.id("address")).sendKeys("Balkampet, Hyderabad, India");
	        driver.findElement(By.id("city")).sendKeys("Hyderabad");
	        driver.findElement(By.id("state")).sendKeys("Telangana");
	        driver.findElement(By.id("zipCode")).sendKeys("500016");
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement selectElement2 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("cardType")));
	        Select select2 = new Select(selectElement2); 
	        select2.selectByValue("amex");

	        driver.findElement(By.id("creditCardNumber")).sendKeys("12345678");
	        driver.findElement(By.id("creditCardMonth")).sendKeys("03");
	        driver.findElement(By.id("nameOnCard")).sendKeys("Abhinav Mathur");
	        driver.findElement(By.id("rememberMe")).click();
	        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
	}

}
