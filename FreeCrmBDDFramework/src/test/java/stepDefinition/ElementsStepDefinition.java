package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import Base.TestBase;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class ElementsStepDefinition extends TestBase {
	
	//Properties properties;
	// public WebDriver driver;
	TestBase base = new TestBase();
	
	ElementsStepDefinition(TestBase base) throws IOException
	{
		this.driver=intilazeDriver();
	}
	/*@Before
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
	}*/
	/*ElementsStepDefinition()
	{
		 TestBase.initBrowser();
		

	}*/
	 @Given("^Elem_Check FullName textBox$") 
	 public void Elem_Check_FullName_textBox() throws InterruptedException
	 {
		 //driver.navigate().to("https://demoqa.com/text-box");
		 //driver.findElement(By.id("userName")).
		 driver.navigate().to("https://demoqa.com/text-box");
		 boolean name= driver.findElement(By.id("userName")).isDisplayed();
		 if(name==true)
		 {
			 System.out.println("Name is displayed");
		 }
		 else
		 {
			 System.out.println("Name is not displayed");
		 }
	 }
	 
		@When("^Elem_Check Email textBox$")
		public void Elem_Check_Email_textBox() throws InterruptedException
		{
			 boolean name= driver.findElement(By.id("userEmail")).isDisplayed();
			 if(name==true)
			 {
				 System.out.println("Email text box is displayed");
			 }
			 else
			 {
				 System.out.println("Email text box is displayed");
			 }
		}
		@Then("^Elem_Check CurrentAdd textBox$")
		public void Elem_Check_CurrentAdd_textBox() throws InterruptedException
		{
			 boolean name= driver.findElement(By.id("currentAddress")).isDisplayed();
			 if(name==true)
			 {
				 System.out.println("current Address text box is displayed");
			 }
			 else
			 {
				 System.out.println("current Address text box is displayed");
			 }
		}
		
		@Then("^Elem_Check PermAdd textBox$")
		public void Elem_Check_PermAdd_textBox() throws InterruptedException
		{
			 boolean name= driver.findElement(By.id("permanentAddress")).isDisplayed();
			 if(name==true)
			 {
				 System.out.println("permanent Address text box is displayed");
			 }
			 else
			 {
				 System.out.println("permanent Address text box is not displayed");
			 }
		}
		
		@Given("^Enter all details and click on submit$") 
		public void Enter_all_details_and_click_on_submit(DataTable formdetails) throws InterruptedException
		{
			driver.navigate().to("https://demoqa.com/text-box");
			for(Map<String,String> data : formdetails.asMaps(String.class, String.class)) {
				//List<String> =new List<String>();
				driver.navigate().refresh();

				driver.findElement(By.id("userName")).sendKeys(data.get("name"));
				driver.findElement(By.id("userEmail")).sendKeys(data.get("Mail"));
				driver.findElement(By.id("currentAddress")).sendKeys(data.get("current address"));

				driver.findElement(By.id("permanentAddress")).sendKeys(data.get("permanent address"));

			}
			
			 driver.findElement(By.id("submit")).click();
		}
		
		@Then("^Elem_Displayed$")
		public void Elem_Displayed() throws InterruptedException
		{
			 boolean name= driver.findElement(By.id("output")).isDisplayed();
			 if(name==true)
			 {
				 System.out.println("output is displayed");
			 }
			 else
			 {
				 System.out.println("output is not displayed");
			 }
		}
		
		 @Given("^Enter all text box details$") 
		 public void Enter_all_text_box_details() throws InterruptedException
		 {
			 //driver.navigate().to("https://demoqa.com/text-box");
			 //driver.findElement(By.id("userName")).
			 driver.navigate().to("https://demoqa.com/text-box");
			 
		 }
		 
		@Then("^Enter Details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
		public void Enter_Details(String name, String Mail, String currAdd, String perAdd)  throws InterruptedException
		{
				driver.findElement(By.id("userName")).sendKeys(name);
				driver.findElement(By.id("userEmail")).sendKeys(Mail);
				driver.findElement(By.id("currentAddress")).sendKeys(currAdd);

				driver.findElement(By.id("permanentAddress")).sendKeys(perAdd);
			
			driver.findElement(By.id("submit")).click();
			
			 boolean name1= driver.findElement(By.id("output")).isDisplayed();
			 if(name1==true)
			 {
				 System.out.println("output is displayed");
			 }
			 else
			 {
				 System.out.println("output is not displayed");
			 }
			 

			 
			 
		}
		
		 @Given("^Check Yes RadioButton$") 
		 public void Check_Yes_RadioButton() throws InterruptedException
		 {
				
			 System.out.println("in test code");
				driver.get("https://demoqa.com/radio-button");
				System.out.println("in test code 2");
				Actions actions = new Actions(driver);
				actions.moveToElement(driver.findElement(By.id("yesRadio"))).click().perform();
				
				//driver.findElement(By.className("rct-icon rct-icon-expand-open")).
			 
		 }
		 
		 
		 @Then("^Check RadioButton Message$") 
		 public void Check_RadioButton_Message() throws InterruptedException
		 {
			 //driver.navigate().to("https://demoqa.com/text-box");
			 boolean msg = driver.findElement(By.className("text-success")).isDisplayed();
			 if(msg==true)
			 {
				 System.out.println("output is displayed");
			 }
			 else
			 {
				 System.out.println("output is not displayed");
			 }
			 
		 }
		 
		 
		 @Given("^Check Rows on WebTable$") 
		 public void Check_Rows_on_WebTable() throws InterruptedException
		 {
			 //driver.navigate().to("https://demoqa.com/text-box");
			 //driver.findElement(By.id("userName")).
			 driver.navigate().to("https://demoqa.com/webtables");
			 
		       //Store the table size
		        WebElement webtable = driver.findElement(By.xpath("//div[contains(@class,'ReactTable')]"));
		 
		        // Get the Number of rows in the table
		        List<WebElement> rows = webtable.findElements(By.xpath("//div[contains(@class,'rt-tr-group')]"));
		        
		        //Print the rows size        
		        System.out.println("Total Number of visible rows in the table is: " + rows.size());
		        
		        //Print the number of rows which has data
		        List<WebElement> rowsWithData = webtable.findElements(By.xpath("//div[contains(@class,'rt-td') and text()]/ancestor::div[contains(@class,'rt-tr-group')]"));
		        
		        
		        
		        //Print the rows size        
		        System.out.println("Number of rows having data in the table is: " + rowsWithData.size());
			

		 }
		 
		 @Given("^Check Click on Buttons$") 
		 public void Check_Click_on_Buttons() throws InterruptedException
		 {
				

			 System.out.println("in test code");
				driver.get("https://demoqa.com/buttons");
				System.out.println("in test code 2");
				Thread.sleep(3000);
				Actions actions = new Actions(driver);
				actions.moveToElement(driver.findElement(By.id("doubleClickBtn"))).doubleClick().perform();
				
				boolean douClick = driver.findElement(By.id("doubleClickMessage")).isDisplayed();
				
				if(douClick==true)
				{
					System.out.println("Perform double click: Pass");
				}
				else
				{
					System.out.println("Does not Perform double click:Fail");
				}
				
				actions.moveToElement(driver.findElement(By.id("rightClickBtn"))).contextClick().perform();
				
				boolean rigClick = driver.findElement(By.id("rightClickMessage")).isDisplayed();
				if(rigClick==true)
				{
					System.out.println("Perform double click: Pass");
				}
				else
				{
					System.out.println("Does not Perform double click:Fail");
				}
				
		 }
		 
		 @Given("^Check UploadFile$") 
		 public void Check_UploadFile () throws InterruptedException
		 {
			 driver.get("https://demoqa.com/upload-download");
		        WebElement uploadElement = driver.findElement(By.id("uploadFile"));

			  uploadElement.sendKeys("D:/Animals photos/Bike.jpg");
			  
			 boolean msg = driver.findElement(By.id("uploadedFilePath")).isDisplayed();
			 if(msg==true)
			 {
				 System.out.println("File uploaded message is displayed");
			 }
			 else
			 {
				 System.out.println("File uploaded message is displayed");
			 }
			 
		 }
		 
		 @Given("^Check EnableButton after 5Sec$") 
		 public void Check_EnableButton_after_5Sec() throws InterruptedException
		 {

				driver.get("https://demoqa.com/dynamic-properties");
			    WebDriverWait wait = new WebDriverWait(driver,10);
			    wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
			    //wait.until(ExpectedConditions.)
		        
			    if(driver.findElement(By.id("enableAfter")).isDisplayed())
			    {
			    	System.out.println("Button is present");
			    }
			    else
			    {
			    	System.out.println("Button is not present");
			    }
		
				
	 }
		 @Then("^Check Button Color$") 
		 public void Check_Button_Color() throws InterruptedException
		 {
				driver.get("https://demoqa.com/dynamic-properties");
				//WebElement button = driver.findElement(By.id("presenceOfElementLocated()"));
				
			    String preColor = driver.findElement(By.id("colorChange")).getCssValue("color");
			   
			    String preHexcolor = Color.fromString(preColor).asHex();
			    System.out.println(preHexcolor);
			    
			    WebDriverWait wait = new WebDriverWait(driver,10);
			    wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
			    
			    String postColor = driver.findElement(By.id("colorChange")).getCssValue("color");
		        
			    String postHexColor = Color.fromString(postColor).asHex();
			    System.out.println(postHexColor);
			    		    
			    if(preHexcolor.equalsIgnoreCase(postHexColor))
			    {
			    	System.out.println("Button Color has not Changed");
			    }
			    else
			    {
			    	System.out.println("Button Color has Changed");
			    }
		 } 

}
