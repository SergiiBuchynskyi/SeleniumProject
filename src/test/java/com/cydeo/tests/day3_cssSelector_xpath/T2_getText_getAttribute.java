package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        WebElement RememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String actRememberMeLabel = RememberMeLabel.getText();
        String expResult = "Remember me on this computer";

        System.out.println(args.equals(expResult)? "Passed": "Failed");

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expForgotPasswordLinkText = "Forgot your password?";
        String actForgotPasswordLinkText = forgotPasswordLink.getText();

        System.out.println(actForgotPasswordLinkText.equals(expForgotPasswordLinkText)? "Forgot your password LINK VERIFICATION Pass": "Forgot your password LINK VERIFICATION Failed");
        System.out.println(actForgotPasswordLinkText);
        System.out.println(expForgotPasswordLinkText);


        String expInHref = "forgot_password=yes";
        String actHrefAttributeValue = forgotPasswordLink.getAttribute("href");

        System.out.println("Href of forgot_password check");
        System.out.println(actHrefAttributeValue.contains(expInHref)? "Passed": "Failed");
        System.out.println(actHrefAttributeValue);
        System.out.println(expInHref);

        //driver.quit();

    }

}
