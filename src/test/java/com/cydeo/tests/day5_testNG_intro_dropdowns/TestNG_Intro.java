package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {

    @Test(priority = 2)
    public void test1() {
        System.out.println("Test1 is running");
        //Assert equals
        String act = "Test";
        String exp = "Test";

        Assert.assertEquals(act, exp);
    }

    @Test(priority = 1)
    public void test2() {
        System.out.println("Test2 is running");
        String act = "Test";
        String exp = "Test";

        Assert.assertTrue(act.equals(exp));
    }

    @BeforeClass
    public void setUpClass() {
        System.out.println("---->>>Before class is running");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("---->>>Before method is running");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("---->>>After method is running");
    }

}