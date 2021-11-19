import java.util.Scanner;

@FunctionalInterface
interface Operations
{
    int op(int x, int y);
}

public class ArithmeticOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		Operations add = (int x, int y) -> x+y;
		Operations sub = (int x, int y) -> x-y;
		Operations mul = (int x, int y) -> x*y;
		Operations div = (int x, int y) -> x/y;
		
		System.out.println(add.op(a, b));
		System.out.println(sub.op(a, b));
		System.out.println(mul.op(a, b));
		System.out.println(div.op(a, b));
	}
}


/*
Output:
Enter first number:
6
Enter second number:
3
9
3
18
2
*/
