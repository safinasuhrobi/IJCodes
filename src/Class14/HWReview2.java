package Class14;

public class HWReview2 {
    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters, numbers and special characters.
         Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */
        String str = "dscvbJKBSB1263!@#$";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("str = " +str);
        System.out.println(str.length());

    }
}
