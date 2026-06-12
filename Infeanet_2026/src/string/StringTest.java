package string;


//1. what is String ? String is class in java which is used to represent sequence of characters.
//2. String API -> methods
public class StringTest {
    public static void main(String[] args) {

       String name="A String in Java is an object used to store a sequence of characters enclosed in double quotes. It uses UTF-16 encoding and provides methods for handling text data. Each character in a string is stored using 16-bit Unicode (UTF-16) encoding. Strings are immutable, meaning their value cannot be changed after creation. Java provides a rich API for manipulation, comparison, and concatenation of strings.";
       //find total characters in this string.
        System.out.println("total no.of characters available in this string are: "+name.length());
        //find total no. of words.

        String[] words= name.split(" ");
        System.out.println("total no. of words present in this strings are: "+words.length);

        //print total words along with count
        int count=0;
        for(String word: words)
        {
               count++;
               System.out.println(count+"    :   "+word);
        }

        System.out.println("original String: "+name);
        System.out.println("String in Uppercase: "+name.toUpperCase());
        System.out.println("String in Lowercase: "+name.toLowerCase());

        //check whether word "java" is available in my string or not?
        System.out.println("is java word present ?? "+name.contains("java"));
        System.out.println("is Java word present ?? "+name.contains("Java"));
        System.out.println("is Mandar word present?? "+name.contains("Mandar"));

        //in java String java != JAVA
    }
}
