package utils;

import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;

public class ScriptUtils {

    public static JavascriptExecutorFacade js = new JavascriptExecutorFacade();

    public static void getScrolling() {
        js.executeScript("window.scrollBy(0,1000)");
    }
}