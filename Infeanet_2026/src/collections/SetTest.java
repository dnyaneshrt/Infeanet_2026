package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//LinkedHashSet,  HashSet, TreeSet

//Set won't preserve an insertion order.:     HashSet
//Set does not allow duplicate elements
//TreeSet provides soting feature
public class SetTest {
    public static void main(String[] args) {

        Set<Integer> numbers=new TreeSet<>(Collections.reverseOrder());
//        for(int i=0;i<100;i++)
//        {
//            numbers.add(i);
//        }
        numbers.add(25465);
        numbers.add(36576);
        numbers.add(4567);
        numbers.add(57);
        numbers.add(1);
        numbers.add(499);
        numbers.add(5);
        numbers.add(1);


//        numbers.add(null);
//        numbers.add(null);
//        numbers.add(null);

        System.out.println(numbers);

//        aaaaaaaaaaaaabbbbbbbbbbbbbccccccccccccddddddddddddeeeeeefffffff

        Set<Character> chars=new HashSet<>();
        String test="aaaaaaaaaaaaabbbbbbbbbbbbbccccccccccccddddddddddddeeeeeefffffff";
        for(int i=0; i<test.length();i++)
        {
            chars.add(test.charAt(i));;
        }
        System.out.println(chars);
    }

}
