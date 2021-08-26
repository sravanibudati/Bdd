package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionalities.RegistrationUsingPageFactory;

public class Steps_Registration {
	public WebDriver driver;
	public RegistrationUsingPageFactory registerPage;
	
	

	@Given("User launch Chrome Browser and opens url of the application {string}")
	public void user_launch_Chrome_Browser_and_opens_url_of_the_application(String string) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		registerPage = new RegistrationUsingPageFactory(driver);
		registerPage.openURL(string);
	}

	@When("User enters First name as {string} and Lastname as {string}")
	public void user_enters_First_name_as_and_Lastname_as(String string, String string2) {
		registerPage.setFirstAndLastName(string, string2);
	}

	@When("User enters Email Address as {string} and Phone Number as {string}")
	public void user_enters_Email_Address_as_and_Phone_Number_as(String string, String string2) {
		registerPage.setEmailAndPhoneNumber(string, string2);
	}

	@When("User enters Company Name as {string}")
	public void user_enters_Company_Name_as(String string) {
		registerPage.setCompany(string);
	}

	@When("User enters Street Address as {string} and Street Address{int} as {string}")
	public void user_enters_Street_Address_as_and_Street_Address_as(String string, Integer int1, String string2) {
		registerPage.setAddresses(string, string2);
	}

	@When("User enters City as {string} and State as {string}")
	public void user_enters_City_as_and_State_as(String string, String string2) {
		registerPage.setCityAndState(string, string2);
	}

	@When("User enters PostCode as {string} and Mobile number as {string}")
	public void user_enters_PostCode_as_and_Mobile_number_as(String string, String string2) {
		registerPage.setPostCodeandMobile(string, string2);
	}

	@When("User enters Password as {string} and Confirm Password as {string}")
	public void user_enters_Password_as_and_Confirm_Password_as(String string, String string2) {
		registerPage.setPasswords(string, string2);
	}

	@When("User enters Completed Capatch Verfication")
	public void user_enters_Completed_Capatch_Verfication() throws InterruptedException {
		// Thread.sleep(80000);
		// Skip this and click on Register Button for now
		System.out.println("Skipping the captcha");
	}

	@When("User click on Register button")
	public void user_click_on_Register_button() {
		registerPage.clickRegister();
		System.out.println("Registered Successfully");
	}

	@Then("Successfully registered")
	public void successfully_registered() throws InterruptedException {
		System.out.println("Registered Successfully");
		Thread.sleep(5000);
	}

	@When("User clicks on Logout button")
	public void user_clicks_on_Logout_button() {
		registerPage.clickLogout();
	}

	@Then("Successfully logout")
	public void successfully_logout() throws InterruptedException {
		Thread.sleep(3000);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String string, String string2) {
		registerPage.setEmailAndPassword(string, string2);
	}

	@When("User verfies Captcha")
	public void user_verfies_Captcha() throws InterruptedException {
		 Thread.sleep(80000);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_Login_button() {
		registerPage.clickLogin();
		System.out.println("Logged In Successfully");
	}

	@When("User clicks on Login button to login")
	public void user_clicks_on_Login_button_to_login() {
		registerPage.clickLogin();
	}

	@Then("User logs in Successfully")
	public void user_logs_in_Successfully() throws InterruptedException {
		Thread.sleep(8000);
	}

	@When("User clicks on Order New Services")
	public void user_clicks_on_Order_New_Services() {
		registerPage.clickOrdderNewServices();
	}

	@Then("User navigates to Installtion Page Successfully")
	public void user_navigates_to_Installtion_Page_Successfully() throws InterruptedException {
		Thread.sleep(2000);
	}

	@When("User clicks on Application Installation Radio button")
	public void user_clicks_on_Application_Installation_Radio_button() {
		registerPage.clickApplicationInstallRadio();
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_Continue_button() {
		registerPage.clickContinue();
	}

	@Then("User navigates to Review and Check Page Successfully")
	public void user_navigates_to_Review_and_Check_Page_Successfully() throws InterruptedException {
		Thread.sleep(2000);
	}

	@When("User clicks on Checkout")
	public void user_clicks_on_Checkout() {
		registerPage.clickCheckout();
	}

	@Then("User navigates to Checkout Page Successfully")
	public void user_navigates_to_Checkout_Page_Successfully() {
		System.out.println("Checked out successfully");
	}

}
