package com.cydeo.tests.day8_properies_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {
        //create Prop obj
        Properties properties = new Properties();

        //Open file
        FileInputStream file = new FileInputStream("configuration.properties");

        //Load the prop obj
        properties.load(file);

        //Use properties obj to read value
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

    }

}
