
import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class WomanDress {
    WebDriver browser;

    private final String HOME_PAGE = "http://automationpractice.com";
    private final By TITLES = By.xpath(".//ul[contains(@class, 'sf-menu')]/li/a");
    private final By CATEGORY = By.xpath(".//ul[@class = 'tree dynamized']/li/a");
    private final By COLOR_BUTTONS = By.xpath(".//input[@type = 'button']");
    private final By DRESSES = By.xpath(".//div[@class = 'product-container']");
    private final By COLORS = By.xpath("");

    @Test
    public void womanDress() {
        System.setProperty("webdriver.chrome.driver", "/Users/viktorijashilova/Downloads/chromedriver");
        browser = new ChromeDriver();
        browser.manage().window().maximize();

        browser.get(HOME_PAGE);

        List<WebElement> titles = browser.findElements(TITLES);
        for (WebElement we : titles) {
            if (we.getText().equals("WOMEN")) {
                we.click();
                break;
            }
        }

        List<WebElement> categories = browser.findElements(CATEGORY);
        for (WebElement we : categories) {
            if (we.getText().equals("Dresses")) {
                we.click();
                break;
            }
        }

        List<WebElement> buttons = browser.findElements(COLOR_BUTTONS);
        for (WebElement we : buttons) {
            System.out.println(we.getCssValue("background"));
            if (we.getCssValue("background").contains("rgb(243, 156, 17)")) {
                we.click();
                break;
            }
        }



    }
}



