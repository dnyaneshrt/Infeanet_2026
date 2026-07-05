package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//key - value pair
//it does not allow duplicate keys,  it overrides data against that key.
public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> students=new HashMap<>();
        students.put(101,"kunal");
        students.put(102,"jay");
        students.put(103,"Snehal");
        students.put(104,"Arti");
        students.put(105,"Ayush");
        students.put(103,"Apurva");

        System.out.println(students);

        System.out.println(students.get(105));

      Set<Map.Entry<Integer, String>> studentSet=students.entrySet();
      for(Map.Entry<Integer, String> s: studentSet)
      {
          System.out.println(s.getKey()+" : "+s.getValue());
      }


    }
}
