package com.cydeo.tests.day6_WindowHandling;

import com.cydeo.tests.Base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_Login extends TestBase {


    @Test
    public void crmLoginTest_1() {
        driver.get("https://login1.nextbasecrm.com");

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

        BrowserUtils.verifyTitle(driver, "My tasks");


    }

    @Test
    public void crmLoginTest_2() {
        driver.get("https://login1.nextbasecrm.com");

        CRM_Utilities.crm_login(driver);

        BrowserUtils.verifyTitle(driver, "My tasks");
    }
 @Test
    public void crmLoginTest_3() {
        driver.get("https://login1.nextbasecrm.com");

        CRM_Utilities.crm_login(driver, "helpdesk1@cybertekschool.com", "UserUser");

        BrowserUtils.verifyTitle(driver, "My tasks");

    }



}
