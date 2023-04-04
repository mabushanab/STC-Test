package com.stc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.stc.factory.PageinstancesFactory;
import com.stc.pages.SubscriptionPage;

@Test(testName = "Subscription Type Validation BAH Test", description = "Subscription Type Validation BAH Test")
public class SubscriptionTypeValidationBAHTest extends BaseTest {

	@Test
	public void subscriptionValidationBAHTest() {
		driver.get("https://subscribe.stctv.com/bh-en");
		SubscriptionPage subscriptionBAHPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
		subscriptionBAHPage.getLite_text();
		
		Assert.assertEquals(subscriptionBAHPage.getLite_text(), "LITE");
		Assert.assertEquals(subscriptionBAHPage.getClassic_text(), "CLASSIC");
		Assert.assertEquals(subscriptionBAHPage.getPremium_text(), "PREMIUM");
	}
}
