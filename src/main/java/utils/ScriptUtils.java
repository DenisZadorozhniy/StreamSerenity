package utils;

import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;

public class ScriptUtils {

    public static JavascriptExecutorFacade js;

    public static void getScrolling() {
        js.executeScript("window.scrollBy(0,1000)");
    }
}