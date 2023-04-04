package com.stc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.stc.factory.PageinstancesFactory;
import com.stc.pages.SubscriptionPage;

@Test(testName = "Subscription Curruncy Validation KSA Test", description = "Subscription Curruncy Validation KSA Test")
public class SubscriptionCurruncyValidationKSATest extends BaseTest {

	@Test
	public void subscriptionValidationKSATest() {
		driver.get("https://subscribe.stctv.com/sa-en");
		SubscriptionPage subscriptionKSAPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
		subscriptionKSAPage.getLite_text();
		
		Assert.assertEquals(subscriptionKSAPage.getLiteCurrency_text(), "SAR");
		Assert.assertEquals(subscriptionKSAPage.getClassicCurrency_text(), "SAR");
		Assert.assertEquals(subscriptionKSAPage.getPremiumCurrency_text(), "SAR");

	}
}
