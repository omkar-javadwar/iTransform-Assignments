import java.util.*;

public class IncomeTax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter CTC: ");
		int ctc = sc.nextInt();

		if(ctc<=180000)
			System.out.println("CTC: "+ctc+" tax amount: NIL");
		else if(ctc>181000 && ctc <=300000){
			double tax = ctc * 0.1;
			System.out.println("CTC: "+ctc+" tax amount: "+tax);
		}
		else if(ctc>300001 && ctc <=500000){
			double tax = ctc * 0.2;
			System.out.println("CTC: "+ctc+" tax amount: "+tax);
		}
		else if(ctc>500001 && ctc <=1000000){
			double tax = ctc * 0.3;
			System.out.println("CTC: "+ctc+" tax amount: "+tax);
		}
	}
}

/*
Output:
Enter CTC: 510000   
CTC: 510000 tax amount: 153000.0
*/
