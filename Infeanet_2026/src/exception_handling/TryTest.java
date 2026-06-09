package exception_handling;

public class TryTest {
    public String getName()
    {
        String name = "Dhanraj";
        try {
            System.out.println("1 name ="+name); //
            return name;
        }finally
        {
            System.out.println("2 name ="+name);
        }
    }

    public static void main(String[] args) {
        System.out.println("3 name ="+new TryTest().getName());
    }
}
