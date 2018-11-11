import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class PracticeShort {
    private final By ARTICLE = By.xpath(".//h3[@class = 'top2012-title']");
    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final By COMMENT_COUNT = By.xpath(".//a[@class = 'comment-count']");
    private final By ARTICLE_PAGE = By.xpath(".//span[@itemprop = 'headline name']");
    private final By COMMENT_PAGE = By.xpath(".//a[@class = 'comment-main-title-link']");
    private final By REG_COMMENTS = By.xpath(".//a[contains(@class,'comment-thread-switcher-list-a-reg')]/span");
    private final By ANON_COMMENTS = By.xpath(".//a[contains(@class,'comment-thread-switcher-list-a-anon')]/span");
    WebDriver driver;

    @Test
    public void delfiPractice() {
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://rus.delfi.lv/");

        List<WebElement> articles = driver.findElements(ARTICLE);
        WebElement article = articles.get(1);

        String articleTitle = driver.findElement(ARTICLE_TITLE).getText();
        Integer count = getComments(COMMENT_COUNT);

        article.click();

        String articlePageTitle = driver.findElement(ARTICLE_PAGE).getText();
        Assertions.assertEquals(articleTitle, articlePageTitle, "Articles not equal");

        Integer articlePageCommentCount = getComments(COMMENT_COUNT);
        Assertions.assertEquals(count, articlePageCommentCount, "Comments in article page not Equal");

        driver.findElement(COMMENT_COUNT).click();

        String commentPageTitle = driver.findElement(COMMENT_PAGE).getText();
        Assertions.assertTrue(commentPageTitle.contains(articleTitle));

        Integer regCommentCount = getComments(REG_COMMENTS);

        Integer anonCommentCount = getComments(ANON_COMMENTS);
        Integer sum = regCommentCount + anonCommentCount;

        Assertions.assertEquals(count, sum, "Comments not equal");
    }

    public Integer getComments(By locator) {
        String toConvert = driver.findElement(locator).getText();
        return Integer.valueOf(toConvert.substring(1, toConvert.length()-1));
    }

    @AfterEach
    public void closeDriver() {
        driver.close();
    }

}
