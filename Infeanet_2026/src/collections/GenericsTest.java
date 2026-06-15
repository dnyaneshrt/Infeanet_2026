package collections;


import javax.swing.text.Element;
import java.util.ArrayList;

public class GenericsTest {

    public static void main(String[] args) {

     /*   StringCounsellor counsellor1=new StringCounsellor("c_101");
        StringCounsellor counsellor2=new StringCounsellor("c_102");

        IntCounsellor counsellor3=new IntCounsellor(1001);
        IntCounsellor counsellor4=new IntCounsellor(1002);

        DoubleCounsellor counsellor5=new DoubleCounsellor(10.101);
        DoubleCounsellor counsellor6=new DoubleCounsellor(10.102);*/

        Counsellor<String> counsellor1=new Counsellor<>("C_101");
        Counsellor<String> counsellor2=new Counsellor<>("C_102");
//        Counsellor<String> counsellor5=new Counsellor<>(1003); //not allowed , it provides compile-time type safety

        Counsellor<Integer> counsellor3=new Counsellor<>(1001);
        Counsellor<Double> counsellor4=new Counsellor<>(10.101);

//        Counsellor<Student> counsellor6=new Counsellor<>(new Student(101,"Arya"));
        //Bounded Genrics- someimes we want to restrict the types that can be used with genrics.

        GenericMethodTest.printData(100);
        GenericMethodTest.printData("hello");
    }
}

//class Counsellor<T extends Number>  Bounded generics: we accept only nu,ber type of counsellor Id.
class Counsellor<T>
{
     T counsellorId;

    public Counsellor(T counsellorId) {
        this.counsellorId = counsellorId;
    }
}

class GenericMethodTest
{
    public static <T> void printData(T data)
    {
        System.out.println(data);
    }
}
/*
<T>  --> Type
<E>  --> Element
<K> -->key
<V> --> Value
*/

/*

class StringCounsellor
{
    String counsellorId;

    public StringCounsellor(String counsellorId) {
        this.counsellorId = counsellorId;
    }
}


class IntCounsellor
{
    Integer counsellorId;

    public IntCounsellor(Integer counsellorId) {
        this.counsellorId = counsellorId;
    }
}


class DoubleCounsellor
{
    Double counsellorId;

    public DoubleCounsellor(Double counsellorId) {
        this.counsellorId = counsellorId;
    }
}
*/


