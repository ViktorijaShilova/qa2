package horoscope.pages;

import food.pages.BaseFunc;
import food.pages.HomePage;
import org.junit.jupiter.api.Test;

    public class HoroscopeTest {

        private BaseFunc baseFunc = new BaseFunc();
        private final String HOME_PAGE = "rus.delfi.lv";

        @Test
        public void HoroscopeTest() {
            baseFunc.goToUrl(HOME_PAGE);
            food.pages.HomePage homePage = new HomePage(baseFunc);
            homePage.CloseCookie();
            WomanPage womanPage = homePage.getItemByName("Woman");
            HoroscopePage horoscopePage = womanPage.getTab("Гороскоп");

        }
    }


