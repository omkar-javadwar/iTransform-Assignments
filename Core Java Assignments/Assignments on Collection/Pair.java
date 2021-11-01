import java.util.Date;

public class Pair<key, value>{
	private key Key;
	private value Value;
		
	public Pair(key key, value value) {
		super();
		Key = key;
		Value = value;
	}

	public key getKey() {
		return Key;
	}

	public void setKey(key key) {
		Key = key;
	}

	public value getValue() {
		return Value;
	}

	public void setValue(value value) {
		Value = value;
	}

	@Override
	public String toString() {
		return "Pair [Key=" + Key + ", Value=" + Value + "]";
	}

	public static void main(String[] args) {
		
		Pair<Integer, String> myObj = null;
		Pair<String, Date> pair = null;
		
		myObj = new Pair<Integer, String>(1, "Hello");
		System.out.println(myObj.toString());
		
		pair = new Pair<String, Date>("Today is", new java.util.Date());
		System.out.println(pair.toString());
	}
}

/*
Output:
Pair [Key=1, Value=Hello]
Pair [Key=Today is, Value=Mon Nov 01 13:03:31 IST 2021]
*/
