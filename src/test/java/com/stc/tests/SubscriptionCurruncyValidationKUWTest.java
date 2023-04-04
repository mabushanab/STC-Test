package com.stc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.stc.factory.PageinstancesFactory;
import com.stc.pages.SubscriptionPage;

@Test(testName = "Subscription Curruncy Validation KUW Test", description = "Subscription Curruncy Validation KUW Test")
public class SubscriptionCurruncyValidationKUWTest extends BaseTest {

	@Test
	public void subscriptionValidationKUWTest() {
		driver.get("https://subscribe.stctv.com/kw-en");
		SubscriptionPage subscriptionKUWPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
//		subscriptionKUWPage.getLite_text();
		
		Assert.assertEquals(subscriptionKUWPage.getLiteCurrency_text(), "KWD");
		Assert.assertEquals(subscriptionKUWPage.getClassicCurrency_text(), "KWD");
		Assert.assertEquals(subscriptionKUWPage.getPremiumCurrency_text(), "KWD");

	}
}
