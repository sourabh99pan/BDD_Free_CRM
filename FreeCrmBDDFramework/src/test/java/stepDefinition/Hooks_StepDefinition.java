/*package stepDefinition;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_StepDefinition {
	
	WebDriver driver ;
	

	@Given("^user is on toolsqa page$")
	public void User_is_accesing_ToolsQAe()
	{
		driver.navigate().to("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("tabButton")).click();
		
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1)); 
		    
		  boolean  newtab =  driver.findElement(By.id("sampleHeading")).isDisplayed();
		  
		  if (newtab==true)
			{
				System.out.println("In user is on toolsqa page:Passed");
			}
			else
			{
				System.out.println("In user is on toolsqa page:Failed");
			}
	}
	
	@When("^user fills the form$")
	public void user_fills_the_form()
	{
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("ToolsQA"))
		{
			System.out.println("Title displayed");
		}
		else
		{
			System.out.println("Title has not displayed");
		}
	}
	
	@Then("^deal is created on toolsQA$")
	public void deal_is_created_on_toolsQA()
	{
		System.out.println("i am in test 014");
		driver.navigate().to("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());
		
		Alert simpleAlert =  driver.switchTo().alert();
	
		String alertText =  simpleAlert.getText();
				
		simpleAlert.accept();
		
		if(alertText.contains("You clicked a button"))
		{
			System.out.println("in deal is created on toolsQA:Passed");
		}
		else
		{
			System.out.println("in deal is created on toolsQA:Failed");
		}
	}
	

}
*/