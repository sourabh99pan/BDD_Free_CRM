package stepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import Base.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class WidgetStepDefinition extends TestBase{

	 WebDriver driver;
	 
		@Before
		public void launchApp() throws IOException
		{

			driver =intilazeDriver();

			System.out.println("in element launch app");
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			// driver.get("url");
			//driver.get("https://demoqa.com/automation-practice-form");
				
			 
		}

		@After
		public void closeApp()
		{
			driver.quit();
		}
		
	 @Given("^Check accordian$") 
	 public void Check_accordian() throws InterruptedException
	 {

			driver.navigate().to("https://demoqa.com/accordian");
			driver.manage().window().maximize();
			

		    	  try {
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
		    	  }


 }

	 @Given("^Check Slider$") 
	 public void Check_Slider() throws InterruptedException 
	 {
			driver.get("https://demoqa.com/slider");
			WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
			new Actions(driver).dragAndDropBy(slider, 10, 0).perform();

			
			Thread.sleep(5000);
	 } 
	 
	 @Given("^Check Tabs and getText$") 
	 public void Check_Tabs_and_getText() throws InterruptedException 
	 {
			driver.get("https://demoqa.com/tabs");

			driver.findElement(By.id("demo-tab-origin")).click();
			Thread.sleep(3000);
			String text = driver.findElement(By.id("demo-tabpane-origin")).getText();
			System.out.println(text);
			driver.findElement(By.id("demo-tab-use")).click();
			Thread.sleep(3000);
			String text1 = driver.findElement(By.id("demo-tabpane-use")).getText();
			System.out.println(text1);

			
			Thread.sleep(3000);
	 }
	 
	 @Given("^Check Tooltip Text$") 
	 public void Check_Tooltip_Text() throws InterruptedException 
	 {
			driver.get("https://demoqa.com/tool-tips");

			 Actions actions  = new Actions (driver);
			 
			WebElement tooltip = driver.findElement(By.id("toolTipButton"));
			 
			 actions.moveToElement(tooltip).perform(); 
			 
			 WebElement toolTip = driver.findElement(By.xpath("//*[@id='toolTipButton']"));
			 String toolTiptext = toolTip.getText();
			 System.out.println(toolTiptext);
			 String aatribute = toolTip.getAttribute("class");
			 
			 System.out.println("Attribute "+aatribute);
	 }
}
