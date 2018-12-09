package food.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FoodPage {
    BaseFunc baseFunc;

    private final By RECIPES = By.xpath(".//h1[contains(@class, 'headline-title')]");

    public FoodPage(BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }

    public RecipePage getRecipe(String name) {
        List<WebElement> recipes = baseFunc.getElements(RECIPES);
        for (WebElement recipe : recipes) {
            if (recipe.findElement(RECIPES).getText().equals(name)) {
                recipe.click();
                return new RecipePage(baseFunc);
            }
        }
        return null;
    }



}
