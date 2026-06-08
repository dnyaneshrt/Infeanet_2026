package oops;

//we can never create an Object of interface..
//interface is also called as SRS.  software requirement specification.  when interface is functionalInterface then only we can use landa.

//functional interface: interface with Only one abstract method is called as functional interface.

import java.io.Serializable;
import java.util.function.Function;

//to use lamda expression we must ise functional interface. SAM
@FunctionalInterface
interface Bank
{
    //constant, private methods, static methods, default methods
   void provideLoanInformation();  //abstract method
//    upto java 8 interface allowed only abstract methods. bydefault those methods are public abstract
}

//abstraction: expose required details, hide unneccseory details.
class AxisBank implements Bank
{
    @Override
    public void provideLoanInformation() {
        System.out.println("Axis bank provides car loan at 9.2% ROI PA");
    }
}


class SBIBank implements Bank
{
    @Override
    public void provideLoanInformation() {
        System.out.println("SBI bank provides car loan at 8.2% ROI PA");
    }
}


class PnbBank implements Bank
{
    @Override
    public void provideLoanInformation() {
        System.out.println("Pnb bank provides car loan at 7.2% ROI PA");
    }
}


class ICICI implements Bank
{
    @Override
    public void provideLoanInformation() {
        System.out.println("ICICI bank provides car loan at 10.2% ROI PA");
    }
}

public class InterfaceTest {

    public void applyForCarLoan(Bank bank)
    {
        bank.provideLoanInformation();
    }

    public static void main(String[] args) {

//        InterfaceTest akshata=new InterfaceTest();
//        akshata.applyForCarLoan(new ICICI());

        InterfaceTest arti=new InterfaceTest();
        arti.applyForCarLoan(new Bank()
        {

            @Override
            public void provideLoanInformation() {
                System.out.println("Maharashtra bank provides car loan at 8.92% ROI PA ");
            }
        });

        //java 8 lamda expression: annoymous function
        arti.applyForCarLoan(()-> {
                System.out.println("Sriram finance provides car loan at 13% ROI");
        });

    }
}

//annonymous inner class: the class which does name is called as Annonymous inner class.

//lamda expression
//functional interface


//marker interface: empty interface
