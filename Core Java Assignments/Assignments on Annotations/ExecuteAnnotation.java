import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	int Sequence() default 0;
}

class MyClass {
	@Execute(Sequence = 2)
	public void myMethod1() {
		System.out.println("Executing method 1...");
	}
	
	@Execute(Sequence = 1)
	public void myMethod2() {
		System.out.println("Executing method 2...");
	}
	
	@Execute(Sequence = 3)
	public void myMethod3() {
		System.out.println("Executing method 3...");		
	}
}

public class ExecuteAnnotation{
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		Method[] m = obj.getClass().getMethods();
		for (Method method: m) {
			Execute e = method.getAnnotation(Execute.class);
			if (e!=null) {
				try {
					method.invoke(obj);
					System.out.println(e);
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}

/*
Output:
Executing method 1...
@Execute(Sequence=2)
Executing method 3...
@Execute(Sequence=3)
Executing method 2...
@Execute(Sequence=1)
*/
