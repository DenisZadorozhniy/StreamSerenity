package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://store.steampowered.com/")
public class MainStreamPage extends PageObject {

    @FindBy(xpath = "//div[contains(@class,'popup_menu_subheader')]//a[contains(@href,'/action/')]")
    private WebElementFacade actionBtn;
    @FindBy(xpath = "//div[contains(@id,'genre_tab')]")
    private WebElementFacade categoryBtn;

    public void openActionPage() {
        categoryBtn.click();
        actionBtn.click();
    }
}