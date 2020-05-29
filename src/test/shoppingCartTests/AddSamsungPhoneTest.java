package test.shoppingCartTests;

import org.testng.annotations.Test;

import main.pageobjects.MainPage;
import main.pageobjects.MobilePhonesPage;
import main.pageobjects.ShoppingCartPage;
import main.utils.BaseTest;

public class AddSamsungPhoneTest extends BaseTest {

	@Test()
	public static void addSamsungMobilePhone() {

		getdriver().get("https://www.bite.lt");

		MainPage mainPage = new MainPage();

		mainPage.selectMobilePhone("Samsung Galaxy S20 Ultra (5G)");

		MobilePhonesPage mobilePhonesPage = new MobilePhonesPage();

		mobilePhonesPage.addItemAndNavigateToCart();

		ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

		shoppingCartPage.removeItemFromShoppingCart();

	}

}