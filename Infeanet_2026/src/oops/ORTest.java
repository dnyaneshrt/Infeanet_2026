package oops;

 class Parent
{
    boolean isHouse;

    public void totalNetWorth()
    {
        System.out.println(" 50 lakh rupees!!" );
    }
//    final public void marriage()  final methods we cannot override
     public void marriage()
    {
        System.out.println("You have to get marry with girl whose name is PushpaLataDevi ");
    }

}

class Child extends Parent
{
    public void marriage()
    {
        System.out.println("not ready to get married ");
    }
    public void playCricket()
    {
        System.out.println("Child is playing cricket ...");
    }
}


public class ORTest {
    public static void main(String[] args) {
  /*      Child dhiraj=new Child();
        dhiraj.totalNetWorth();
        dhiraj.marriage();*/

//        final int bankBalance=1000;
//        bankBalance=500;   final variable cannot be re-initlised

//        Parent parent=new Parent(); //allowed
//        parent.marriage();

/*        Child child=new Child(); //allowed
        child.marriage();
        child.totalNetWorth();*/

        Parent parent=new Child(); //allowed:  holding child class object into parent class ref is called as upcasting
        parent.marriage();
        parent.totalNetWorth();
//        parent.playCricket(); //not allowed, it's present only in Child class.. not in Parent class.

    }
}
