import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;
 
class SearchArrayElement {
 
    private static void check(int[] arr, int toCheckValue)
    {
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
 
        System.out.println("Is " + toCheckValue
                           + " present in the array: " + test);
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 7, 52, 86, 47 };
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Value to be search is:");
        int toCheckValue = sc.nextInt();
 
        System.out.println("Array: " + Arrays.toString(arr));
        check(arr, toCheckValue);
    }
}

/*
Output:
Value to be search is:
19
Array: [5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 7, 52, 86, 47]
Is 19 present in the array: true
*/
