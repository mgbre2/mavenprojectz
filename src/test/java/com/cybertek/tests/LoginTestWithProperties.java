package com.cybertek.tests;

import com.cybertek.tests.Project.HomePage;
import com.cybertek.tests.Project.TestBase;
import com.cybertek.utilities.configurationReader;
import org.testng.annotations.Test;

public class LoginTestWithProperties extends TestBase {




    @Test
    public void readPropertyTest(){
        driver.get(configurationReader.getProperty("url"));

        HomePage homePage = new HomePage();

        String username = configurationReader.getProperty("username");
        String password = configurationReader.getProperty("password");
       // homePage.login(username, password);



    }

    private class ConfigurationReader {
    }
}
