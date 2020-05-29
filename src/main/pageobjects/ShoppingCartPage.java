package main.pageobjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.utils.BasePage;

public class ShoppingCartPage extends BasePage{

	@FindBy(className = "shoppingCart__productBrand")
	public WebElement elementCartItemBrand;

	@FindBy(className = "shoppingCart__productTitle")
	public WebElement elementCartItemTitle;

	@FindBy(className = "shoppingCart__removeProduct")
	public WebElement buttonRemoveItemFromCart;

	@FindBy(className = "//*[contains(@class,'undoRemoveProduct') and contains(text(),'Atðaukti')]")
	public WebElement buttonCancel;

	public void removeItemFromShoppingCart() {
		assertTrue(elementCartItemBrand.getText().contains("Samsung"), "Assert failed! Actual text: " + elementCartItemBrand.getText().toString() + " Expected text: Samsung");
		assertTrue(elementCartItemTitle.getText().contains("Galaxy S20 Ultra (5G)"), "Assert failed! Actual text: " + elementCartItemTitle.getText().toString() + " Expected text: Galaxy S20 Ultra (5G)");
		buttonRemoveItemFromCart.click();
		String bodyText = driver.findElement(org.openqa.selenium.By.tagName("body")).getText();
		assertTrue(!bodyText.contains("Galaxy S20 Ultra (5G)"),"Assert failed! Page still contains text: 'Galaxy S20 Ultra (5G)'");
		System.out.println("STEP: Item removed from shopping cart.");
	}

}
