import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class WomanDress {
    WebDriver browser;
    private final String HOME_PAGE = "http://automationpractice.com";
    private final By TITLES = By.xpath(".//a[@class = 'sf-with-ul']");
    private final By WOMEN_PAGE = By.xpath(".//a[@class = 'img']");
    private final By DRESS_PAGE = By.xpath(".//label[@class = 'layered_color']//a");

    @Test
    public void womanDress() {
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE);

        List<WebElement> article = browser.findElements(TITLES);
        WebElement firstTitle = article.get(0);
        String womenTitle = firstTitle.getText();
        firstTitle.click();

        List<WebElement> womenPageArticles = browser.findElements(WOMEN_PAGE);
        WebElement dresses = womenPageArticles.get(1);
        dresses.click();

        List<WebElement> colors = browser.findElements(DRESS_PAGE);
        WebElement orange = colors.get(3);
        orange.click();
    }


}
