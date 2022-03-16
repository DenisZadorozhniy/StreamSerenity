package utils;

import net.serenitybdd.core.Serenity;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScriptUtils {
    public static WebDriver driver = Serenity.getDriver();
    public static JavascriptExecutor js = (JavascriptExecutor) driver;


    public static void getScrolling() {
        js.executeScript("window.scrollBy(0,1000)");
    }
}