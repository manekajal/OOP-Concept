package Encapsulation;

public class Main
{
    public static void main(String[] args) {
        Student student=new Student();
        student.setRollno(1);
        student.setName("kajal");
        System.out.println(student.getRollno());
        System.out.println(student.getName());

    }
}
