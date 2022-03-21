package utils;

public class ConversionUtils {

    public static Double conversionToDoubleValue(String msg,String regex) {
        String str = StringUtils.getOnlyNumbers(msg,regex);
        return Double.valueOf(str);
    }
}