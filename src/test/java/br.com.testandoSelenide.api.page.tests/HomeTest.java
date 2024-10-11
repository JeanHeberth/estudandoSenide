package br.com.testandoSelenide.api.page.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomeTest {


    @BeforeMethod
    public void setup() {
        Configuration.headless = true;
        Selenide.open("https://automationexercise.com/");
    }

    @Test
    public void testExamples() {
        Assert.assertTrue(true, "Test examddddple passed");
    }
}




