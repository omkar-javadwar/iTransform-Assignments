import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserValidation {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int attempts =1;
		while(attempts<=3) {
			if(attempts>1)
				System.out.println("attempt "+attempts);
			
    			System.out.print("Enter username: ");
    			String login = reader.readLine();
    			
    			System.out.print("Enter password: ");
    			String password = reader.readLine();
    			
    			if(login.equalsIgnoreCase("omkar")) {
    				if(password.equalsIgnoreCase("omkar")){
    					System.out.print("Welcome "+login);
    					break;
		       }
			}
			attempts++;
			if(attempts>3)
				System.out.print("Contact Admin");
		}
	}
}

/*
Output:
Enter username: om
Enter password: om
attempt 2
Enter username: omka
Enter password: omkar
attempt 3
Enter username: omkar
Enter password: omkar
Welcome omkar
*/
