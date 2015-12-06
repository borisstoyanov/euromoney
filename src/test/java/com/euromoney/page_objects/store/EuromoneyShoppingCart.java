package com.euromoney.page_objects.store;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.euromoney.browser.Browser;

public class EuromoneyShoppingCart {

	/*
	 * A public boolean method that checks if the book of month is added to cart. 
	 * It uses a static field title to check if it is added to cart. 
	 * 
	 * @Usage: simply call the method when on page
	 * @returns	true	if the book is added
	 * @returns	false	if not
	 */
	public boolean bookOfMonthIsAdded() {
		if (Browser.instance
				.findElement(By.xpath(
						"//h4[text()='Shopping Cart Items']/..//a[text()='" + EuromoneyBookDetails.bookTitle + "']"))
				.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * A public boolean method that returns if the price is displayed in GBP
	 * 
	 * @Usage: simply call the method when on page
	 * @returns	true	if the price is in GBP
	 * @returns	false	if not
	 */
	public boolean priceIsInGBP() {
		if (new Select(Browser.instance.findElement(By.id("cID"))).getFirstSelectedOption().getText().equals("£")) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * A boolean method that returns if the user is on the right page or not
	 * 
	 * @Usage: simply call the method when on page
	 * @returns	true	if user is on the right page
	 * @returns	false	if user is not
	 */
	public boolean isAt() {
		if (Browser.instance.findElement(By.xpath("//h1[text()='Shopping Cart']")).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

}
