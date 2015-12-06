package com.euromoney.page_objects.web_site;

import org.openqa.selenium.By;

import com.euromoney.browser.Browser;

public class EuromoneyManagementTeamPage {

	/*
	 * A boolean method that returns if the user is on the right page or not
	 * 
	 * @Usage: simply call the method when on page
	 * @returns	true	if user is on the right page
	 * @returns	false	if user is not
	 */
	public static boolean isAt() {
		return Browser.instance.getTitle()
				.equalsIgnoreCase("Management team | Who we are | Euromoney Institutional Investor PLC");
	}

	/*
	 * A public boolean method that gets the src attribute of Andrew Rassbash picture and verifies his name is in the url.
	 * 
	 * @Usage:	simply call the method when on page
	 * @param	string	person
	 * @returns	true	if name is presented
	 * @returns	false	if user is not
	 */
	public boolean isImageURLContaining(String person) {
		String image = Browser.instance.findElement(By.xpath("//img[@alt='Picture of Andrew Rassbash']"))
				.getAttribute("src");
		if (image.contains(person)) {
			return true;
		} else {
			return false;
		}
	}
}
