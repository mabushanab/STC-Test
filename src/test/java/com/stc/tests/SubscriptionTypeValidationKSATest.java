package com.stc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.stc.factory.PageinstancesFactory;
import com.stc.pages.SubscriptionPage;

@Test(testName = "Subscription Type Validation KSA Test", description = "Subscription Type Validation KSA Test")
public class SubscriptionTypeValidationKSATest extends BaseTest {

	@Test
	public void subscriptionValidationKSATest() {
		driver.get("https://subscribe.stctv.com/sa-en");
		SubscriptionPage subscriptionKSAPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
		subscriptionKSAPage.getLite_text();
		
		Assert.assertEquals(subscriptionKSAPage.getLite_text(), "LITE");
		Assert.assertEquals(subscriptionKSAPage.getClassic_text(), "CLASSIC");
		Assert.assertEquals(subscriptionKSAPage.getPremium_text(), "PREMIUM");
	}
}
