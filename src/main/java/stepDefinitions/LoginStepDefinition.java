//package stepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//
//public class LoginStepDefinition {
//	
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
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username, String password) {
//	    driver.findElement(By.name("email")).sendKeys(username);
//	    driver.findElement(By.name("password")).sendKeys(password);
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
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() {
//	   driver.findElement(By.linkText("Contacts")).click();
//	   driver.findElement(By.xpath("//a[@href='/contacts/new']/button")).click();
//	}
//	
//	@Then("^user enters contact deatils \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_contact_deatils(String firstname, String lastname, String department) {
//	   driver.findElement(By.name("first_name")).sendKeys(firstname);
//	   driver.findElement(By.name("last_name")).sendKeys(lastname);
//	   driver.findElement(By.name("department")).sendKeys(department);
//	   driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//	}
//	
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}

//}
