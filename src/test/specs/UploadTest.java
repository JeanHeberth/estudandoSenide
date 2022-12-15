import com.codeborne.selenide.conditions.Text;
import io.netty.buffer.ByteBuf;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class UploadTest {
    @Test
    public void testUploadVisibleInput() {
        open("https://the-internet.herokuapp.com/upload");

        $("#file-upload")
                .uploadFile(new File("src/test/data/teste.pdf"));


        $("#file-submit")
                .click();

        $("h3")
                .shouldHave(text("File Uploaded!"));

    }

    @Test
    public void testUploadFileOnHiddenInput() {
        open("https://practice.automationbro.com/cart");

        // Executando js code para liberar o click no botão
        executeJavaScript("document.getElementById(\"upfile_1\").classList.remove(\"file_input_hidden\")");

        $("#upfile_1")
                .uploadFile(new File("src/test/data/teste.pdf"));

        $("#upload_1")
                .click();


        $("#wfu_messageblock_header_1_label_1")
                .shouldHave(text("uploaded successfully"));


    }
}
