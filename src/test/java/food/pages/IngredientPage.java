package food.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class IngredientPage {
    BaseFunc baseFunc;

    private final By INGR_RECIPES = By.xpath(".//h1[@class = 'headline-title']");

    public IngredientPage (BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

//     Assertions.assertEquals(names.get(i), mobile_names.get(i), "Article" + i + "not right");

}
