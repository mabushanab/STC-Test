package com.stc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.stc.factory.PageinstancesFactory;
import com.stc.pages.SubscriptionPage;

@Test(testName = "Subscription Price Validation BAH Test", description = "Subscription Price Validation BAH Test")
public class SubscriptionPriceValidationBAHTest extends BaseTest {

	@Test
	public void subscriptionValidationBAHTest() {
		driver.get("https://subscribe.stctv.com/bh-en");
		SubscriptionPage subscriptionBAHPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
		subscriptionBAHPage.getLite_text();
			
		Assert.assertEquals(subscriptionBAHPage.getLitePrice_text(), "2");
		Assert.assertEquals(subscriptionBAHPage.getClassicPrice_text(), "3");
		Assert.assertEquals(subscriptionBAHPage.getPremiumPrice_text(), "6");
	}
}
