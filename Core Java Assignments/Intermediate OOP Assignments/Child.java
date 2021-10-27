abstract class Parent {
	public void display() {
		System.out.println("In Parent Class");
	}
}

public class Child extends Parent{
	public void display() {
		System.out.println("In Child Class");
	}
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
	}
}

/*
Output:
In Child Class
*/
