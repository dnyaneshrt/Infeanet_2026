package oops;

// cons name is exactly same as class name
// cons does not have return type
//cons are used to initialize instance variables at the time of object creation
public class ConstructorTest {

    //having more than one cons in single class by having diff arg list or having arg list in diff order is called as cons overloading
    ConstructorTest()
    {
        System.out.println("i am constructor - 0 param");
    }
    ConstructorTest(int param1)
    {
        System.out.println("i am constructor - 1 param: "+param1);
    }
    ConstructorTest(int param1, String param2)
    {
        System.out.println("i am constructor - 2 param: ");
    }
    ConstructorTest(String p1, int p2)
    {
        System.out.println("i am constructor - 2 param in diff order: ");
    }
    public static void main(String[] args) {
        new ConstructorTest(100);
        new ConstructorTest();
        new ConstructorTest(10,"20");
        new ConstructorTest("10",20);

    }
}
