package oops;

public class Test {
// Test()
// {
//     super();
// }

    public static void main(String[] args) {
        EncapsulationTest encapsulationTest=new EncapsulationTest();
//        encapsulationTest.age=-5; cannot access
        encapsulationTest.setAge(45);
        encapsulationTest.setName("saksham");
        if(encapsulationTest.canVote(encapsulationTest.getAge()))
            System.out.println(encapsulationTest.getName()+ " can vote happily: "+encapsulationTest.getAge());
        else
            System.out.println(encapsulationTest.getName()+ " cannot vote.. please go and play.. you are just a kid: invalid age");
    }
}
