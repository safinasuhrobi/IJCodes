package Class14;

public class HWReview {
    public static void main(String[] args) {
        /*
        1.Create a String that will hold a sentence.
        Write a program to get a new String
        without any spaces.
         */
        String str = "we love Java";
        str = str.replaceAll(" ", "");
        System.out.println("str = " + str);
    }
}
