package utils;

public class StringUtils {
    public static String removeCharacters(String msg, String character) {
        return msg.replaceAll(character,"");
    }
    public static String replaceСharacter(String msg,String oldChar, String newChar){
        return msg.replace(oldChar,newChar);
    }
}