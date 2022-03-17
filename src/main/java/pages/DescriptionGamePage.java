package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConversionUtils;
import utils.StringUtils;

public class DescriptionGamePage extends PageObject {

    @FindBy(xpath = "//div[contains(@class,'discount_pct')]")
    private WebElement discount;
    @FindBy(xpath = "//div[contains(@class,'discount_final_price')]")
    private WebElement price;
    @FindBy(xpath = "//a[contains(@class,'header_installsteam_btn_content')]")
    private WebElement installSteamBtn;

    public Double getPrice() {
        String priceStr = price.getText();
        return ConversionUtils.conversionToDoubleValue(priceStr);
    }

    public String getDiscount() {
        return discount.getText();
    }

    public void clickInstallSteamBtn() {
        installSteamBtn.click();
    }
}