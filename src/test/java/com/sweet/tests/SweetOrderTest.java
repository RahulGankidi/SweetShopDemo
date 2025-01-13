package com.sweet.tests;

import org.testng.annotations.Test;

import com.sweet.pages.BasePage;
import com.sweet.pages.SweetOrderPage;

public class SweetOrderTest extends BasePage {
	
	SweetOrderPage sweetorderpage;
	
	@Test
	public void UserLoginTest() {
		test = extent.createTest("SweetOrder Test").info("SweetOrder Test Execution Started");
		sweetorderpage = new SweetOrderPage(driver, test);
		sweetorderpage.selectSweets();
		sweetorderpage.clickonaddtoBasket();
		sweetorderpage.openBasket();
		sweetorderpage.enterFirstname();
		sweetorderpage.enterLastname();
		sweetorderpage.enterEmail();
		sweetorderpage.enterAddress();
		sweetorderpage.enterAddress2();
		sweetorderpage.selectCountry();
		sweetorderpage.selectCity();
		sweetorderpage.enterZip();
		sweetorderpage.enternameonCard();
		sweetorderpage.entercardNumber();
		sweetorderpage.enterExpiration();
		sweetorderpage.enterCvv();
		sweetorderpage.clickonconfirmCheckout();
		
		test.info("SweetOrder Test Execution Completed Successfully");
	}
}
