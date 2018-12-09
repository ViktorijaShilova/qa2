package food.pages;

import horoscope.pages.WomanPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    BaseFunc baseFunc;

    private final By COOKIE = By.xpath(".//a[@class = 'close cookie']");
    private final By NAME = By.xpath(".//a[contains(@class, 'nav-link')]");
    private final By HEADER = By.xpath(".//nav[@id = 'quick-site-section-navigation-inner']");

    public HomePage(BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }

    public void CloseCookie() {
        baseFunc.getElement(COOKIE).click();
    }

    public WomanPage getItemByName(String name) {
        List<WebElement> tabs = baseFunc.getElements(HEADER);
        for (WebElement we : tabs) {
            System.out.println(we);
            if (we.findElement(NAME).getText().equals(name)) {
                we.click();
                return new WomanPage(baseFunc);
            }
        }
        return null;
    }
}


