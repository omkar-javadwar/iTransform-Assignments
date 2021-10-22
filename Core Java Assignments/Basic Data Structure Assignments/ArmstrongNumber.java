import java.util.*;  

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.println("Enter a number: ");  
        int number = sc.nextInt();
        int temp, remainder, result = 0;

        temp = number;

        while (temp != 0)
        {
            remainder = temp % 10;
            result += Math.pow(remainder,3);
            temp /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number");
        else
            System.out.println(number + " is not an Armstrong number");
    }
}

/*
Output:
Enter a number: 153
153 is an Armstrong number
*/