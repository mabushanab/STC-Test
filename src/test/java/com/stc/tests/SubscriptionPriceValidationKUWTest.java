package com.stc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.stc.factory.PageinstancesFactory;
import com.stc.pages.SubscriptionPage;

@Test(testName = "Subscription Price Validation KUW Test", description = "Subscription Price Validation KUW Test")
public class SubscriptionPriceValidationKUWTest extends BaseTest {

	@Test
	public void subscriptionValidationKUWTest() {
		driver.get("https://subscribe.stctv.com/kw-en");
		SubscriptionPage subscriptionKUWPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
		subscriptionKUWPage.getLite_text();
			
		Assert.assertEquals(subscriptionKUWPage.getLitePrice_text(), "1.2");
		Assert.assertEquals(subscriptionKUWPage.getClassicPrice_text(), "2.5");
		Assert.assertEquals(subscriptionKUWPage.getPremiumPrice_text(), "4.8");
	}
}
