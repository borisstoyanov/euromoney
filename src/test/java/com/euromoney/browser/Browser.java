package com.euromoney.browser;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	/*
	 * A static reference of the instance.
	 * 
	 * Usage: it should be directly called like: Browser.instance...
	 */
	public static WebDriver instance;

	/*
	 * A public method that initiates a Firefox browser
	 * 
	 * Usage: Usually used in the setUp() method of a test. Simply call the
	 * method and the browser will be instantiated
	 */
	public static void init() {
		instance = new FirefoxDriver();
	}

	/*
	 * A public method that kills the browser
	 */
	public static void quit() {
		instance.quit();
	}

	/*
	 * A public static method that switches handle of the browser by given title 
	 * If the passed title is not available the method would switch to current browser
	 * 
	 * Usage: Pass the browser title with a string
	 * @param	title	the title of the window
	 * @return	true and switches to new window if existing
	 * @return	false if not existing
	 */
	public static boolean switchWindow(String title) {
		String currentWindow = instance.getWindowHandle();
		Set<String> availableWindows = instance.getWindowHandles();
		if (!availableWindows.isEmpty()) {
			for (String windowId : availableWindows) {
				if (instance.switchTo().window(windowId).getTitle().equals(title)) {
					return true;
				} else {
					instance.switchTo().window(currentWindow);
				}
			}
		}
		return false;
	}
}
