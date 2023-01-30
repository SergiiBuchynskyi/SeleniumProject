package com.cydeo.tests.day8_properies_config_reader;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_reading_test(){
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"os.user.name\") = " + System.getProperty("os.user.name"));
    }

}
