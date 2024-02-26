package CalculatorEx;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(6, 7));

        Cal2 c2 = new Cal2();
        System.out.println(c2.add(6, 7));
        System.out.println(c2.subtract(6, 7));

        Cal3 c3 = new Cal3();
        System.out.println(c3.add(6, 7));
        System.out.println(c3.multiply(6, 7));

        Cal4 c4 = new Cal4();
        System.out.println(c4.add(6, 7));
        System.out.println(c4.multiply(6, 7));
        System.out.println(c4.divide(6, 7));
    }
}