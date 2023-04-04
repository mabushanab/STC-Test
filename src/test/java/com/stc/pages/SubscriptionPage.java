package com.stc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriptionPage extends BasePage {

	@FindBy(xpath = "//strong[contains(text(),'Lite')]")
	private WebElement Lite_text;

	@FindBy(xpath = "//strong[contains(text(),'Classic')]")
	private WebElement Classic_text;
	
	@FindBy(xpath = "//strong[contains(text(),'Premium')]")
	private WebElement Premium_text;
	

	@FindBy(xpath = "//div[@id='currency-lite']//b")
	private WebElement LitePrice_text;

	@FindBy(xpath = "//div[@id='currency-classic']//b")
	private WebElement ClassicPrice_text;
	
	@FindBy(xpath = "//div[@id='currency-premium']//b")
	private WebElement PremiumPrice_text;
	
	
	@FindBy(xpath = "//div[@id='currency-lite']//i")
	private WebElement LiteCurrency_text;

	@FindBy(xpath = "//div[@id='currency-classic']//i")
	private WebElement ClassicCurrency_text;
	
	@FindBy(xpath = "//div[@id='currency-premium']//i")
	private WebElement PremiumCurrency_text;
	
	
	public SubscriptionPage(WebDriver driver) {
		super(driver);
	}
	
	//Type
	public String getLite_text() {
		return Lite_text.getText();
	}
	
	public String getClassic_text() {
		return Classic_text.getText();
	}
	
	public String getPremium_text() {
		return Premium_text.getText();
	}
	
	//Price	
	public String getLitePrice_text() {
		return LitePrice_text.getText();
	}
	
	public String getClassicPrice_text() {
		return ClassicPrice_text.getText();
	}
	
	public String getPremiumPrice_text() {
		return PremiumPrice_text.getText();
	}

	//Currency
	public String getLiteCurrency_text() {
		return LiteCurrency_text.getText().substring(0, 3);
	}
	
	public String getClassicCurrency_text() {
		return ClassicCurrency_text.getText().substring(0, 3);
	}
	
	public String getPremiumCurrency_text() {
		return PremiumCurrency_text.getText().substring(0, 3);
	}
	
	
}
