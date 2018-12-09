package horoscope.pages;

import food.pages.BaseFunc;
import org.openqa.selenium.By;

public class HoroscopePage {
    BaseFunc baseFunc;

    public HoroscopePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    private final By SIGNS = By.xpath(".//div[@class = 'hrsc-list-title']");
}
