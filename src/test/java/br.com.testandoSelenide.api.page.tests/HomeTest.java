package br.com.testandoSelenide.api.page.tests;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class HomeTest {


    @BeforeMethod
    public void setup() {
        Selenide.open("https://automationexercise.com/");
    }


    @Test
    public void testExample() {
        $(By.xpath("//h1[contains(text(),'Automation Exercise')]")).shouldHave(text("Automation Exercise"));

    }

    @Test
    public void testExamples() {
        Assert.assertTrue(true, "Test examddddple passed");
    }
}




