package Class14;

public class HWReview3 {
    public static void main(String[] args) {
        /*
        You have a String a= ”Is it saturday? Is it raining? Do we have a Java Class today?”
       How would you find out how many sentences are in that String?
         */

        String a = "Is it Saturday? Is it raining? Do we have Java class?";
        String[] sentences = a.split("[?]");
        System.out.println(sentences.length);
    }
}
