import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class DelfiFirstTest {
    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final String HOME_PAGE = "http://rus.delfi.lv";
    private final String HOME_PAGE_MOBILE = "http://m.rus.delfi.lv";
    private final By MOBILE_ARTICLE_TITLE = By.xpath(".//a[@class = 'md-scrollpos']");
    WebDriver browser;

    @Test
    public void checkFirstArticle() {
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE);

        List<WebElement> articles = browser.findElements(ARTICLE_TITLE);
        List<String> names = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            String articleText = articles.get(i).getText();
            names.add(articleText);
        }

        browser.get(HOME_PAGE_MOBILE);

        List<WebElement> mobile_articles = browser.findElements(MOBILE_ARTICLE_TITLE);
        List<String> mobile_names = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            String mobarticleText = mobile_articles.get(i).getText();
            mobile_names.add(mobarticleText);
        }

        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(names.get(i), mobile_names.get(i), "Article" + i + "not right");
        }
    }

    @AfterEach
    public void closeBrowser() {
        browser.close();
    }
}

