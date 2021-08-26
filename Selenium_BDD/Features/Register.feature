Feature: Test Php Travels Application 
  @Smoketest @Regressiontest
  Scenario: Successful Registration with valid user information
    Given User launch Chrome Browser and opens url of the application "https://phptravels.org/register.php"
    When User enters First name as "Sravani" and Lastname as "B"
    And User enters Email Address as "sravani.b11@gmail.com" and Phone Number as "9876543210"
    And User enters Company Name as "HCL"
    And User enters Street Address as "Street 1" and Street Address2 as "Stree 2"
    And User enters City as "Karachi" and State as "Karachi"
    And User enters PostCode as "323244" and Mobile number as "9876543210"
    And User enters Password as "Test@123" and Confirm Password as "Test@123"
    And User enters Completed Capatch Verfication 
    And User click on Register button
    Then Successfully registered

    @Smoketest
    Scenario: Successful Login with Valid Login Details
    	Given User launch Chrome Browser and opens url of the application "https://phptravels.org/index.php?rp=/login"
	    When User enters Email as "sravani.b1@gmail.com" and Password as "Test@123"
	    And User clicks on Login button
	    Then User logs in Successfully
	   @Regressiontest 
	  Scenario: User Add Item to Cart and Proceed to Checkout Successfully
	  	Given User launch Chrome Browser and opens url of the application "https://phptravels.org/index.php?rp=/login"
	  	When User enters Email as "sravani.b1@gmail.com" and Password as "Test@123"
	    And User verfies Captcha
	    And User clicks on Login button to login
	    Then User logs in Successfully
	    When User clicks on Order New Services
	    Then User navigates to Installtion Page Successfully
	    When User clicks on Application Installation Radio button
	    And User clicks on Continue button
	    Then User navigates to Review and Check Page Successfully
	    When User clicks on Checkout
	    Then User navigates to Checkout Page Successfully
		 
