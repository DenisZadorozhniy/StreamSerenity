package utils;

public class ConversionUtils {

    public static Double conversionToDoubleValue(String msg, String character) {
        String str = StringUtils.removeCharacters(msg, character);
        if (str.contains(",")) {
            String updateStr = StringUtils.replaceСharacter(str, ",", ".");
            return Double.valueOf(updateStr);
        }
        return Double.valueOf(str);
    }
}