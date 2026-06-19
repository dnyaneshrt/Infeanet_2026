package java8;

public class Student implements Comparable<Student> {

    private int studentId;
    private String name;
    private double marks;
    private String branch;
    private Address address;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", branch='" + branch + '\'' +
                ", address=" + address +
                '}';
    }

    public Student(int studentId, String name, double marks, String branch, Address address) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
        this.branch = branch;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
