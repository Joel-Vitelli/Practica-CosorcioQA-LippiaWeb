package com.consorcio.web.pages.wikipedia;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class GoogleHomePage extends PageBaseWeb {

    private final String SEARCH_INPUT_LOCATOR_XPATH = "//input[contains(@name,'q')]";
    private final String SEARCH_BUTTON_LOCATOR_CSS = "body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(2) > div.A8SBwf.emcav > div.UUbT9 > div.aajZCb > div.tfB0Bf > center > input.gNO89b";
    private final String SPAN_RESULTADO_CSS = "#rso > div:nth-child(3) > div:nth-child(1) > div.tF2Cxc > div.yuRUbf > a > h3 > span";
    private final String SPAN_RESULTADO_WIKIPEDIA_XPATH = "//h3[@class='LC20lb DKV0Md']/span[contains(text(),'Wikipedia')]";

    public static SoftAssert softAssert = new SoftAssert();

    public GoogleHomePage(RemoteWebDriver driver){
        super(driver);
    }

    public void goToHomePage(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public void setSearchInput(String value){
        completeField(By.xpath(SEARCH_INPUT_LOCATOR_XPATH), value);
    }

    public void clickSearchButton(){
        clickElement(By.cssSelector(SEARCH_BUTTON_LOCATOR_CSS));
    }

    public void verificarResultado(){
        Assert.assertEquals(getElementText(By.cssSelector(SPAN_RESULTADO_CSS)), "Consorcio");
    }

    public void verificarResultadoLista(List<String> listaPalabras){
        for (String palabra: listaPalabras) {
            softAssert.assertTrue(getElementText(By.xpath(SPAN_RESULTADO_WIKIPEDIA_XPATH)).contains(palabra), "La palabra no se encuentra en el titulo");
        }
        softAssert.assertAll();
    }


}
