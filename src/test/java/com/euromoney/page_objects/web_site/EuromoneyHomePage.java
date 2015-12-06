package com.euromoney.page_objects.web_site;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.euromoney.browser.Browser;
import com.euromoney.page_objects.store.EuromoneyStore;

public class EuromoneyHomePage {
	/*
	 * A constructor that checks if the user is on the right page
	 */
	public static EuromoneyHomePage goTo() {
		Browser.instance.get("http://www.euromoneyplc.com/");
		return new EuromoneyHomePage();
	}

	/*
	 * A boolean method that returns if the user is on the right page or not
	 * 
	 * @Usage: simply call the method when on page
	 * @returns	true	if user is on the right page
	 * @returns	false	if user is not
	 */
	public static boolean isAt() {
		return Browser.instance.getTitle().equalsIgnoreCase("");
	}

	/*
	 * A public method that navigates to management page
	 * 
	 * @Usage: simply call the method when on page
	 * @returns	EuromoneyManagementTeamPage	new management team page
	 */
	public EuromoneyManagementTeamPage goToManagementPage() {
		engageMenu();
		clickWhoWeAre();
		clickManagementTeam();
		return new EuromoneyManagementTeamPage();
	}

	/*
	 * A private method that clicks on the management team link from the menu
	 * It first waits for the item to appear and then clicks on it 
	 * 
	 * @Usage:	call the method when menu is engaged
	 */
	private void clickManagementTeam() {
		WebDriverWait wait = new WebDriverWait(Browser.instance, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Management team']")));
		
		Browser.instance.findElement(By.xpath("//a[text()='Management team']")).click();
	}

	/*
	 * A private method that clicks on the who we are link from the menu
	 * It first waits for the item to appear and then clicks on it 
	 * 
	 * @Usage:	call the method when menu is engaged
	 */
	private void clickWhoWeAre() {
		WebDriverWait wait = new WebDriverWait(Browser.instance, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Who we are']")));
		
		Browser.instance.findElement(By.xpath("//a[text()='Who we are']")).click();
				
	}

	/*
	 * A private method that opens the menu
	 * It first checks if the menu is already opened, if not it opens it up
	 *  
	 * @Usage:	call the method when menu is engaged
	 */
	private void engageMenu() {
		String at = Browser.instance.findElement(By.cssSelector("a.menu_trigger")).getAttribute("aria-expanded");
		if(!at.equals("true")){
			Browser.instance.findElement(By.cssSelector("a.menu_trigger")).click();
		}

	}

	/*
	 * A public method that navigates user to the EuromoneyStore
	 * 
	 * @Usage:	call the method when on the Euromoney website.
	 * @returns	EuromoneyStore	new window is opened. to get handle of it, use Browser.switch("title")
	 */
	public EuromoneyStore goToStore() {
		engageMenu();
		clickEuromoneyStore();
		return new EuromoneyStore();
	}

	/*
	 * A private method that clicks on the EuromoneyStore link
	 * 
	 * @Usage:	call the method when the menu is engaged.
	 */
	private void clickEuromoneyStore() {
		WebDriverWait wait = new WebDriverWait(Browser.instance, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Euromoney Store']")));
		Browser.instance.findElement(By.xpath("//a[text()='Euromoney Store']")).click();		
	}

}
