package com.stc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.stc.factory.PageinstancesFactory;
import com.stc.pages.SubscriptionPage;

@Test(testName = "Subscription Type Validation KUW Test", description = "Subscription Type Validation KUW Test")
public class SubscriptionTypeValidationKUWTest extends BaseTest {

	@Test
	public void subscriptionValidationKUWTest() {
		driver.get("https://subscribe.stctv.com/kw-en");
		SubscriptionPage subscriptionKUWPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
		subscriptionKUWPage.getLite_text();
		
		Assert.assertEquals(subscriptionKUWPage.getLite_text(), "LITE");
		Assert.assertEquals(subscriptionKUWPage.getClassic_text(), "CLASSIC");
		Assert.assertEquals(subscriptionKUWPage.getPremium_text(), "PREMIUM");
	}
}
