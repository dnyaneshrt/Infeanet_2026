package collections;

import java.util.*;

//List is an interface in JCF that stores elements in ordered sequence
//Maintains insertions order.
//Allows duplicate elements.
//Allows indexing.  (0,1,2,3,4.......)
//ArrayList is Dynamic in size.  (can grow/shrink)
public class ListTest {
    public static void main(String[] args) {
//        List students=new List();  not allowed. we cannot create object of interface and abstract class.args

        //int[] students=new int[10]; //array is having fixed size
//        List<String> students=new ArrayList<>(); //upcasting
//        List<String> students=new LinkedList<>(); //upcasting
        List<String> students=new Vector<>();  //since java 1.0.  oldest one.
        //Vector methods are synchronized.  Vector is thread safe where as ArrayList and LinkedList are not thread safe.

        students.add("ronak");
        students.add("Mandar");
        students.add("apurva");
        students.add("Disha");
        students.add("Gauri");
        students.add("kunal");
        students.add("janhavi");
        students.add("Samruddhi");
        students.add("shruti");
        students.add("kunal");
        students.set(5, "kunal-nikam");
        System.out.println(students);
        System.out.println("students with sorting..");

        Collections.sort(students);  //sort
        System.out.println("students after sorting:--------------"+students);

        System.out.println(students.indexOf("apurva"));
        System.out.println("total no. of students: "+students.size());
        System.out.println(students);
        students.remove("Samruddhi");
        System.out.println(students);
        System.out.println(students.get(8));
        students.remove(8);
//        students.add(1345);

        System.out.println(students);
        System.out.println(students.get(3));

        System.out.println(students.contains("shlok")); //false--Returns true if this list contains the specified element.
        System.out.println(students.contains("janhavi")); //true

//        students.clear();
//        System.out.println(students);

        for(int i=0;i<students.size();i++)
        {
            System.out.println(i+":"+students.get(i));
        }


        System.out.println("traverse list using for each loop");
        for(String student:students)
        {
            System.out.println(student);
        }
    }
}

//ArrayList vs LinkedList.
//internal structure:   Dynamic Array- Doubly linked list
//Random Access     :   Fast - Slow
//insert at middle  :   slow -fast
//memory  :   less  --More