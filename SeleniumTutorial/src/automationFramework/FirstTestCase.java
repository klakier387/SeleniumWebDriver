package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		
		String sampleText = driver.findElement(By.id("idOfDiv")).getText();
		System.out.println(sampleText);
		
		driver.findElement(By.linkText("This is a link")).click();
		
		driver.findElement(By.name("firstName")).click();
		
		driver.findElement(By.id("idOfButton")).click();
		
		driver.findElement(By.id("male")).click();
		
		driver.findElement(By.id("female")).click();
		
		driver.findElement(By.className("Automation")).click();
		
		driver.findElement(By.className("Performance")).click();
		
		driver.findElement(By.id("testingDropdown")).click();
		
		driver.findElement(By.id("testingDropdown"));
		
		Select clickThisDropDownBox = new Select(driver.findElement(By.id("testingDropdown")));
		clickThisDropDownBox.selectByValue("Automation");
		clickThisDropDownBox.selectByValue("Performance");
		clickThisDropDownBox.selectByValue("Manual");
		clickThisDropDownBox.selectByValue("Database");
		
		
				
		driver.findElement(By.cssSelector("#AlertBox > button")).click();
		
		try{ WebDriverWait wait = new WebDriverWait(driver,2);
		  wait.until(ExpectedConditions.alertIsPresent());
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		} catch (Exception e){}
		
		driver.findElement(By.cssSelector("#ConfirmBox > button")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement From = driver.findElement(By.id("sourceImage"));
		WebElement To =driver.findElement(By.id("targetDiv"));
		
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
		dragAndDrop.perform();
		
		
		driver.close();
	}
}
