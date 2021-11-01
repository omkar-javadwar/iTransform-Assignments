import java.util.*;  

public class HashMapApplication {
	public static void main(String[] args) {
		   HashMap<Integer,Double> map=new HashMap<Integer,Double>();  
		   map.put(1, 1.11);
		   map.put(2, 2.21);
		   map.put(3, 3.31);
		   map.put(4, 4.41);
		   map.put(5, 5.15);
		   map.put(6, 6.16);
		   map.put(7, 7.17);
		   map.put(8, 8.18);
		   map.put(9, 9.19);
		   map.put(10, 10.01);

		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
	}
}


/*
Output:
Iterating Hashmap...
1 1.11
2 2.21
3 3.31
4 4.41
5 5.15
6 6.16
7 7.17
8 8.18
9 9.19
10 10.01
*/
