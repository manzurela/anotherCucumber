package com.elahi.test;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.android.AndroidDriver;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Manzur on 5/23/2015.
 */
//this is a sample work and running from Jenkins
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"C:\\Users\\Manzur\\IdeaProjects\\anotherCucumber\\src\\test\\java\\resources\\facebook.feature"},
        glue={"stepDefinitions"})
public class FacebookTestRunner {
  public static AndroidDriver driver;
    @BeforeClass
    public static void setUpEnvironment() throws MalformedURLException {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","4.4.2");
        capabilities.setCapability("deviceName","SM-G386T");
        capabilities.setCapability("appActivity","LoginActivity");
        capabilities.setCapability("appPackage","com.facebook.katana");
         driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }
 @AfterClass
    public static void tearDown() throws InterruptedException {
    Thread.sleep(5000);
     driver.quit();

 }
}
