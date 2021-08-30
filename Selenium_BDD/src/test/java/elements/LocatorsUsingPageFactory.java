package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorsUsingPageFactory {
  
	@FindBy(id="inputFirstName")
	public static WebElement firstName;
	
	@FindBy(id="inputLastName")
	public static WebElement lastName;
	
	@FindBy(id="inputEmail")
	public static WebElement email;
	
	@FindBy(id="inputPhone")
	public static WebElement phone;
	
	@FindBy(id="inputCompanyName")
	public static WebElement address;

	
	@FindBy(id="inputAddress1")
	public static WebElement address1;
	
	@FindBy(id="inputAddress2")
	public static WebElement address2;
	
	@FindBy(id="inputCity")
	public static WebElement city;

	@FindBy(id="stateinput")
	public static WebElement state;
	
	@FindBy(id="inputPostcode")
	public static WebElement postcode;

	@FindBy(id="customfield2")
	public static WebElement additionalPhoneNumber;
	
	@FindBy(id="inputNewPassword1")
	public static WebElement password;
	
	@FindBy(id="inputNewPassword2")
	public static WebElement confirmPassword;
	
	@FindBy(id="inputPassword")
	public static WebElement password_login;
	
	@FindBy(xpath="//*[@id=\"frmCheckout\"]/p/input")
	public static WebElement registerButton;
	
	@FindBy(partialLinkText="Logout")
	public static WebElement logoutButton;
	
	@FindBy(xpath="//*[@id=\"login\"]")
	public static WebElement loginButton;
	
	@FindBy(partialLinkText="Order New Services")
	public static WebElement orderNewServiceLink;
	 
	@FindBy(id="pid13")
	public static WebElement applicationInstallRadioOption;
	
	@FindBy(xpath="//*[@id=\"order-boxes\"]/div[3]/form/div[2]/button")
	public static WebElement continueButton;
	
	@FindBy(partialLinkText="Checkout")
	public static WebElement checkoutLink;
	
	
	
	
	
	
	
	
	
}
