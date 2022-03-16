package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://store.steampowered.com/")
public class MainStreamPage extends PageObject {

    @FindBy(xpath = "//div[contains(@class,'popup_menu_subheader')]//a[contains(@href,'/action/')]")
    private WebElement actionBtn;
    @FindBy(xpath = "//div[contains(@id,'genre_tab')]")
    private WebElement categoryBtn;

    public void openActionPage(){
        categoryBtn.click();
        actionBtn.click();
    }
}