package com.euromoney.page_objects.store;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.euromoney.browser.Browser;

public class EuromoneyStore {
	/*
	 * A constructor to build up the EuromoneyStore object. 
	 * It switches window by given title
	 * Waits until the popup is displayed and closes it
	 * Then sets the BookOfMonth
	 * 
	 * @Usage: When instantiated make sure the store is opened for the first time with the browser.
	 */
	public EuromoneyStore() {
		Browser.switchWindow("Euromoney Institutional Investor PLC");

		WebDriverWait wait = new WebDriverWait(Browser.instance, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.closePopup")));
		
		Browser.instance.findElement(By.cssSelector("a.closePopup")).click();
		
		EuromoneyBookDetails.bookTitle = Browser.instance
				.findElement(By.xpath("//span[text()='Book of the Month']//../..//img")).getAttribute("alt");
	}

	/*
	 * A public method that clicks on "view book details" button on the BookOfMonth grid
	 * It waits untill the book appears and click on the button. 
	 *
	 * @Usage:	simply call the method when on the store frontpage
	 * @returns EuromoneyBookDetails	new book details object.
	 */
	public EuromoneyBookDetails viewBookOfMonth() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(Browser.instance, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Book of the Month']//../..//input")));
		
		Thread.sleep(1000);
		Browser.instance.findElement(By.xpath("//span[text()='Book of the Month']//../..//input")).click();
		
		return new EuromoneyBookDetails();
	}

}
