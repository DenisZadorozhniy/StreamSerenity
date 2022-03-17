import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class TestSite extends BaseTest {
    @Steps
    private TestSteps testSteps;

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