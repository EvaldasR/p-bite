package main.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.utils.BasePage;

public class MainPage extends BasePage {

	@FindBy(xpath = "//*[contains(@class,'fancybox-item fancybox-close') and contains(@title,'Close')]")
	public WebElement buttonClosePopup;

	@FindBy(xpath = "//*[@id='edit-search']")
	public WebElement inputFieldSearch;

	public void selectMobilePhone(String phoneName) {
		buttonClosePopup.click();
		inputFieldSearch.sendKeys(phoneName);
		inputFieldSearch.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(text(),'" + phoneName + "')]")).click();
		System.out.println("STEP: Mobile phone selected.");
	}

}
