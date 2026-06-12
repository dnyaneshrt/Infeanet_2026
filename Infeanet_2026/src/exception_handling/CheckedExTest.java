package exception_handling;

//throw and throws

//1. compile-time/checked    2.runtime exception/unchecked
public class CheckedExTest {

    static void main(String[] args) {

        //open a file code..  d:/test.txt

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
