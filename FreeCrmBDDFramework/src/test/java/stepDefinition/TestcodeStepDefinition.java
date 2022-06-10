package stepDefinition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import Base.TestBase;

import org.openqa.selenium.support.Color;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class TestcodeStepDefinition extends TestBase  {
	
	WebDriver driver; 

	 @Given("^Test Your Code$") 
	 public void testYourCode() throws InterruptedException
	 {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			 System.out.println("in test code");

				driver.get("https://demoqa.com/tool-tips");
				 driver.manage().window().maximize();
				 driver.manage().deleteAllCookies();
				 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				 Actions actions  = new Actions (driver);
				 
				WebElement tooltip = driver.findElement(By.id("toolTipButton"));
				 
				 actions.moveToElement(tooltip).perform(); 
				 
				 WebElement toolTip = driver.findElement(By.xpath("//*[@id='toolTipButton']"));
				 //to know parent tag
				 WebElement myElement = driver.findElement(By.id("toolTipTextField"));
				 WebElement parent = (WebElement) ((JavascriptExecutor) driver).executeScript(
				                                    "return arguments[0].parentNode;", myElement);
				 String toolTiptext = toolTip.getText();
				 System.out.println(toolTiptext);
				 String aatribute = toolTip.getAttribute("class");
				 
				 System.out.println("Attribute "+aatribute);
				 
				 System.out.println("ToolTipParent m"+parent.getTagName());
				Thread.sleep(3000);


				

		      
			
 }
	 
	 public void parenttagname()
	 {
		 //to know parent tag
		 WebElement myElement = driver.findElement(By.id("toolTipTextField"));
		 WebElement parent = (WebElement) ((JavascriptExecutor) driver).executeScript(
		                                    "return arguments[0].parentNode;", myElement);
	 }
	 
}

/*try {
    driver.findElement(By.id("section1Heading")).click();
    String accord1 =  driver.findElement(By.id("section1Content")).getText();
    System.out.println(accord1);
    driver.findElement(By.id("section1Heading")).click();
    
    Thread.sleep(5000);
    driver.findElement(By.id("section2Heading")).click();
    String accord2 =  driver.findElement(By.id("section2Content")).getText();
    System.out.println(accord2);
    driver.findElement(By.id("section2Heading")).click();
    
    Thread.sleep(5000);
    driver.findElement(By.id("section3Heading")).click();
    Thread.sleep(1000);
    String accord3 =  driver.findElement(By.id("section3Content")).getText();
    
    System.out.println(accord3);
   
    Thread.sleep(5000);
}
catch(org.openqa.selenium.NoSuchElementException ex) 
{
	  	System.out.println(ex);
}*/
