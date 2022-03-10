package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SearchIfCodeForJUnit5ExistAtSoftAssertPageOnSelenideGithub {
    @Test

    void SearchIfCodeForJUnit5Exist() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();

        // кликаем по кнопке "показать еще 2 страницы, чтобы раскрыть весь список"
        $("#wiki-pages-box").find(withText("Show 2 more")).click();
        // проверяем есть ли СофтАссершн в страницах
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        // переходим на неё
        $("#wiki-pages-box").$(withText("SoftAssertions")).click();
        // проверяем текст Джунита5
        //$$("ol li").filterBy(text("Using JUnit5 extend test class:") - просто находит - ничего не проверяет;
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));

    }
}
