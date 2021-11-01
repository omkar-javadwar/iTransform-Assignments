import java.util.*;

public class ExchangeTwoElements {
	
	public static final <T> void swap(T[] a, int i, int j) {
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static final <T> void swap(List<T> l, int i, int j) {
		Collections.<T>swap(l, i ,j);
	}
	
	public static void test() {
		String [] a = {"Hello", "Goodbye"};
		swap(a, 0, 1);
		System.out.println("a: " + Arrays.toString(a));
		List<String> l = new ArrayList<String>(Arrays.asList(a));
		swap(l,0,1);
		System.out.println("l: "+ l);
	}
	
	public static void main(String[] args) {
		test();
	}
}


/*
Output:
a: [Goodbye, Hello]
l: [Hello, Goodbye]
*/
