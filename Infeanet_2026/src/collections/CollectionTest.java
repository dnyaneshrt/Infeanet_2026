package collections;

//Dynamic in size
//ready-made written effieicient alogorithms
//easy search and sorting operations.
//type safety

public class CollectionTest
{
    public static void main(String[] args) {
        Integer number=new Integer(10);
        //auto-boxing : automatically converting primitive value into it's wrapper object

//     internallly  -> Integer no=Integer.valueOf(10); //boxing

        Integer no=100;   //autoboxing..

        //unboxing  : automatically converting a wrapper object into primitive.

        Integer id=200;
        int value=id;    //internally->int value=id.intvalue();  conversion from wrapper object to primitive data type
    }
}
