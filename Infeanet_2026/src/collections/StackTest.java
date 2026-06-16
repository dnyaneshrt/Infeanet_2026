package collections;

import java.util.Stack;

//stack: LIFO
public class StackTest {
   public static void main(String[] args) {

       Stack<Integer> numbers=new Stack<>();
       numbers.push(100);
       numbers.push(200);
       numbers.push(300);
       numbers.push(400);
       numbers.push(500);

       System.out.println(numbers);

       System.out.println(numbers.peek());//peek will see top item
       System.out.println(numbers);
       System.out.println(numbers.pop());//removes top element
       System.out.println(numbers);
       System.out.println(numbers.empty());
       System.out.println(numbers.isEmpty());


    }
}
