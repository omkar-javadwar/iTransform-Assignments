import java.util.Scanner;
public class ExceptionHandlingApplications {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		try {
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

/*
Output:
Enter 1st number: 
10
Enter 2nd number: 
0
java.lang.ArithmeticException: / by zero
*/
