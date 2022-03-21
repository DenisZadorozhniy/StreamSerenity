package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidationPage extends PageObject {
    @FindBy(xpath = "//div[contains(@class,'agegate_birthday_desc')]")
    private WebElementFacade checkBirthday;
    @FindBy(xpath = "//select[contains(@id,'ageYear')]")
    private WebElementFacade ageBtn;
    @FindBy(xpath = "//option[contains(@value,'" + 2003 + "')]")
    private WebElementFacade ageOption;
    @FindBy(xpath = "//a[contains(@id,'view_product_page_btn')]")
    private WebElementFacade openPageBtn;

    public Boolean isDisplayValidationPage() {
        try {
            if (ageBtn.isDisplayed()) {
                ageBtn.click();
                ageOption.click();
                openPageBtn.click();
            } else {
                openPageBtn.click();
            }
            return checkBirthday.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}