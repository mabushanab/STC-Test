package com.stc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.stc.factory.PageinstancesFactory;
import com.stc.pages.SubscriptionPage;

@Test(testName = "Subscription Price Validation KSA Test", description = "Subscription Price Validation KSA Test")
public class SubscriptionPriceValidationKSATest extends BaseTest {

	@Test
	public void subscriptionValidationKSATest() {
		driver.get("https://subscribe.stctv.com/sa-en");
		SubscriptionPage subscriptionKSAPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
		subscriptionKSAPage.getLite_text();
			
		Assert.assertEquals(subscriptionKSAPage.getLitePrice_text(), "15");
		Assert.assertEquals(subscriptionKSAPage.getClassicPrice_text(), "25");
		Assert.assertEquals(subscriptionKSAPage.getPremiumPrice_text(), "60");
	}
}
