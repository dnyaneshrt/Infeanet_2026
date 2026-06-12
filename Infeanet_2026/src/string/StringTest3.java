package string;

import java.util.Scanner;

//write a method which will take string in input and returns a reverse of that string
public class StringTest3 {
//ABC
    public String reverseString(String name)
    {
        String revString="";
        for(int i=name.length()-1;i>=0;i--)
        {
            revString=revString+name.charAt(i);
        }
        return revString;
    }
    public static void main(String[] args) {

        System.out.println("please enter a name:");
        String name=new Scanner(System.in).next();

        System.out.println("name before reversing: "+name);

        StringTest3 stringTest3=new StringTest3();
        String[] words= name.split(" ");

        String revString= stringTest3.reverseString(name); //passing name for reversing

        System.out.println("name after reversing: "+revString);

    }
}
