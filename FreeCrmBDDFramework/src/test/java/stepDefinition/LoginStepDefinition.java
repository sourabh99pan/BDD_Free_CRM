
  /*package stepDefinition;
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.chrome.ChromeDriver; import
  org.openqa.selenium.interactions.Actions;
  
  import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
  cucumber.api.java.en.When;
  
  
  public class LoginStepDefinition {
  
  WebDriver driver ;
  
  @Given("^User is accesing ToolsQA$") 
  public void User_is_accesing_ToolsQA()
  { System.setProperty("webdriver.gecko.driver",
  "D:\\Selenium\\geckodriver.exe"); driver = new ChromeDriver();
  driver.get("https://demoqa.com/automation-practice-form");
  driver.manage().window().maximize(); }
  
  @When("^title of page$") 
  public void title_of_page() { String title =
  driver.getTitle(); System.out.println(title);
  if(title.equalsIgnoreCase("ToolsQA")) {
  System.out.println("Title displayed"); } else {
  System.out.println("Title has not displayed"); } }
  
  @Then("^Enter User details \"([^\"]*)\" and \"([^\"]*)\"$") 
  public void Enter_User_details(String username, String password) {
  driver.navigate().refresh();
  
  driver.findElement(By.id("firstName")).sendKeys(username);
  driver.findElement(By.id("lastName")).sendKeys(password);
  driver.findElement(By.id("userEmail")).sendKeys("Sourabh.Pandya@gmail.com");
  Actions actions = new Actions(driver);
  actions.moveToElement(driver.findElement(By.id("gender-radio-1"))).click().
  perform(); driver.findElement(By.id("userNumber")).sendKeys("8425016102");
  
  actions.click(driver.findElement(By.id("hobbies-checkbox-1"))).perform();
  driver.findElement(By.id("currentAddress")).sendKeys("Ratlam");
  
  driver.findElement(By.id("submit")).click();
  
  Boolean confirmpopup =
  driver.findElement(By.id("example-modal-sizes-title-lg")).isDisplayed();
  
  if(confirmpopup == true) {
  driver.findElement(By.id("closeLargeModal")).click();
  System.out.println("Pass"); } else { System.out.println("Fail"); } }
  
  @Then("^Close the browser$") 
  public void Close_the_browser() { driver.quit();
  } }
 */