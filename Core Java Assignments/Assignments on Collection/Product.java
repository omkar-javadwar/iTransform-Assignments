import java.util.HashSet;
 
public class Product {
 
    public static void main(String[] args)
    {
        HashSet<String> hset = new HashSet<String>();
 
        hset.add("pen");
        hset.add("pencile");
        hset.add("notebook");
        hset.add("book");        
        hset.add("eraser");
        hset.add("sharpner");
        hset.add("water color");
        hset.add("pencile color");
        hset.add("whitener");
        hset.add("paper sheet");
        hset.add("eraser");

        System.out.println("HashSet contains: ");
 
        for (String temp : hset) {
            System.out.println(temp);
        }
    }
}

/*
Output:
HashSet contains: 
eraser
sharpner
whitener
book
pencile color
pen
pencile
paper sheet
water color
notebook
*/
