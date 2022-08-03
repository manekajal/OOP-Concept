package Inheritance;

public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("hello");
        Calculator calculator=new Calculator();
        int result=calculator.add(12,13);
        int result2=calculator.sub(24,3);
        System.out.println(result);
        System.out.println(result2);

    }
}
