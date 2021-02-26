package com.consorcio.web.pages.wikipedia;

import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WikipediaResultsPage extends PageBaseWeb {

    private final String TITLE_LABEL_LOCATOR_ID = "firstHeading";

    public WikipediaResultsPage(RemoteWebDriver driver){
        super(driver);
    }

    public String getResultTitle() {
        return getElementText(By.id(TITLE_LABEL_LOCATOR_ID));
    }
}
