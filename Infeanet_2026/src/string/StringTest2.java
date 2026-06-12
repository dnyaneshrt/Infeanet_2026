package string;

public class StringTest2 {
    public static void main(String[] args) {

        //1. create a string.  by using string literal.
        //2. by using new keyword
        String s1="Akshata";
        String s2="Akshata";

        String s3=new String("Akshata");
        String s4=new String("akshata");

        //comparing string with == opeartor is not recommended.
        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
        System.out.println(s3==s4); //false

        System.out.println(s3.equals(s4)); //equals method compares string content. with case
        System.out.println(s3.equalsIgnoreCase(s4));// ignore case and compares and String content


        String s5="Pranav";
        System.out.println(s5.indexOf('r'));//pass char and it will return the index number
        System.out.println(s5.indexOf('a'));
        System.out.println(s5.replace('a','*'));
        System.out.println(s5.charAt(3)); //pass index it will return char

        String s6="";
        System.out.println(s6.isBlank());
        System.out.println(s6.isEmpty());


    }
}
