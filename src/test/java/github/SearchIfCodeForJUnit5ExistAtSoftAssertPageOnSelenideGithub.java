package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchIfCodeForJUnit5ExistAtSoftAssertPageOnSelenideGithub {
    @Test

    void SearchIfCodeForJUnit5Exist() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();

        // кликаем по кнопке "показать еще 2 страницы, чтобы раскрыть весь список"
        //$("button.f6").click();
        // более "читаемый вариант", что за кнопку мы нажимаем
        $("div.js-wiki-sidebar-toggle-display li.Box-row.wiki-more-pages-link button.f6").click();
        // проверяем есть ли СофтАссершн в страницах
        $("li.Box-row.wiki-more-pages.px-2.py-2").sibling(0).$("a").shouldHave(text("SoftAssertions"));
        // переходим на неё
        $("li.Box-row.wiki-more-pages.px-2.py-2").sibling(0).$("a").click();
        // проверяем текст Джунита5
        //$$("ol li").filterBy(text("Using JUnit5 extend test class:"));
        $("ol").sibling(1).shouldHave(text("Using JUnit5 extend test class:"));


        sleep(5000);
    }
}
