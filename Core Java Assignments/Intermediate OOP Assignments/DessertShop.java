import java.util.Scanner;

abstract class DessertItem{
	abstract int getCost(int cart);

	int getCost() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Candy extends DessertItem{
	int count = 0;
	
	int addDessert(int i) {
		count += i;
		return count;
	}
	
	int placeOrder(int j) {
		count -= j;
		return j;
	}
	
	@Override
	int getCost(int cart) {
		return cart*60*placeOrder(cart);
	}
}

class Cookie extends DessertItem{
	int count = 0;
	
	int addDessert(int i) {
		count += i;
		return count;
	}
	
	int placeOrder(int j) {
		count -= j;
		return j;
	}
	
	@Override
	int getCost(int cart) {
		return cart*70*placeOrder(cart);
	}
}

class IceCream extends DessertItem{
	int count = 0;
	
	int addDessert(int i) {
		count += i;
		return count;
	}
	
	int placeOrder(int j) {
		count -= j;
		return j;
	}
	
	@Override
	int getCost(int cart) {
		return cart*10*placeOrder(cart);
	}
}

public class DessertShop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your role:");
		String role = sc.nextLine();
		
		Candy candy = new Candy();
		Cookie cookie = new Cookie();
		IceCream iceCream = new IceCream();
		
		while (true)
		{	
			switch(role){
		        case "owner":
		        	System.out.println("Enter no. of candies:");
					int candies = sc.nextInt();
					candy.addDessert(candies);
					
					System.out.println("Enter no. of cookies:");
					int cookies = sc.nextInt();
					cookie.addDessert(cookies);
					
					System.out.println("Enter no. of ice-cream:");
					int icecream = sc.nextInt();
					iceCream.addDessert(icecream);
		
					break;
					
		        case "customer":
		        	System.out.println("Enter no. of candies:");
					int pcandies = sc.nextInt();
					System.out.println("Cart value:"+ candy.getCost(pcandies));
								
					System.out.println("Enter no. of cookies:");
					int pcookies = sc.nextInt();
					System.out.println("Cart value:"+ cookie.getCost(pcookies));
					
					System.out.println("Enter no. of ice-cream:");
					int picecream = sc.nextInt();
					System.out.println("Cart value:"+ iceCream.getCost(picecream));
		
					break;
					
		        default:
		        	System.out.println("Choose correct role");
		        	break;
			}
		}
	}
}

/*
Output:
Enter your role:
customer
Enter no. of candies:
5
Cart value:1500
Enter no. of cookies:
5
Cart value:1750
Enter no. of ice-cream:
5
Cart value:250
*/
