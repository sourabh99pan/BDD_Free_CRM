/*package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsStepWithMapDefinition {

	WebDriver driver ;
	@Given("^User is accesing ToolsQAPage$")
	public void User_is_accesing_ToolsQAe()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
	}
	
	@When("^title of page ToolsQAPage$")
	public void title_of_page()
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
	
	@Then("^Enter all the User details$")
	public void Enter_all_User_details(DataTable formdetails) 
	{
		//formdetails.raw(); //it will give list of strings
		
		for(Map<String,String> data : formdetails.asMaps(String.class, String.class)) {
		//List<String> =new List<String>();
		driver.navigate().refresh();

		driver.findElement(By.id("firstName")).sendKeys(data.get("name"));
		driver.findElement(By.id("lastName")).sendKeys(data.get("surname"));
		driver.findElement(By.id("userEmail")).sendKeys(data.get("Mail"));

		driver.findElement(By.id("userNumber")).sendKeys(data.get("number"));

		
		driver.findElement(By.id("currentAddress")).sendKeys(data.get("city"));
		}
		Actions actions = new Actions(driver);
		actions.click(driver.findElement(By.id("hobbies-checkbox-1"))).perform();
		actions.moveToElement(driver.findElement(By.id("gender-radio-1"))).click().perform();
		driver.findElement(By.id("submit")).click();
		
		Boolean confirmpopup = driver.findElement(By.id("example-modal-sizes-title-lg")).isDisplayed();
		
		if(confirmpopup == true)
		{
			driver.findElement(By.id("closeLargeModal")).click();
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}*/
