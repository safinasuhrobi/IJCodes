package Class14;

public class StringBufferVsBuilder {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Today is java class"); // mostly used class, newer, better and faster
        StringBuffer stringBuffer = new StringBuffer("Today is java class"); // older, slower, and not used mostly

        String str = "Java is very interesting";
        /*
        If we want to convert the String to a StringBuilder we can use the below syntax
         */
        StringBuilder stringBuilder1 = new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);
        /*
        If we want to convert from a StringBuilder to a String we can use the below syntax
         */
        String newStr = stringBuilder1.toString();
    }
}
