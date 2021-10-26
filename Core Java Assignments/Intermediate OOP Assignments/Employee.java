import java.util.Scanner;

class Employee{
 	public void totalSalary() {
	}
}

class Manager extends Employee{
    double incentives, salary, total;
    int n;
    
    public void totalSalary() {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Salary for Manager:");
        salary = sc.nextDouble();
        System.out.println("Enter Incentives:");
        incentives = sc.nextDouble();
        System.out.println("Enter Number of Managers:");
        n = sc.nextInt();
        
        total = salary + incentives;
        
        System.out.println("Total Salary for Manager: " + total);
        System.out.println("Total Salary for all Managers: " + total*n);
	}
}

class Labour extends Employee{
    double overtime, salary, total;
    int n;
    
    public void totalSalary() {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Salary for Labour:");
        salary = sc.nextDouble();
        System.out.println("Enter Overtime:");
        overtime = sc.nextDouble();
        System.out.println("Enter Number of Labours:");
        n = sc.nextInt();
        
        total = salary + overtime;
        
        System.out.println("Total Salary: " + total);
        System.out.println("Total Salary for all Labours: " + total*n);
	}
}

public class Main{
    public static void main(String[] args){
	Manager m = new Manager();
	m.totalSalary();
	Labour l = new Labour();
	l.totalSalary();
	}
}

/*
Output:
Enter Salary for Manager:
1000
Enter Incentives:
10
Enter Number of Managers:
5
Total Salary for Manager: 1010.0
Total Salary for all Managers: 5050.0
Enter Salary for Labour:
500
Enter Overtime:
5
Enter Number of Labours:
10
Total Salary: 550.0
Total Salary for all Labours: 5500.0
*/
