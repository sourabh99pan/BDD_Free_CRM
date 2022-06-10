package stepDefinition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import Base.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WindowStepDefinition extends TestBase {


	 
		@Before
		public void launchApp() throws IOException
		{

			driver =intilazeDriver();

			System.out.println("in window launch app");
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
	 @Given("^Check NewTab$") 
	 public void Check_NewTab()
	 {
			driver.get("https://demoqa.com/browser-windows");

			driver.findElement(By.id("tabButton")).click();
			
			 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs.get(1)); 
			    
			  boolean  newtab =  driver.findElement(By.id("sampleHeading")).isDisplayed();
			  
			  if (newtab==true)
				{
				System.out.println("New tab displayed");
				}
				else
				{
					System.out.println("New tab is not displayed");
				}
	
			
 }
	
	 @Given("^Check NewWindow$") 
	 public void Check_NewWindow()
	 {

			driver.get("https://demoqa.com/browser-windows");

			driver.findElement(By.id("windowButton")).click();
			
			String parentwindow = driver.getWindowHandle(); //current window name
			
			for(String winhandle:driver.getWindowHandles())
			{
				
				driver.switchTo().window(winhandle);
			}
			
			driver.switchTo().window(parentwindow);
					
			String wintitle = driver.getTitle();
			
			if(wintitle.contains("ToolsQA"))
			{
				System.out.println("Window Displayed");
			}
			else
			{
				System.out.println("Window has not Displayed");
			}
	
			
 }
	
	 @Given("^Check NewWindow Message$") 
	 public void Check_NewWindow_Message()
	 {
			driver.get("https://demoqa.com/browser-windows");

			driver.findElement(By.id("messageWindowButton")).click();
			
			String parentwindow = driver.getWindowHandle(); //it will get current window name
			
			Set<String>s=driver.getWindowHandles();
			
			// Now iterate using Iterator
			Iterator<String> I1= s.iterator();
			
			System.out.println(I1.hasNext());
			while(I1.hasNext())
			{
				System.out.println(I1.hasNext());
				String child_window=I1.next();
				System.out.println("child window "+!parentwindow.equals(child_window));
	
				if(!parentwindow.equals(child_window))
				{
					driver.switchTo().window(child_window);
					//WebElement text = driver.findElement(By.id("sampleHeading"));
					//System.out.println("Heading of child window is " + text.getText());
					 driver.close();
					 System.out.println("Child window closed");
				}
			}
			//switch to the parent window
			driver.switchTo().window(parentwindow);
	
			
 }

	 @Given("^Check New Alert$") 
	 public void Check_New_Alert()	
	 {
			driver.get("https://demoqa.com/alerts");
			
			driver.findElement(By.id("alertButton")).click();
			
	        WebDriverWait wait = new WebDriverWait(driver,10);
	        wait.until(ExpectedConditions.alertIsPresent());
			
			Alert simpleAlert =  driver.switchTo().alert();
		
			String alertText =  simpleAlert.getText();
					
			simpleAlert.accept();
			
			if(alertText.contains("You clicked a button"))
			{
				System.out.println("User is able to handle simple alert");
			}
			else
			{
				System.out.println("User is not able to handle simple alert");
			}
	 }
	 
	 @Given("^Check Alert After sec$") 
	 public void Check_Alert_After_sec()
	 {
			driver.get("https://demoqa.com/alerts");
			
			driver.findElement(By.id("timerAlertButton")).click();
			
	        WebDriverWait wait = new WebDriverWait(driver,10);
	        wait.until(ExpectedConditions.alertIsPresent());
			
			Alert simpleAlert =  driver.switchTo().alert();
		
			String alertText =  simpleAlert.getText();
					
			simpleAlert.accept();
			
			if(alertText.contains("This alert appeared after 5 seconds"))
			{
				System.out.println("User is able to handle simple alert after 5 sec");
			}
			else
			{
				System.out.println("User is not able to handle simple alert after 5 sec");
			}
	 }
	 @Given("^Check Confirm Alert$") 
	 public void Check_Confirm_Alert()
	 {
			driver.get("https://demoqa.com/alerts");
			
			driver.findElement(By.id("confirmButton")).click();
			
		    WebDriverWait wait = new WebDriverWait(driver,10);
		    wait.until(ExpectedConditions.alertIsPresent());
			
			Alert confirmAlert =  driver.switchTo().alert();

			String alertText =  confirmAlert.getText();
					
			confirmAlert.accept();
			
			if(alertText.contains("Do you confirm action"))
			{
				System.out.println("User is able to handle confirm alert");
			}
			else
			{
				System.out.println("User is not able to handle confirm alert");
			}
	 }
	
	 @Given("^Check Msg send on Alert pop up$") 
	 public void Check_Msg_send_on_Alert_pop_up()
	 {
			driver.get("https://demoqa.com/alerts");
			
			driver.findElement(By.id("promtButton")).click();
			
		    WebDriverWait wait = new WebDriverWait(driver,10);
		    wait.until(ExpectedConditions.alertIsPresent());
			
			Alert confirmAlert =  driver.switchTo().alert();

			confirmAlert.sendKeys("Sourabh");
						
			confirmAlert.accept();
			
			String alertResult = driver.findElement(By.id("promptResult")).getText();
			
			if(alertResult.contains("You entered Sourabh"))
			{
				System.out.println("User is able to send message on alert");
			}
			else
			{
				System.out.println("User is not able to send message on alert");
			}
	 }
	 
	 @Given("^Check Model_Dialog$") 
	 public void Check_Model_Dialog()
	 {
			driver.get("https://demoqa.com/modal-dialogs");
			driver.manage().window().maximize();
			

		    	  try {
				      driver.findElement(By.id("showSmallModal")).click();
				    // String dialogText = driver.findElement(By.xpath("//div[conatins(@class'modal-body']")).getText();
				     Thread.sleep(5000);
				      driver.findElement(By.id("closeSmallModal")).click();

		    	  }
		    	  catch(org.openqa.selenium.NoSuchElementException | InterruptedException ex) 
		    	  {
		    		  	System.out.println(ex);
		    	  }
	 }
	 
	/*@After
	public void closeApp()
	{
		driver.quit();
		
	}*/
		
	 }

