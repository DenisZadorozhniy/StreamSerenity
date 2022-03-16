package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.StringUtils;

public class DescriptionGamePage extends PageObject {

    @FindBy(xpath = "//div[contains(@class,'discount_pct')]")
    private WebElement discount;
    @FindBy(xpath = "//div[contains(@class,'discount_final_price')]")
    private WebElement price;
    @FindBy(xpath = "//a[contains(@class,'header_installsteam_btn_content')]")
    private WebElement installSteamBtn;

    public boolean checkPriceAndDiscount(String discountActionPage, String priceActionPage){
        String discountStr  = discount.getText();
        String priceStr  = price.getText();
        Double price  = conversionToDoubleValue(priceStr,"₴");
        Double priceAction  = conversionToDoubleValue(priceActionPage,"₴");

        return discountActionPage.equals(discountStr) && price.equals(priceAction);
    }

    private Double conversionToDoubleValue(String msg, String character) {
        String str = StringUtils.removeCharacters(msg,character);
        if(str.contains(",")){
            String updateStr = StringUtils.replaceСharacter(str,",",".");
            return Double.valueOf(updateStr);
        }
       return Double.valueOf(str);
    }

    public void clickInstallSteamBtn(){
        installSteamBtn.click();
    }
}