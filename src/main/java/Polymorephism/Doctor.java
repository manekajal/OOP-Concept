package Polymorephism;

public class Doctor extends Person{
    @Override
    public void details() {
        System.out.println("doctor details");
    }

    @Override
    public void details(String name) {
        System.out.println("persoan name" +name);
    }

    public static void main(String[] args) {

        Person person=new Doctor();
        person.details();
        Person p = new Person();
        p.details("kajal");

    }
}
