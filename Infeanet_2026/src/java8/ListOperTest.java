package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListOperTest {

    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();
        students.add(new Student(101,"Arti Gadekar",81.0,"computer", new Address("Pune","MH")));
        students.add(new Student(102,"Aayan Attar",78.0,"IT" ,new Address("Pune","MH")));
        students.add(new Student(103,"Apurva Gurav",81.0,"computer",new Address("Ameerpet","HYD")));
        students.add(new Student(104,"Charan Polekar",78.0,"computer",new Address("Pune","MH")));
        students.add(new Student(105,"Eliza Sayyed",86.0,"IT",new Address("Pune","MH")));
        students.add(new Student(106,"Dhiraj Sonawane",82.49,"computer",new Address("Banglore","KTK")));
        students.add(new Student(107,"Arti Shinde",56.0,"IT",new Address("Pune","MH")));
        students.add(new Student(108,"Abhiraj Kurhade",78.0,"computer",new Address("Pune","MH")));
        students.add(new Student(104,"Charan Polekar",78.0,"computer",new Address("Pune","MH")));

        System.out.println(students);
        System.out.println("tota students are :"+students.size());
        //list all students belong to computer branch.
        System.out.println("below students are there from computer branchs: **********");

        for(Student student: students)
        {
           if(student.getBranch().equals("computer"))
           {
               System.out.println(student);
           }
        }


        System.out.println("below students got less than 80 % marks **********");
        for(Student student: students)
        {
          if(student.getMarks()<80)
              System.out.println(student);
        }

        //find list of students whose name starts with 'A'

        System.out.println("below students names starts with 'A':  **********");
        for(Student student: students)
        {
           if(student.getName().startsWith("A"))
               System.out.println(student);
        }

        //list students belongs to maharashtra
        System.out.println("NON-Maharastrian students:  **********");
        for(Student student: students)
        {
          if(!student.getAddress().getState().equals("MH"))
              System.out.println(student);
        }

        //iterator
        System.out.println("traverse list using iterator");
        Iterator<Student> studentList=students.iterator();
        while(studentList.hasNext())
        {
            System.out.println(studentList.next());
        }

        System.out.println("using java 8 ******");
        students.stream().filter(s->s.getBranch().equals("IT")).forEach(System.out::println);


        Collections.sort(students);  //reason: no instance(s) of type variable(s) T exist so that Student conforms to Comparable<? super T

        Student student=new Student();
        student.setStudentId(110);
        student.setName("Kunal");
        student.setBranch("IT");
        student.setMarks(95);
        student.setAddress(new Address("Pune","MH"));

        System.out.println(student);
    }
}
