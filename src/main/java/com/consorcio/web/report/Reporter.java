package com.consorcio.web.report;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberGenericAdapter;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Reporter extends ExtentCucumberGenericAdapter {

    public Reporter(String arg) {
        super(arg);
    }

    @Override
    public String getScreenshotBase64() {
        return  ((TakesScreenshot) DriverManager.getDriverInstance()).getScreenshotAs(OutputType.BASE64);
    }

    @Override
    public Boolean isScreenshotDisable() {
        return false;
    }
}
