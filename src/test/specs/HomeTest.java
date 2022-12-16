import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class HomeTest {

    HomePage homePage = new HomePage();

    @Test
    public void testPagerUrlAndTitle() {
        // Open page url
        homePage
                .open()
                .asssertUrl("https://practice.automationbro.com/");
        homePage
                .asssertTitle("Practice E-Commerce Site – Automation Bro");



        // Assert the title matches
        //String title = title();
       //Assert.assertEquals(title,"Practice E-Commerce Site – Automation Bro");

    }

    @Test
    public void testInteragitComBotaoGetStarted() {
        open("https://practice.automationbro.com/");

        // By ID
        homePage.getStaterdBtn()
                .click();

        // Verificar se contém a url
        String url = WebDriverRunner.url();
        assertTrue(url.contains("get-started"));

        // Verify heading by cssSelector
        homePage.headingTitle()
                .shouldHave(text("Think different. Make different."));

        // Xpath
        homePage.verifyLogoVisible()
                .shouldHave(visible);
    }

    @Test
    public void testMultipleElements() {
        open("https://practice.automationbro.com/");

        List<String> expectedLink = List.of("Home", "About", "Shop", "Blog", "Contact", "My account");

        ElementsCollection linkLists = homePage.linkList();

        //$$("#primary-menu li[id*=menu-item]");

        //List<String> linksListsText = linkLists.texts();

        // Assertion
        homePage.linkList()
                .shouldHave(CollectionCondition.texts(expectedLink));
        //assertEquals(linksListsText, expectedLink);
    }

    @Test
    public void testFormFields() {
        open("https://practice.automationbro.com/");


        // fill in all the fields

        // CLick support form
        $(By.id("menu-item-697"))
                .click();


        // Name
        $(".support-name input")
                .val("Jean Heberth Souza Vieira");

        //Email
        $(".support-email input")
                .val("teste@gmail.com");

        //Subject
        $(".support-subject input")
                .val("Coloca teste ai e vamos embora");


        //SelectBox
        $(".support-dropdown select")
                .selectOption("Technical Team");


        //CheckBox

        $(".support-checkboxes ul li:nth-child(3) input")
                .click();

        //Date
        $(".support-date input")
                .click();

        //Message

        // click the submit button
        $("button[type=submit]")
                .click();


        // verify the submit message
        $("div[role=alert]")
                .shouldHave(Condition.text("Thanks for contacting us! We will be in touch with you shortly."));


    }
}
