package com.cydeo.tests.day3_cssSelector_xpath.HomeWork;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NextBaseCRM {
    WebDriver driver;
    WebElement loginBtn;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void test1() {
        driver.get("https://login1.nextbasecrm.com/");
        WebElement loginField = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));


        loginField.sendKeys("incorrect");
        passwordField.sendKeys("incorrect");
        loginBtn.click();

        String expLoginError = "Incorrect login or password";
        String actLoginError = driver.findElement(By.xpath("//div[@class='errortext']")).getText();

        Assert.assertEquals(expLoginError, actLoginError);
    }

    /*
    TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes
     */

    @Test
    public void test2() {
        driver.navigate().to("https://login1.nextbasecrm.com/");
        WebElement rememberMe = driver.findElement(By.className("login-item-checkbox-label"));
        WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));

        String expRememberMe = "Remember me on this computer";
        String expForgotPasswordText = "Forgot your password";
        String expForgotPasswordLink = "forgot_password=yes";

        Assert.assertEquals(expRememberMe, rememberMe.getText());
        Assert.assertEquals(expForgotPasswordText, forgotPassword.getText());
        Assert.assertTrue(forgotPassword.getAttribute("href").contains(expForgotPasswordLink));

    }

    @Test
    public void test3() {
        driver.navigate().to("https://login1.nextbasecrm.com/");
        loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        String actLoginBtn = loginBtn.getAttribute("value");
        String expLoginBtn = "Log In";
        Assert.assertEquals(actLoginBtn, expLoginBtn);
    }

    public void test4() {
        driver.navigate().to("https://login1.nextbasecrm.com/?forgot_password=yes");

        loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));

        WebElement email = driver.findElement(By.name("USER_EMAIL"));
        email.sendKeys("WrongEmail");
        loginBtn.click();
        String expText = "Login or E-mail not found";
        String actText =  driver.findElement(By.className("errortext")).getText();
        Assert.assertEquals(loginBtn.getAttribute("value"), expText);
    }

}
