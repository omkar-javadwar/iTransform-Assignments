import java.util.Scanner;
public class ArmstrongNumbersBetweenRange {
   public static void main(String args[]){
      int num1, num2;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number :");
      num1 = sc.nextInt();
      System.out.println("Enter the second number :");
      num2 = sc.nextInt();
      System.out.println("Armstrong numbers falling in the range of " + num1 + " and " + num2 + ":");

      for (int i = num1; i<num2; i++){
         int check, rem, sum = 0;
         check = i;
         while(check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
         }
         if(sum == i){
            System.out.println(i);
         }
      }
   }
}

/*
Output:
Enter the first number::
100
Enter the second number::
999
Armstrong numbers falling in the range of 100 and 999:
153
370
371
407
*/
