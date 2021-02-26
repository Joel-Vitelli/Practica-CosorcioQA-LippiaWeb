package com.consorcio.web.pages.wikipedia;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WikipediaHomePage extends PageBaseWeb {

    private final String SEARCH_INPUT_LOCATOR_ID = "searchInput";
    private final String SEARCH_BUTTON_LOCATOR_CSS = "#search-form button[type='submit']";

    public WikipediaHomePage(RemoteWebDriver driver){
        super(driver);
    }

    public void goToHomePage(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public void setSearchInput(String value){
        completeField(By.id(SEARCH_INPUT_LOCATOR_ID), value);
    }

    public void clickSearchButton(){
        clickElement(By.cssSelector(SEARCH_BUTTON_LOCATOR_CSS));
    }

}
