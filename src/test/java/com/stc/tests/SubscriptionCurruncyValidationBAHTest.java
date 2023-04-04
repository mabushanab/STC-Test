package com.stc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.stc.factory.PageinstancesFactory;
import com.stc.pages.SubscriptionPage;

@Test(testName = "Subscription Curruncy Validation BAH Test", description = "Subscription Curruncy Validation BAH Test")
public class SubscriptionCurruncyValidationBAHTest extends BaseTest {

	@Test
	public void subscriptionValidationBHDTest() {
		driver.get("https://subscribe.stctv.com/bh-en");
		SubscriptionPage subscriptionBAHPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
		subscriptionBAHPage.getLite_text();
		
		Assert.assertEquals(subscriptionBAHPage.getLiteCurrency_text(), "BHD");
		Assert.assertEquals(subscriptionBAHPage.getClassicCurrency_text(), "BHD");
		Assert.assertEquals(subscriptionBAHPage.getPremiumCurrency_text(), "BHD");

	}
}
