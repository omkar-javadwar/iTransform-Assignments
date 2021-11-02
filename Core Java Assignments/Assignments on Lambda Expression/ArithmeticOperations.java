@FunctionalInterface
interface Arithmetic {

    int operation(int n1, int n2);

}

public class ArithmeticOperations {
	public static void main(String[] args) {
        Arithmetic addition = (int n1, int n2) -> n1 + n2;
        Arithmetic subtraction = (int n1, int n2) -> n1 - n2;
        Arithmetic multiplication = (int n1, int n2) -> n1 * n2;
        Arithmetic division = (int n1, int n2) -> n1 / n2;

        System.out.println("Addition of 10 and 5: " + addition.operation(10, 5));
        System.out.println("Subtraction of 10 and 5: " + subtraction.operation(10, 5));
        System.out.println("Multiplication of 10 and 5: " + multiplication.operation(10, 5));
        System.out.println("Division of 10 and 5: " + division.operation(10, 5));
	}
}
