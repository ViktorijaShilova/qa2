package food.pages;

import org.junit.jupiter.api.Test;

public class FoodTest {

    private BaseFunc baseFunc = new BaseFunc();
    private final String HOME_PAGE = "rus.delfi.lv";

    @Test
    public void FoodTest() {
        baseFunc.goToUrl(HOME_PAGE);
        HomePage homePage = new HomePage(baseFunc);
        homePage.CloseCookie();
        FoodPage foodPage = homePage.getItemByName("Еда");
        RecipePage recipePage = foodPage.getRecipe("Острый соус из апельсинов");

    }
}
