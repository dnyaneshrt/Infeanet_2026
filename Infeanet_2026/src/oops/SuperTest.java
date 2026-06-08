package oops;
//super cannot be referred from static context
class Super
{
    int number=111;
    public void demo()
    {
        System.out.println("super class demo method");
    }
}

class Sub extends  Super
{
    int number=999;

    public void showInfo()
    {
        System.out.println(number);
        System.out.println(super.number);

//        demo();  this keyword is optional here
    }

    public void demo()
    {
        super.demo();//call parent class demo method
        System.out.println("child class demo method");
    }
}

public class SuperTest {
    public static void main(String[] args) {
        Sub childObject=new Sub();
        childObject.showInfo();
        childObject.demo();
//        super.demo();  //super cannot be referred from static context
    }
}
