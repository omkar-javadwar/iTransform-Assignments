import java.util.HashSet;

public class Employee {

	int id;
	String name, department;
	double salary;
	
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	void displayDetails() {
		System.out.println(toString());
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		HashSet<Employee> set=new HashSet<Employee>();  
		
		Employee e1 =  new Employee(1, "abc", "support", 1060.50);
		Employee e2 =  new Employee(2, "pqr", "RMG", 1102.72);
		Employee e3 =  new Employee(3, "xyz", "FS", 1260.59);

		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		for(Employee e:set){  
			e.displayDetails();
		}
	}
}

/*
Output:
Employee [id=1, name=abc, department=support, salary=1060.5]
Employee [id=3, name=xyz, department=FS, salary=1260.59]
Employee [id=2, name=pqr, department=RMG, salary=1102.72]
*/
