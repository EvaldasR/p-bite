package main.pageobjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.utils.BasePage;

public class MobilePhonesPage extends BasePage{

	@FindBy(xpath = "//*[contains(@class,'product-device__title js-singleProduct-title')]")
	public WebElement elementDeviceTitle;

	@FindBy(id = "edit-submit")
	public WebElement buttonAddToCart;

	@FindBy(xpath = "//*[contains(@class,'btn btn-default') and contains(text(),'Á krepðelá')]")
	public WebElement buttonNavigateToCart;

	public void addItemAndNavigateToCart() {
		assertTrue(elementDeviceTitle.getText().contains("Samsung Galaxy S20 Ultra (5G)"), "Assert failed! Actual text: " + elementDeviceTitle.getText().toString() + " Expected text: Galaxy S20 Ultra (5G)");
		buttonAddToCart.sendKeys(Keys.ENTER);
		System.out.println("STEP: Mobile phone added to shopping cart.");
		buttonNavigateToCart.click();
		System.out.println("STEP: Navigated to shopping cart.");
	}

}
