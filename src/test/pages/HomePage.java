import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public SelenideElement getStaterd() {
        return $(By.id("get-started"));
    }

    public SelenideElement headingTitle() {
        return $("h1");
    }
}
