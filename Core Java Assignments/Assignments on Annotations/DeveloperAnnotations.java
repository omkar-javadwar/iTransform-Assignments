import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target (ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	int authorId();
	String author() default "abc";
	String supervisor();
	String date();
	String time();
	int version();
	String description() default "description of the class, method, or property";

}
@Info(authorId = 1, supervisor = "xyz", date = "10 Oct 2021", time = "10:30 AM", version = 1)
class Information{
	int authorId;
	String author;
	String supervisor;
	String date;
	String time;
	int version;
	String description;
	
	public Information(int authorId, String author, String supervisor, String date, String time, int version,
			String description) {
		super();
		this.authorId = authorId;
		this.author = author;
		this.supervisor = supervisor;
		this.date = date;
		this.time = time;
		this.version = version;
		this.description = description;
	}	
}

public class DeveloperAnnotations {
	public static void main(String[] args) {
		Information obj = new Information(0, null, null, null, null, 0, null);
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(Info.class);
		Info info =  (Info)an;
		System.out.println("authorId: " + info.authorId());
		System.out.println("author: " + info.author());
		System.out.println("supervisor: " + info.supervisor());
		System.out.println("date: " + info.date());
		System.out.println("time: " + info.time());
		System.out.println("version: " +info.version());
		System.out.println("description: " + info.description());
	}
}

/*
Output:
authorId: 1
author: abc
supervisor: xyz
date: 10 Oct 2021
time: 10:30 AM
version: 1
description: description of the class, method, or property
*/
