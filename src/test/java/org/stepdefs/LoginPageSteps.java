package org.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.login.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPageSteps {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setup(){
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
    @Given("Open site app")
    public void open_site_app() {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);

    }
    @Given("Login and Password")
    public void login_and_password() {
        loginPage.typeLogin("standard_user");
        loginPage.typePassword("secret_sauce");
    }

    @When("Click Login")
    public void click_login() {
        loginPage.clickLogin();

    }

    @Then("User is login to application")
    public void user_is_login_to_application() {
        Assert.assertTrue(driver.findElement(By.id("shopping_cart_container")).isDisplayed());

    }

    @Given("Login {string} and Password {string}")
    public void login_and_password(String login, String password) {
        loginPage.typeLogin(login);
        loginPage.typePassword(password);
    }

    @Then("User got error message")
    public void suser_got_error_message() {
        Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", driver.findElement(By.xpath("//h3[@data-test=\"error\"]")).getText());
    }
}
