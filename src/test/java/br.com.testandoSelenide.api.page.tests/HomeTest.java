package br.com.testandoSelenide.api.page.tests;

import com.codeborne.selenide.Configuration;
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
        Configuration.browser = "chrome"; // or "firefox"
        Configuration.headless = true;
        Selenide.open("https://automationexercise.com/");

    }


    @Test
    public void testExample() {
        $(By.xpath("//h1[contains(text(),'Automation Exercise')]")).shouldHave(text("Automation Exercise"));

    } @Test
    public void testEexample() {
        $(By.xpath("//h1[contains(text(),'Automation Exercise')]")).shouldHave(text("Automation Exercise"));

    } @Test
    public void tesdtExample() {
        $(By.xpath("//h1[contains(text(),'Automation Exercise')]")).shouldHave(text("Automation Exercise"));

    } @Test
    public void testExddample() {
        $(By.xpath("//h1[contains(text(),'Automation Exercise')]")).shouldHave(text("Automation Exercise"));

    } @Test
    public void testEerfxample() {
        $(By.xpath("//h1[contains(text(),'Automation Exercise')]")).shouldHave(text("Automation Exercise"));

    } @Test
    public void tesdftExample() {
        $(By.xpath("//h1[contains(text(),'Automation Exercise')]")).shouldHave(text("Automation Exercise"));

    }

    @Test
    public void testExamples() {
        Assert.assertTrue(true, "Test examddddple passed");
    }
}




