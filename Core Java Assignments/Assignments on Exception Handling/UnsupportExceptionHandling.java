import java.util.Scanner;
public class UnsupportExceptionHandling {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st number: ");
			int a = sc.nextInt();
			System.out.println("Enter 2nd number: ");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("Result: " + c);
			c = sc.nextInt();
		}
		catch(UnsupportedOperationException e) {
			e.printStackTrace();
		}
	}
}

/*
Output:
Enter 1st number: 
5
Enter 2nd number: 
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandlingApplications.main(ExceptionHandlingApplications.java:11)
*/
