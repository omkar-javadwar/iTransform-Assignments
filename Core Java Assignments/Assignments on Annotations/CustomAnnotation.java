import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target (ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	int testCase() default 0;
}

@Test(testCase = 1)
class TestCase{
	public TestCase() {
		System.out.println("Executing testcase method...");
	}
}

public class CustomAnnotation {
	public static void main(String[] args) {
		TestCase obj = new TestCase();
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(Test.class);
		Test t =  (Test)an;
		System.out.println(t.testCase());
	}
}


/*
Output:
Executing testcase method...
1
*/
