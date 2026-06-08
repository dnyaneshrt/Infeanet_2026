package oops;

public class ThisTest {
    int number=100; //instance variable

    //this: refers a current class Object
    public void display(int number)
    {
        number=number;
        System.out.println(number); //999 or 100

//        int number=500; //local variable
//        System.out.println(number);//500
//        System.out.println(this.number);//100
    }

    public static void main(String[] args) {
        ThisTest thisTest=new ThisTest();
        thisTest.display(999);

    }
}
