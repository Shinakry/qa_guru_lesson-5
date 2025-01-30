package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class LoadPageTheAIPowered {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void findPageThePoweredTest(){
        open("https://github.com/");
        $(".HeaderMenu-nav").$(byText("Solutions")).hover();
        $(".HeaderMenu-nav").$(byTagAndText("a","Enterprises")).click();
        $("#hero-section-brand-heading").shouldBe(visible).shouldHave(text("The AI-powered"));
        sleep(5000);
    }
}
