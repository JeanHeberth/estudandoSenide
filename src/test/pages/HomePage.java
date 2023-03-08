import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class HomePage {

    public HomePage open() {
        Selenide.open("https://practice.automationbro.com/");
        return this;
    }

    public SelenideElement getStaterdBtn() {
        return $(By.id("get-started"));
    }

    public SelenideElement getBtnSupportForm() {
        return $(By.id("menu-item-697"));
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

    public void asssertUrlMensage(String messages) {
        String urlMessage = WebDriverRunner.url();
        assertTrue(urlMessage.contains(urlMessage));
    }

    public SelenideElement inputSupportName(String inputName) {
        return $(".support-name input")
                .val(inputName);
    }

    public SelenideElement inputSupportEmail(String inputEmail) {
        return $(".support-email input")
                .val(inputEmail);
    }

    public SelenideElement inputSupportSubject(String inputSubject) {
        return $(".support-subject input")
                .val(inputSubject);
    }

    public void selectDropDown(String selectDropDown) {
        $(".support-dropdown select").selectOption(selectDropDown);
    }

    public SelenideElement selectCheckinBox() {
        return $(".support-checkboxes ul li:nth-child(3) input");
    }

    public SelenideElement getDateBtn() {
        return $(".support-date input");
    }

    public SelenideElement getDateSelect() {
        return $(".flatpickr-day.nextMonthDay");
    }
    public SelenideElement getSubmintSelect() {
        return $("button[type=submit]");
    }


}
