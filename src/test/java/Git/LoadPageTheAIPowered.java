package Git;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class LoadPageTheAIPowered {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void findPageTheAIpowered(){
        open("https://github.com/");
        $(".HeaderMenu-nav").$(byText("Solutions")).click();
        sleep(5000);
    }
}
