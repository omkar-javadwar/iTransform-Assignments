import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StudentScore {

	public static void main(String[] args) throws IOException {
	    
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double[][] students= new double[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Enter subject "+j+" marks: ");
				double marks = Integer.parseInt(reader.readLine());
				students[i][j]=marks;
			}
			System.out.println("Student "+i+" info: "+Arrays.toString(students[i]));
			System.out.println("-----------------------");
		}
		
		System.out.println("-----------------------------------------------------------");
		
		for(int i=0;i<3;i++) {
			double total = students[i][0]+students[i][1]+students[i][2];
			System.out.println("Total Score of Student "+i+": "+total);
			System.out.println("Average Score of Student "+i+": "+(total/3));
			System.out.println("Average Score in subject "+1+": "+(students[i][0]/100));
			System.out.println("Average Score in subject "+2+": "+(students[i][1]/100));
			System.out.println("Average Score in subject "+3+": "+(students[i][2]/100));

			System.out.println("-----------------------");
			
			double total1 = students[0][i]+students[1][i]+students[2][i];
			System.out.println("Total Score of subject "+i+": "+total1);
			System.out.println("Average Score of subject "+i+": "+(total1/3));
			
			System.out.println("-----------------------------------------------------------");

		}
	}
}

/*
Output:
Enter subject 0 marks: 60
Enter subject 1 marks: 60
Enter subject 2 marks: 60
Student 0 info: [60.0, 60.0, 60.0]
-----------------------
Enter subject 0 marks: 10
Enter subject 1 marks: 12
Enter subject 2 marks: 13
Student 1 info: [10.0, 12.0, 13.0]
-----------------------
Enter subject 0 marks: 14
Enter subject 1 marks: 15
Enter subject 2 marks: 16
Student 2 info: [14.0, 15.0, 16.0]
-----------------------
-----------------------------------------------------------
Total Score of Student 0: 180.0
Average Score of Student 0: 60.0
Average Score in subject 1: 0.6
Average Score in subject 2: 0.6
Average Score in subject 3: 0.6
-----------------------
Total Score of subject 0: 84.0
Average Score of subject 0: 28.0
-----------------------------------------------------------
Total Score of Student 1: 35.0
Average Score of Student 1: 11.666666666666666
Average Score in subject 1: 0.1
Average Score in subject 2: 0.12
Average Score in subject 3: 0.13
-----------------------
Total Score of subject 1: 87.0
Average Score of subject 1: 29.0
-----------------------------------------------------------
Total Score of Student 2: 45.0
Average Score of Student 2: 15.0
Average Score in subject 1: 0.14
Average Score in subject 2: 0.15
Average Score in subject 3: 0.16
-----------------------
Total Score of subject 2: 89.0
Average Score of subject 2: 29.666666666666668
-----------------------------------------------------------
*/