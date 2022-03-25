package utils;

public class ConversionUtils {

    public static Double conversionToDoubleValue(String msg,String regex) {
        String str = StringUtils.getData(msg,regex);
        return Double.valueOf(str);
    }
}