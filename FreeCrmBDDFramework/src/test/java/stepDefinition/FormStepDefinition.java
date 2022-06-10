
  /*package stepDefinition;
  
  import java.util.List;
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.chrome.ChromeDriver; import
  org.openqa.selenium.interactions.Actions;
  
  import cucumber.api.DataTable; import cucumber.api.java.en.Given; import
  cucumber.api.java.en.Then; import cucumber.api.java.en.When;
  
  public class FormStepDefinition {
  
  WebDriver driver ;
  
  @Given("^User is accesing ToolsQADeal$") 
  public void User_is_accesing_ToolsQAe()
  { System.setProperty("webdriver.gecko.driver",
  "D:\\Selenium\\geckodriver.exe"); driver = new ChromeDriver();
  driver.get("https://demoqa.com/automation-practice-form");
  driver.manage().window().maximize(); }
  
  @When("^title of page ToolsQADeal$") 
  public void title_of_page() { String title =
  driver.getTitle(); System.out.println(title);
  if(title.equalsIgnoreCase("ToolsQA")) {
  System.out.println("Title displayed"); } else {
  System.out.println("Title has not displayed"); } }
  
  @Then("^Enter all Deal User details$") public void
  Enter_all_User_details(DataTable formdetails) { //formdetails.raw(); //it  will give list of strings
 
  
  List<List<String>> data = formdetails.raw(); //List<String> =new List<String>(); driver.navigate().refresh();
  
  
  driver.findElement(By.id("firstName")).sendKeys(data.get(0).get(0));
  driver.findElement(By.id("lastName")).sendKeys(data.get(0).get(1));
  driver.findElement(By.id("userEmail")).sendKeys(data.get(0).get(2)); Actions
  actions = new Actions(driver);
  actions.moveToElement(driver.findElement(By.id("gender-radio-1"))).click().
  perform();
  driver.findElement(By.id("userNumber")).sendKeys(data.get(0).get(3));
  
  actions.click(driver.findElement(By.id("hobbies-checkbox-1"))).perform();
  driver.findElement(By.id("currentAddress")).sendKeys(data.get(0).get(4));
  
  driver.findElement(By.id("submit")).click();
  
  Boolean confirmpopup =
  driver.findElement(By.id("example-modal-sizes-title-lg")).isDisplayed();
  
  if(confirmpopup == true) {
  driver.findElement(By.id("closeLargeModal")).click();
  System.out.println("Pass"); } else { System.out.println("Fail"); } } }*/
 