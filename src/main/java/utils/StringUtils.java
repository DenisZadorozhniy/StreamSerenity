package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    public static String removeCharacters(String msg, String character) {
        return msg.replaceAll(character, "");
    }

    public static String replaceСharacter(String msg, String oldChar, String newChar) {
        return msg.replace(oldChar, newChar);
    }

    public static String getOnlyNumbers(String str) {
        Matcher matcher = Pattern.compile("\\d{0,4}").matcher(str);
        matcher.find();
        return matcher.group();
    }
}