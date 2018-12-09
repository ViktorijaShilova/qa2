package horoscope.pages;

import food.pages.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomanPage {
    BaseFunc baseFunc;

    private final By TABS = By.xpath(".//h1[contains(@class, 'headline-title')]");

    public WomanPage(BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }

    public HoroscopePage getTab(String name) {
        List<WebElement> tabs = baseFunc.getElements(TABS);
        for (WebElement tab : tabs) {
            if (tab.findElement(TABS).getText().equals(name)) {
                tab.click();
                return new HoroscopePage(baseFunc);
            }
        }
        return null;
    }



}
