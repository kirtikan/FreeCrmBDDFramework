//package stepDefinitions;
//import java.util.Map;
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
//public class DealsMapStepDefinition {
//	public WebDriver driver;
//
//	@Given("^user is already on login page$")
//	public void user_already_on_login_page() {
//
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize(); // maximize the window
//		driver.manage().deleteAllCookies(); // delete all cookies
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://ui.freecrm.com/");
//	}
//
//	@When("^title of login page is Cogmento CRM$")
//	public void title_of_login_page_is_Cogmento_CRM() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Cogmento CRM", title);
//	}
//
//	// Reg Exp:
//	// 1. \"([^\"]*)\"
//	// 2. \"(.*)\"
//
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credential) {
//		for (Map<String, String> data : credential.asMaps(String.class, String.class)) {
//			driver.findElement(By.name("email")).sendKeys(data.get("username"));
//			driver.findElement(By.name("password")).sendKeys(data.get("password"));
//		}
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() {
//		boolean isName = driver.findElement(By.xpath("//span[contains(text(),'Kirti Kanojiya')]")).isDisplayed();
//		Assert.assertTrue(isName);
//	}
//
//	@Then("^user moves to new deal page$")
//	public void user_moves_to_new_deal_page() {
//		driver.findElement(By.linkText("Deals")).click();
//		driver.findElement(By.xpath("//a[@href='/deals/new']/button")).click();
//	}
//
//	@Then("^user enters deals deatils$")
//	public void user_enters_deals_deatils(DataTable dealsData) {
//
//		for (Map<String, String> dealValues : dealsData.asMaps(String.class, String.class))
//		{
//			driver.findElement(By.name("title")).sendKeys(dealValues.get("title"));
//			driver.findElement(By.name("commission")).sendKeys(dealValues.get("commission"));
//			driver.findElement(By.name("amount")).sendKeys(dealValues.get("amount"));
//			driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//			
//			System.out.println("newwwwwwwwwww");
//			driver.findElement(By.linkText("Deals")).click();
//			System.out.println("helllloooooooo");
//			driver.findElement(By.xpath("//a[@href='/deals/new']/button")).click();
//		}
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}

//}
