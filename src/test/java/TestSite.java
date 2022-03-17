import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import utils.FileUtils;
import utils.LoadFromProperties;

@ExtendWith(SerenityJUnit5Extension.class)
public class TestSite {
    @Steps
    private TestSteps testSteps;
    private String pathToSteam = LoadFromProperties.getProperties("pathToSteam");

    @AfterEach
    public void afterTest() {
        FileUtils.deleteFile(pathToSteam);
    }

    @Test
    public void steamSiteTest() {
        testSteps.openSite();
        testSteps.openActionPage();
        testSteps.clickTopSellers();
        testSteps.getMostDiscount();
        testSteps.checkValidationPage();
        testSteps.checkDiscountAndPrice();
        testSteps.clickInstallSteam();
        testSteps.downloadSteam();
    }
}