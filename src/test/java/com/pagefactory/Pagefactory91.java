package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pagefactory91 {
WebDriver driver;
	
	public Pagefactory91(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Dresses')])[5]")
	private WebElement dressesTab;

	public WebElement getDressesTab() {
		return dressesTab;
	}

	public void setDressesTab(WebElement dressesTab) {
		this.dressesTab = dressesTab;
	}

	
	
}
