package stepDefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

//import Base.TestBase;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class FormsStepDefinition extends TestBase{
	
	 WebDriver driver;
	 
	/* @Before
		public void launchApp()
		{
			driver = TestBase.initBrowser();
			
			System.out.println("in forms launch app");
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			// driver.get("url");
			//driver.get("https://demoqa.com/automation-practice-form");
				
			 
		}*/
	 
	 /*FormsStepDefinition()
		{
			driver = TestBase.initBrowser();
			
			System.out.println("in element launch app");
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		}*/
		
	@Given("^Enter all details on form and click on submit$")
	public void Enter_all_details_on_form_and_click_on_submit(DataTable formdetails)
	{
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		for(Map<String,String> data : formdetails.asMaps(String.class, String.class)) {
			//List<String> =new List<String>();
			driver.navigate().refresh();

			driver.findElement(By.id("firstName")).sendKeys(data.get("firstname"));
			driver.findElement(By.id("lastName")).sendKeys(data.get("lastname"));
			driver.findElement(By.id("userNumber")).sendKeys(data.get("Number"));
			driver.findElement(By.id("userEmail")).sendKeys(data.get("Mail"));
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.id("gender-radio-1"))).click().perform();
			//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[6]/div[2]/div/div/div[1]")).sendKeys(data.get("Subject"));
			driver.findElement(By.id("currentAddress")).sendKeys(data.get("current address"));

		}
		
		
		 driver.findElement(By.id("submit")).click();
		 
			Boolean confirmpopup = driver.findElement(By.id("example-modal-sizes-title-lg")).isDisplayed();
			
			if(confirmpopup == true)
			{
				driver.findElement(By.id("closeLargeModal")).click();
				System.out.println("Confirm popup appears");
			}
			else
			{
				System.out.println("Confirm popup does not appears");
			}
	}

}
