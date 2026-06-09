package exception_handling;

//what is exception?  abnormal termination of program during program execution.

import java.util.Scanner;

//exception handling? to handle this abnormal termination we find an alternative solution/wy is called as exception handling.

//Can we use only try block without catch block or finally block? No
//can we use only catch block without try? No
//can we use try with finally without catch block? Yes
//can we have more than one catch block followed by try block? Yes.  catch block with parent Exception must be at the last.


public class ExceptionTest {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        try {
            System.out.println("enter a number: ");
            int number = scanner.nextInt();

            System.out.println("enter second number:");
            int number2=scanner.nextInt();

            System.out.println("result="+(number/number2));

//            System.out.println("square of given number is: " + number * number);
        }
//        catch (ArithmeticException e) {
//            System.out.println("please enter a valid number");
//        }
        catch (Exception e) {
        e.printStackTrace();
            System.out.println("please enter a valid number------------>>>>"+ e.getMessage());
        }
        finally
        {
            System.out.println("500 lines of imp code");
        }

    }
}
