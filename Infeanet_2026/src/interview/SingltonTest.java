package interview;
//Singlton design pattern: -it is class that allows only one object to create thought the application lifetime to provide global access point to that object

//Database connection pool.
//security Manager
//logger..
//Cache Manager
//multiple objects --waste of memory and could lead to inconsistent behaviour as well.

/*1. need to create private constructor  :-
2. create one static instance variable
3. create static method which will return an instanceof same class.*/
class SecurityConfig
{
//    public static SecurityConfig instanceVariable=new SecurityConfig();  unnecc 1 obj gets created.
    public static SecurityConfig instanceVariable;   //good approach

    private SecurityConfig()
    {

    }
    public static SecurityConfig getInstance()
    {
        if(instanceVariable==null)
            instanceVariable=new SecurityConfig(); //this line will be called once and object will be created only once.

        return instanceVariable;
    }
}

public class SingltonTest {

    public static void main(String[] args) {


        SecurityConfig securityConfig1=SecurityConfig.getInstance();
        SecurityConfig securityConfig2=SecurityConfig.getInstance();
        SecurityConfig securityConfig3=SecurityConfig.getInstance();
        SecurityConfig securityConfig4=SecurityConfig.getInstance();

        System.out.println(securityConfig1);
        System.out.println(securityConfig2);
        System.out.println(securityConfig3);
        System.out.println(securityConfig4);

    /*    SecurityConfig securityConfig1=new SecurityConfig();  //object 1
        SecurityConfig securityConfig2=new SecurityConfig();  //object 2
        SecurityConfig securityConfig3=new SecurityConfig();  //object 3
        SecurityConfig securityConfig4=new SecurityConfig();  //object 4

        System.out.println(securityConfig1);
        System.out.println(securityConfig2);
        System.out.println(securityConfig3);
        System.out.println(securityConfig4);
*/

     /*   interview.SecurityConfig@8efb846
        interview.SecurityConfig@2a84aee7
        interview.SecurityConfig@a09ee92
        interview.SecurityConfig@30f39991*/

    }
}
