package com.euromoney.page_objects.store;

import org.openqa.selenium.By;

import com.euromoney.browser.Browser;

public class EuromoneyBookDetails {
	/*
	 * A static string field to store title
	 */
	public static String bookTitle;

	/*
	 * A boolean method that returns if the user is on the right page or not
	 * 
	 * @Usage: simply call the method when on page
	 * @returns	true	if user is on the right page
	 * @returns	false	if user is not
	 */
	public boolean isAt() {

		if (Browser.instance.findElement(By.xpath("//h1[text()='" + bookTitle + "']")).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * A public method that adds the displayed book to cart
	 * 
	 * @Usage: simply call the method when on page
	 * @returns	EuromoneyShoppingCart	new cart page
	 */
	public EuromoneyShoppingCart addToCart() {
		Browser.instance.findElement(By.xpath("//input[@value='Add to cart']")).click();
		return new EuromoneyShoppingCart();
	}
}
