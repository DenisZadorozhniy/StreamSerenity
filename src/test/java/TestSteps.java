import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.*;

public class TestSteps extends UIInteractions {

    private MainStreamPage mainStreamPage;
    private ActionPage actionPage;
    private DescriptionGamePage gamePage;
    private ValidationPage validationPage;
    private DownloadSteamPage downloadSteamPage;
    private String discountGame;
    private String priceGame;

    @Step("Open main steam page and open action page")
    public void openActionPage() {
        mainStreamPage.open();
        mainStreamPage.openActionPage();
    }

    @Step("Go to the Top Sellers tab")
    public void clickTopSellers(){
        actionPage.clickTopSellersBtn();
    }

    @Step("Search for the maximum discount on the game")
    public void getMostDiscount(){
        discountGame = actionPage.getMostDiscounts();
        priceGame = actionPage.getPrice();
        actionPage.clickMostDiscountGame();
        validationPage.checkValidationPageIsDisplay();
    }

    @Step("Check discount and price")
    public void checkDiscountAndPrice(){
        boolean checkPriceAndDiscount = gamePage.checkPriceAndDiscount(discountGame, priceGame);
        Assert.assertTrue("Value is not the same",checkPriceAndDiscount);
    }

    @Step("Click the install button")
    public void clickInstallSteam(){
        gamePage.clickInstallSteamBtn();
    }

    @Step("Download and delete steam")
    public void downloadSteam(){
        Assert.assertTrue("Steam is not download",downloadSteamPage.checkDownloadFile());
        downloadSteamPage.deleteSteam();
    }
}