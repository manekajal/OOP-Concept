package Abstraction;

public class Main {
    public static void main(String[] args) {
        Bank b;
        b = new ICICi ();
        System.out.println("ICICi Rate of Interest is: "+b.getInterestRate()+"%");
        b= new HDFC();
        System.out.println("HDFC Rate of Interest is: "+b.getInterestRate()+"%");
    }
}
