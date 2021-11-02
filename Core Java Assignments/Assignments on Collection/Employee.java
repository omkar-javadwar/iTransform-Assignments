
import java.util.*;

class Employee implements Comparable<Employee>{
	private int empid;
	private String empname;
	private String empdept;
	private int empsalary;
	public Employee(int empid, String empname, String empdept, int empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
		this.empsalary = empsalary;
	}
	
	public int getempId() {
		return empid;
	}

	public String getempName() {
		return empname;
	}

	public String getempDept() {
		return empdept;
	}

	public int getempSalary() {
		return empsalary;
	}

	@Override
	public String toString() {
		return "\nEmployee Id=" + empid + ",\nEmployee Name=" + empname + ", "
        		+ "\nEmployee Salary=" + empdept + ","
        				+ "\nEmployee Department=" + empsalary + "\n ";
	}

	@Override
	public int compareTo(Employee e) {
		int ret= this.empid-e.empid;
		if(ret==0) {
			ret= this.empname.compareTo(e.empname);
		}
		if(ret==0)
			ret= this.empdept.compareTo(e.empdept);
		if(ret==0)
			ret= this.empsalary-e.empsalary;
		return ret;
	}
}

class IdComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getempId()-e2.getempId();
	}
	
}

class NameComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		int res= e1.getempName().compareTo(e2.getempName());
		if(res==0)
			res= e1.getempId()-e2.getempId();
		return res;
	}
	
}

class DeptComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		int res= e1.getempDept().compareTo(e2.getempDept());
		if(res==0)
			res= e1.getempId()-e2.getempId();
		return res;
	}
	
}

class SalaryComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		int res= e1.getempSalary()-e2.getempSalary();
		if(res==0)
			res= e1.getempId()-e2.getempId();
		return res;
	}
	
}

public class Main{

	public static void main(String[] args) {
		Set<Employee> employees;
		Scanner sc= new Scanner(System.in);
		System.out.println("a) ID\nb) Name\nc) Department\nd) Salary");
		System.out.println("Enter your choice");
		String c= sc.next();
		
		if(c.compareTo("a")==0)
			employees= new TreeSet<>(new IdComparator());
		else if(c.compareTo("b")==0)
			employees= new TreeSet<>(new NameComparator());
		else if(c.compareTo("c")==0)
			employees= new TreeSet<>(new DeptComparator());
		else if(c.compareTo("d")==0)
			employees= new TreeSet<>(new SalaryComparator());
		else {
			System.out.println("Invalid Option\n");
			employees= new TreeSet<>();
		}
		
		employees.add(new Employee(1, "Raj","IT",45000));
        employees.add(new Employee(4, "Pradeep","Business",56000));
        employees.add(new Employee(3, "Kumar","IT",43000));
        employees.add(new Employee(2, "Chandan","Business",97760));
        employees.add(new Employee(4, "Amitava","IT",78000));
		
		for(Employee e: employees)
			System.out.println(e);
		sc.close();
	}

}

/*
Output:
a) ID
b) Name
c) Department
d) Salary
Enter your choice

Employee Id=4,
Employee Name=Amitava, 
Employee Salary=IT,
Employee Department=78000
 

Employee Id=2,
Employee Name=Chandan, 
Employee Salary=Business,
Employee Department=97760
 

Employee Id=3,
Employee Name=Kumar, 
Employee Salary=IT,
Employee Department=43000
 

Employee Id=4,
Employee Name=Pradeep, 
Employee Salary=Business,
Employee Department=56000
 

Employee Id=1,
Employee Name=Raj, 
Employee Salary=IT,
Employee Department=45000
*/
