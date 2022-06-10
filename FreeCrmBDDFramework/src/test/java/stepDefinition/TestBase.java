package stepDefinition;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class TestBase {
	
	public  WebDriver driver = null;
	public  Properties prop;
	
	
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
	
	public WebDriver intilazeDriver() throws IOException
	{
		System.out.println("in TestBase cons");
		 final String propertyFilePath= "D:\\Guru\\FreeCrmBDDFramework\\Config.properties";
		 BufferedReader reader;
		 try {
		 reader = new BufferedReader(new FileReader(propertyFilePath));
		 prop = new Properties();
			 try {
				 prop.load(reader);
				 reader.close();
			 	 } catch (IOException e) {
				 e.printStackTrace();
			 }
		 } catch (FileNotFoundException e) {
		 e.printStackTrace();
		 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
	}

		 if(prop.getProperty("browser").equals("chrome"))
		 {
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
				//driver = new ChromeDriver();
				System.out.println(prop.getProperty("browser"));
				System.out.println("in chrome browser");

				 return new ChromeDriver();
		 }
		 else
		 {
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				//driver = new FirefoxDriver();
				System.out.println(prop.getProperty("browser"));
				System.out.println("in firefox browser");

				 return new FirefoxDriver(); 
		 }
		
}

	/*public  void initBrowser()
	{
		 if(prop.getProperty("browser").equals("chrome"))
		 {
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
				//driver = new ChromeDriver();
				System.out.println("in chrome browser");
				//return new ChromeDriver();
				System.out.println("in initBrowser");
				 driver.manage().window().maximize();
				 driver.manage().deleteAllCookies();
				 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 }
		 else
		 {
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
				driver = new FirefoxDriver();
				System.out.println(prop.getProperty("browser"));
				System.out.println("in firefox browser");
				//return new FirefoxDriver();
				System.out.println("in initBrowser");
				 driver.manage().window().maximize();
				 driver.manage().deleteAllCookies();
				 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 }
		 

		 //return driver;
	}*/
	
}