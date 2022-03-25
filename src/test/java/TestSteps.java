import io.cucumber.java.eo.Do;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.*;
import utils.ConversionUtils;
import utils.FileUtils;
import utils.LoadFromProperties;

public class TestSteps extends UIInteractions {

    private MainStreamPage mainStreamPage;
    private ActionPage actionPage;
    private DescriptionGamePage gamePage;
    private ValidationPage validationPage;
    private DownloadSteamPage downloadSteamPage;
    private String discountGame;
    private String priceGame;
    private String pathToSteam = LoadFromProperties.getProperties("pathToSteam");

    @Step("Open main steam page")
    public void openSite() {
        mainStreamPage.open();
    }

    @Step("Open action page")
    public void openActionPage() {
        mainStreamPage.openActionPage();
    }

    @Step("Go to the Top Sellers tab")
    public void clickTopSellers() {
        actionPage.clickTopSellersBtn();
    }

    @Step("Search for the maximum discount on the game")
    public void getMostDiscount() {
        discountGame = actionPage.getMostDiscount();
        priceGame = actionPage.getPrice();
        actionPage.clickMostDiscountGame();

    }

    @Step("Check validation page")
    public void checkValidationPage() {
        validationPage.isDisplayValidationPage();
    }

    @Step("Check discount and price")
    public void checkDiscountAndPrice() {
        Double price = gamePage.getPrice();
        String discount = gamePage.getDiscount();
        Assert.assertEquals(discount, discountGame);
        String regaxStr = "\\d{1,4}";
        Assert.assertEquals(price, ConversionUtils.conversionToDoubleValue(priceGame,regaxStr));
    }

    @Step("Click the install button")
    public void clickInstallSteam() {
        gamePage.clickInstallSteamBtn();
    }

    @Step("Download and delete steam")
    public void downloadSteam() {
        String downloadLink = downloadSteamPage.getAttributeDownloadSteamBtn();
        FileUtils.saveFile(downloadLink, pathToSteam);
        Assert.assertTrue("Steam is not download", FileUtils.isDownloadFile(pathToSteam));
    }
}