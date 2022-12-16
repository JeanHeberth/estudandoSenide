import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.AssertJUnit.assertEquals;

public class HomePage {

    public HomePage open() {
        Selenide.open("https://practice.automationbro.com/");
        return this;
    }

    public SelenideElement getStaterdBtn() {
        return $(By.id("get-started"));

    }

    public SelenideElement headingTitle() {
        return $("h1");
    }

    public SelenideElement verifyLogoVisible() {
        return $(By.xpath("//a[@class=\"custom-logo-link\"]"));
    }

    public ElementsCollection linkList() {
        return $$("#primary-menu li[id*=menu-item]");
    }

    public void asssertUrl(String expectedUrl) {
        String url = WebDriverRunner.url();
        assertEquals(url, expectedUrl);
    }
    public void asssertTitle(String expectedTitle) {
        String title = title();
        assertEquals(title, expectedTitle);
    }

}
