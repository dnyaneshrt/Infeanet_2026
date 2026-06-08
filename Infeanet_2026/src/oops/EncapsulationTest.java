package oops;

//it is mechanism of data hiding(by making variables private) and providing User interfaces/controlled methods to access that data from other classes
public class EncapsulationTest {

    private int age;
    private String name;

    //controlled methods means getters and setters

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18||age>100)
            System.out.println("please enter valid age . valid age range: 18 to 100");
        else
             this.age = age;
    }
    //if a person whose age is greater than 18 , then only he can vote
    public boolean canVote(int age)
    {
        if(age>=18)
            return true;
        else
            return false;

    }


}
