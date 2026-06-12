package exception_handling;


class ChangeNotAvailableException extends  Exception
{

    ChangeNotAvailableException()
    {
        super("Please always keep change...");
    }
}


public class CustomException {

    //hotel people also don't have change..
    public int payBill(int amount) throws Exception{
        if(amount==2000)
        {
                throw new ChangeNotAvailableException();
        }
        int billAmount=560;
        System.out.println("imp code");
        return amount-560;
    }

    public static void main(String[] args) throws Exception {

        int saksham=2000;
        int pranav=2000;

        System.out.println("Welcome to ABC hotel.");
        System.out.println("ordering food...");

        CustomException customException=new CustomException();
        int remainingAmount= customException.payBill(saksham); //he does not have change...
        System.out.println("remaining amount after paying bill :"+remainingAmount);

    }
}
/*
try
catch
finally
throw
throws

create our own Exception....
*/
