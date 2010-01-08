package com.crawljax.condition.browserwaiter;

import com.crawljax.browser.EmbeddedBrowser;

/**
 * Abstract class for ExpectedConditions.
 * 
 * @author dannyroest@gmail.com (Danny Roest)
 * @version $Id: AbstractExpectedCondition.java 6388 2009-12-29 13:36:00Z mesbah $
 */
public abstract class AbstractExpectedCondition implements ExpectedCondition {

	private EmbeddedBrowser browser;

	/**
	 * 
	 * @return Whether the condition is statisfied. 
	 */
	public abstract boolean isSatisfied();

	/**
	 * Returns the browser.
	 * @return The browser.
	 */
	public EmbeddedBrowser getBrowser() {
		return browser;
	}

	/**
	 * Sets the browser.
	 * @param browser The browser.
	 */
	public void setBrowser(EmbeddedBrowser browser) {
		this.browser = browser;
	}
}