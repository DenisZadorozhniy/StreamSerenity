package utils;

import net.serenitybdd.core.exceptions.SerenityManagedException;
import org.openqa.selenium.InvalidArgumentException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    public static String getData(String str,String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            return matcher.group();
        } else {
            throw new SerenityManagedException(new InvalidArgumentException(String.format("String '%s' doesn't contain numbers", str)));
        }
    }
}