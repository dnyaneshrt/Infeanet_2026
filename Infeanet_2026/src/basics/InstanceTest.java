package basics;


class Student
{
    int rollNo;        //instance variable
    String name;
    double percentage;

    //instance method
    public void displayStudentInfo(int rollNo, String name, double percentage)
    {
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(percentage);

    }

}

public class InstanceTest {

    public static void main(String[] args) {
        Student yash=new Student();  //instance
//        yash.rollNo=101;
//        yash.name="yash";
        yash.displayStudentInfo(101,"yash",95.25);
//        System.out.println(yash.rollNo);
//        System.out.println(yash.name);

        Student ronak=new Student();  //instance
//        ronak.rollNo=102;
//        ronak.name="ronak";
//        ronak.percentage=90.0;
        ronak.displayStudentInfo(102,"ronak",95.26);
//        System.out.println(ronak.rollNo);
//        System.out.println(ronak.name);
//        System.out.println(ronak.percentage);


        Student gayatri=new Student();  //instance
        gayatri.displayStudentInfo(103,"gayatri",95.26);//calling method by passing params
    }
}
