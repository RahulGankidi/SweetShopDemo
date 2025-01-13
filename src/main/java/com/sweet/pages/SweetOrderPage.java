package com.sweet.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class SweetOrderPage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest test;
	
	public SweetOrderPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.test = test;
	}
	
	By SelectSweetsLink = By.linkText("Sweets");
	By ClickAddtoBasket = By.xpath("(//*[@class=\"btn btn-success btn-block addItem\"])[1]");
	By OpenBasket = By.xpath("(//*[@class=\"nav-link\"])[4]");
	By EnterFirstname = By.xpath("(//*[@class=\"form-control\"])[2]");
	By EnterLastname = By.xpath("(//*[@class=\"form-control\"])[3]");
	By EnterEmail = By.xpath("(//*[@class=\"form-control\"])[4]");
	By EnterAddress = By.xpath("(//*[@class=\"form-control\"])[5]");
	By EnterAddress2 = By.xpath("(//*[@class=\"form-control\"])[6]");
	By SelectCountry = By.xpath("(//*[@class=\"custom-select d-block w-100\"])[1]");
	By SelectCity = By.xpath("(//*[@class=\"custom-select d-block w-100\"])[2]");
	By EnterZip = By.xpath("(//*[@class=\"form-control\"])[7]");
	By EnterNameonCard = By.xpath("(//*[@class=\"form-control\"])[8]");
	By EnterCardNumber = By.xpath("(//*[@class=\"form-control\"])[9]");
	By EnterExpiration = By.xpath("(//*[@class=\"form-control\"])[10]");
	By EnterCvv = By.xpath("(//*[@class=\"form-control\"])[11]");
	By ClickConfirmCheckout = By.xpath("//*[@class=\"btn btn-primary btn-lg btn-block\"]");
	
	public void selectSweets() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement sweetElement = wait.until(ExpectedConditions.elementToBeClickable(SelectSweetsLink));
		sweetElement.click();
		test.pass("Selected SweetsLink");
	}
	public void clickonaddtoBasket() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement addtobasketElement = wait.until(ExpectedConditions.elementToBeClickable(ClickAddtoBasket));
		addtobasketElement.click();
		test.pass("Clicked on Add to Cart");
	}
	public void openBasket() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement openbasketElement = wait.until(ExpectedConditions.elementToBeClickable(OpenBasket));
		openbasketElement.click();
		test.pass("Opened Basket");
	}
	public void enterFirstname() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement firstnameElement = wait.until(ExpectedConditions.elementToBeClickable(EnterFirstname));
		firstnameElement.click();
		firstnameElement.sendKeys("Ravi");
		test.pass("Entered FirstName");
	}
	public void enterLastname() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement lastnameElement = wait.until(ExpectedConditions.elementToBeClickable(EnterLastname));
		lastnameElement.click();
		lastnameElement.sendKeys("Rao");
		test.pass("Entered LastName");
	}
	public void enterEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement emailElement = wait.until(ExpectedConditions.elementToBeClickable(EnterEmail));
		emailElement.click();
		emailElement.sendKeys("ravirao123@gmail.com");
		test.pass("Entered Email");
	}
	public void enterAddress() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement addressElement = wait.until(ExpectedConditions.elementToBeClickable(EnterAddress));
		addressElement.click();
		addressElement.sendKeys("10 Beeby Raod");
		test.pass("Entered Address");
	}
	public void enterAddress2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement address2Element = wait.until(ExpectedConditions.elementToBeClickable(EnterAddress2));
		address2Element.click();
		address2Element.sendKeys("Wales");
		test.pass("Entered Address2");
	}
	public void selectCountry() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement countryElement = wait.until(ExpectedConditions.elementToBeClickable(SelectCountry));
		countryElement.click();
		countryElement.sendKeys("United Kingdom");
		test.pass("Selected Country");
	}
	public void selectCity() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement cityElement = wait.until(ExpectedConditions.elementToBeClickable(SelectCity));
		cityElement.click();
		cityElement.sendKeys("Chester");
		test.pass("Selected City");
	}
	public void enterZip() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement zipElement = wait.until(ExpectedConditions.elementToBeClickable(EnterZip));
		zipElement.click();
		zipElement.sendKeys("CH12HC");
		test.pass("Entered Zip");
	}
	public void enternameonCard() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement nameoncardElement = wait.until(ExpectedConditions.elementToBeClickable(EnterNameonCard));
		nameoncardElement.click();
		nameoncardElement.sendKeys("RAVIRAO");
		test.pass("Entered Name on Card");
	}
	public void entercardNumber() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement cardnumberElement = wait.until(ExpectedConditions.elementToBeClickable(EnterCardNumber));
		cardnumberElement.click();
		cardnumberElement.sendKeys("4242424242424242");
		test.pass("Entered Card Number");
	}
	public void enterExpiration() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement expirationElement = wait.until(ExpectedConditions.elementToBeClickable(EnterExpiration));
		expirationElement.click();
		expirationElement.sendKeys("11/2027");
		test.pass("Entered Expiration");
	}
	public void enterCvv() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement cvvElement = wait.until(ExpectedConditions.elementToBeClickable(EnterCvv));
		cvvElement.click();
		cvvElement.sendKeys("123");
		test.pass("Entered Cvv");
	}
	public void clickonconfirmCheckout() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement confirmcheckoutElement = wait.until(ExpectedConditions.elementToBeClickable(ClickConfirmCheckout));
		confirmcheckoutElement.click();
		test.pass("Clicked on Confirm Checkout");
	}
}