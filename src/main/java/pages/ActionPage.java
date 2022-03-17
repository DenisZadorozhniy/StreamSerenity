package pages;

import models.Game;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ScriptUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ActionPage extends PageObject {

    private final String DISCOUNT_PATH = "//div[contains(@id,'TopSellersTable')]//div[contains(@Class,'discount_pct')] ";
    @FindBy(id = "tab_select_TopSellers")
    private WebElement topSellersBtn;
    @FindBy(xpath = DISCOUNT_PATH + "//..//..//div[contains(@class,'tab_item_name')]")
    private List<WebElement> titleGames;
    @FindBy(xpath = DISCOUNT_PATH)
    private List<WebElement> discountGames;
    @FindBy(xpath = DISCOUNT_PATH + "//..//..//div[contains(@class,'discount_final_price')]")
    private List<WebElement> priceGames;
    private List<Game> sortedList;
    private List<Game> gameList = new ArrayList<>();

    public void clickTopSellersBtn() {
        ScriptUtils.getScrolling();
        topSellersBtn.click();
    }

    public String getMostDiscounts() {
        for (int i = 0; i < discountGames.size(); i++) {
            Game game = new Game(titleGames.get(i).getText(), discountGames.get(i).getText(), priceGames.get(i).getText());
            gameList.add(game);
        }
        sortedList = gameList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        return sortedList.get(0).getDiscount();
    }

    public String getPrice() {
        return sortedList.get(0).getPrice();
    }

    public void clickMostDiscountGame() {
        getDriver().findElement(By.xpath("//div[contains(@id,'TopSellersRows')]//div[contains(text(),'" + sortedList.get(0).getDiscount() + "')]")).click();
    }
}