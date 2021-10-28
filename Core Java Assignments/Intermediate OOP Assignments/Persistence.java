import java.util.Scanner;
class FilePersistence extends Persistence{

	@Override
	void persist() {
		System.out.println("File Persisted...");
	}
	
}

class DatabasePersistence extends Persistence{

	@Override
	void persist() {
		System.out.println("Database Persisted...");
	}
	
}

abstract public class Persistence {
	abstract void persist();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select data should be stored in file or database:");
		String str = sc.nextLine();
		
		FilePersistence fp = new FilePersistence();
		DatabasePersistence dp = new DatabasePersistence();
		
		if(str.contentEquals("file")) {
			fp.persist();
		}
		else if(str.contentEquals("database")) {
			dp.persist();
		}
		else{
			System.out.println("Enter correct data");
		}
	}
}


/*
Output:
Select data should be stored in file or database:
file
File Persisted...
*/
