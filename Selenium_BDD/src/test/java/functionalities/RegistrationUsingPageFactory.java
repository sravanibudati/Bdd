package functionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import elements.LocatorsUsingPageFactory;

public class RegistrationUsingPageFactory {
	public static String email = "sravani.b9@gmail.com";
	public static String password = "Test@123";

	public WebDriver cDriver;
	public RegistrationUsingPageFactory(WebDriver driver) {
		cDriver = driver;
		PageFactory.initElements(driver, LocatorsUsingPageFactory.class);
	}
	public void openURL(String url) {
		cDriver.get(url);
	}
	public void setFirstAndLastName(String fName, String lName) {
		LocatorsUsingPageFactory.firstName.sendKeys(fName);
		LocatorsUsingPageFactory.lastName.sendKeys(lName);
	}
	public void setEmailAndPhoneNumber(String emailText, String phoneText) {
		LocatorsUsingPageFactory.email.sendKeys(emailText);
		LocatorsUsingPageFactory.phone.sendKeys(phoneText);
	}
	public void setCompany(String name) {
		LocatorsUsingPageFactory.address.sendKeys(name);
	}

	public void setAddresses(String add1, String add2) {
		LocatorsUsingPageFactory.address1.sendKeys(add1);
		LocatorsUsingPageFactory.address2.sendKeys(add2);
	}
	public void setCityAndState(String cityText, String stateText) {
		LocatorsUsingPageFactory.city.sendKeys(cityText);
		LocatorsUsingPageFactory.state.sendKeys(stateText);
	}
	public void setPasswords(String password1, String password2) {
		LocatorsUsingPageFactory.password.sendKeys(password1);
		LocatorsUsingPageFactory.confirmPassword.sendKeys(password2);
	}
	public void setPostCodeandMobile(String post, String mob) {
		LocatorsUsingPageFactory.postcode.sendKeys(post);
		LocatorsUsingPageFactory.additionalPhoneNumber.sendKeys(mob);
	}
	public void clickRegister() {
		LocatorsUsingPageFactory.registerButton.click();
	}
	public void clickLogout() {
		LocatorsUsingPageFactory.logoutButton.click();
	}
	public void setEmailAndPassword(String emailText, String pass) {
		LocatorsUsingPageFactory.email.sendKeys(emailText);
		LocatorsUsingPageFactory.password_login.sendKeys(pass);
	}
	public void clickLogin() {
		LocatorsUsingPageFactory.loginButton.click();
	}
	public void clickOrdderNewServices() {
		LocatorsUsingPageFactory.orderNewServiceLink.click();
	}
	public void clickApplicationInstallRadio() {
		LocatorsUsingPageFactory.applicationInstallRadioOption.click();
	}
	public void clickContinue() {
		LocatorsUsingPageFactory.continueButton.click();
	}
	public void clickCheckout() {
		LocatorsUsingPageFactory.checkoutLink.click();
	}
	@Test
	public void register() throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");

		driver = new ChromeDriver(options);
		driver.get("https://phptravels.org/register.php");
		PageFactory.initElements(driver, LocatorsUsingPageFactory.class);
		LocatorsUsingPageFactory.firstName.sendKeys("Sravani");
		LocatorsUsingPageFactory.lastName.sendKeys("B");
		LocatorsUsingPageFactory.email.sendKeys(email);
		LocatorsUsingPageFactory.phone.sendKeys("9876543210");
		LocatorsUsingPageFactory.address.sendKeys("HCL");
		LocatorsUsingPageFactory.address1.sendKeys("2nd cross");
		LocatorsUsingPageFactory.address2.sendKeys("Some street");
		LocatorsUsingPageFactory.city.sendKeys("Karachi");
		LocatorsUsingPageFactory.state.sendKeys("Karachi");
		LocatorsUsingPageFactory.postcode.sendKeys("520166");
		LocatorsUsingPageFactory.additionalPhoneNumber.sendKeys("9876543210");
		LocatorsUsingPageFactory.password.sendKeys(password);
		LocatorsUsingPageFactory.confirmPassword.sendKeys(password);
		Thread.sleep(80000);
		LocatorsUsingPageFactory.registerButton.click();
		Thread.sleep(5000);
		// Logging out
		LocatorsUsingPageFactory.logoutButton.click();
		Thread.sleep(2000);
		// Email and Password
		LocatorsUsingPageFactory.email.sendKeys(email);
		LocatorsUsingPageFactory.password.sendKeys(password);
		// Thread Sleep for 80 Sec to enter captcha
		Thread.sleep(80000);

		// Login Click
		LocatorsUsingPageFactory.loginButton.click();
		Thread.sleep(10000);

		// Click on Order New Services
		LocatorsUsingPageFactory.orderNewServiceLink.click();
		Thread.sleep(2000);

		// Select Application Installation Option
		LocatorsUsingPageFactory.applicationInstallRadioOption.click();

		// Click on Continue
		// This will take to cart check out page
		LocatorsUsingPageFactory.continueButton.click();

		Thread.sleep(3000);

		// Click on Checkout button
		LocatorsUsingPageFactory.checkoutLink.click();

	}
}
