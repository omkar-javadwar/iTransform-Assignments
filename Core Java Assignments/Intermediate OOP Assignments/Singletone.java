final class Singletone
{
	public void show()
	{
		System.out.println("hello");
	}
}

class A extends Singletone
{
	public void show()
	{
		System.out.println("hi");
	}
}

public class Main {

	public static void main(String[] args) {
		A obj=new A();
		obj.show();

	}
}

/* Output:
error: cannot inherit from final Singletone
class A extends Singletone
*/
