package main.utils;

import org.openqa.selenium.support.PageFactory;

public class BasePage extends BaseTest {
	
	public BasePage() {
		PageFactory.initElements(getdriver(), this);
	}
}
