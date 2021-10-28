public class StringApplications {	
	public static void main(String[] args) {
		System.out.println("Hello World".length());
		
		String s1 = "Hello, ";
		String s2 = "How are you?";
		System.out.println(s1.concat(s2));
		
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace("a", "$"));
		System.out.println(str.contains("collection"));
		System.out.println(str.compareTo("java string pool refers to collection of strings which are stored in heap memory"));
		System.out.println(str.compareToIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
	}
}

/*
Output:
11
Hello, How are you?
java string pool refers to collection of strings which are stored in heap memory
JAVA STRING POOL REFERS TO COLLECTION OF STRINGS WHICH ARE STORED IN HEAP MEMORY
J$v$ String pool refers to collection of Strings which $re stored in he$p memory
true
-32
0
*/
