package utils;

public class ConversionUtils {

    public static Double conversionToDoubleValue(String msg) {
        String str = StringUtils.getOnlyNumbers(msg);
        if (str.contains(",")) {
            String updateStr = StringUtils.replaceСharacter(str, ",", ".");
            return Double.valueOf(updateStr);
        }
        return Double.valueOf(str);
    }
}