package oops;

import basics.Hello;

public class MethodTest {

    //instance method
    public void callMadam()
    {
        System.out.println("calling madam... 1000 lines of code");
    }

    public static void testStaticMethod()
    {
        System.out.println("i am static method");
    }


   public static void main(String[] args) {
       MethodTest methodTest=new MethodTest();
       methodTest.callMadam();
       methodTest.callMadam();



       testStaticMethod(); //static method calling

       Hello.helloStaticMethod();

    }
}
