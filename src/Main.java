package src;

public class Main {
    public static void main(String[] args) {
        RationalNumber num1 = new RationalNumber(1, 2);
        RationalNumber num2 = new RationalNumber(3, 4);

        // Addition
        RationalNumber add = num1.add(num2);
        System.out.print("Sum: ");
        add.print();

        // Subtraction
        RationalNumber subtract = num1.subtract(num2);
        System.out.print("Difference: ");
        subtract.print();
    }
}
