public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 2);

        // Addition
        ComplexNumber sum = num1.add(num2);
        System.out.println("Sum: " + sum.real + " + " + sum.imag + "i");

        // Multiplication
        ComplexNumber product = num1.multiply(num2);
        System.out.println("Product: " + product.real + " + " + product.imag + "i");

        // Division
        ComplexNumber quotient = num1.divide(num2);
        System.out.println("Quotient: " + quotient.real + " + " + quotient.imag + "i");
    }
}