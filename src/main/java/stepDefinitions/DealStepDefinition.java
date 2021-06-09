//package stepDefinitions;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealStepDefinition {
//	public WebDriver driver;
//	
//	@Given("^user is already on login page$")
//	public void user_already_on_login_page() {
//	
//		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
//		driver = new ChromeDriver();	
//		driver.manage().window().maximize();  //maximize the window
//		driver.manage().deleteAllCookies();  //delete all cookies		
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://ui.freecrm.com/");
//	}
//
//	@When("^title of login page is Cogmento CRM$")
//	public void title_of_login_page_is_Cogmento_CRM(){
//	   String title = driver.getTitle();
//	   System.out.println(title);
//   		Assert.assertEquals("Cogmento CRM",title);
//	}
//
//	//Reg Exp:
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\"
//	
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credential) {
//		List<List<String>> data = credential.raw();
//	    driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//	    driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	}
//	
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
//	}
//	
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() {
//	   boolean isName = driver.findElement(By.xpath("//span[contains(text(),'Kirti Kanojiya')]")).isDisplayed();
//	   Assert.assertTrue(isName);
//	}
//	
//	@Then("^user moves to new deal page$")
//	public void user_moves_to_new_deal_page() {
//	   driver.findElement(By.linkText("Deals")).click();
//	   driver.findElement(By.xpath("//a[@href='/deals/new']/button")).click();
//	}
//	
//	@Then("^user enters deals deatils title and commission and amount$")
//	public void user_enters_deals_deatils(DataTable dealsData) {
//		List<List<String>> dealValues = dealsData.raw();
//	   driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
//	   driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(1));
//	   driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(2));
//	   driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//	}
//	
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}

//}
