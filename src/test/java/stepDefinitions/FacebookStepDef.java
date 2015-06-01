package stepDefinitions;

import com.elahi.test.FacebookTestRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Manzur on 5/23/2015.
 */
public class FacebookStepDef {

    AndroidDriver driver= FacebookTestRunner.driver;
    @Given("^I am on facebook homepage$")
    public void i_am_on_facebook_homepage() {

        Assert.assertTrue(driver.findElement(By.id("com.facebook.katana:id/login_fb_logo")).isDisplayed());

    }

    @When("^I enter my valid user name, password$")
    public void i_enter_my_valid_user_name_password()  {
        driver.findElement(By.className("android.widget.EditText")).clear();
        driver.findElement(By.className("android.widget.EditText")).sendKeys("qtppnt@gmail.com");
        driver.findElement(By.id("com.facebook.katana:id/login_password")).click();
        driver.findElement(By.id("com.facebook.katana:id/login_password")).sendKeys("may2015");

    }

    @When("^click on login$")
    public void click_on_login()  {
        driver.findElement(By.id("com.facebook.katana:id/login_login")).click();

    }

    @Then("^I enter into facebook successfully$")
    public void i_enter_into_facebook_successfully()  {
        Assert.assertTrue(driver.findElement(By.name("What's on your mind?")).isDisplayed());


    }


}
