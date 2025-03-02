package org.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    private final By loginInputLocator = By.id("user-name");
    private final By passwordInputLocator = By.id("password");
    private final By loginButtonLocator = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeLogin(String login){
        WebElement loginInput = driver.findElement(loginInputLocator);
        loginInput.sendKeys(login);
    }
    public void typePassword(String password){
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);
    }

    public void clickLogin(){
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }
}
