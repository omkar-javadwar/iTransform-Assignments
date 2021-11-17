import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target (ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
}

class TestCase{
	@Test
	String testCase() {
		return "Executing testcase method...";
	}
}

public class TestAnnotation {
	public static void main(String[] args) {
		TestCase t = new TestCase();
		System.out.println(t.testCase());
	}
}

/*
Output:
Executing testcase method...
*/
