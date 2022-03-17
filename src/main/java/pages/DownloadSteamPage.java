package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.FileUtils;
import utils.LoadFromProperties;

public class DownloadSteamPage extends PageObject {
    @FindBy(xpath = "//div[contains(@id,'about_greeting')]//a[contains(@class,'about_install_steam_link')]")
    private WebElement downloadSteamBtn;

    public String getAttributeDownloadSteamBtn() {
        return downloadSteamBtn.getAttribute("href");
    }

}