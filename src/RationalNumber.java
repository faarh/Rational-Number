package src;

public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber() {
        numerator = 0;
        denominator = 1;
    }
    public RationalNumber(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }
    public RationalNumber add(RationalNumber r) {
        int newNumerator = (this.numerator * r.denominator) + (r.numerator * this.denominator);
        int newDenominator = this.denominator * r.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }


    public RationalNumber subtract(RationalNumber r) {
        int newNumerator = (this.numerator * r.denominator) - (r.numerator * this.denominator);
        int newDenominator = this.denominator * r.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }
}
