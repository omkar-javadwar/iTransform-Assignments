
public class StringBufferApplications {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("StringBuffer ");
		sb.append("is a peer class of String ");
		sb.append("that provides much of ");
		sb.append("the functionality of strings ");
		System.out.println(sb);
		
		StringBuffer str = new StringBuffer("It is used to _ at the specified index position");
		str.replace(14,15,"insert text");
		System.out.println(str);
		
		StringBuffer sr = new StringBuffer("This method return the reversed object on which it was called");
		sr.reverse();
		System.out.println(sr);
	}

}


/*
Output:
StringBuffer is a peer class of String that provides much of the functionality of strings 
It is used to insert text at the specified index position
dellac saw ti hcihw no tcejbo desrever eht nruter dohtem sihT
*/
