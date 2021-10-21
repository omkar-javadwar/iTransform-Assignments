import java.util.Arrays;

class BubbleSort
{
  static void bubbleSort (int array[])
  {
    int size = array.length;
    for (int i = 0; i < size - 1; i++)
      for (int j = 0; j < size - i - 1; j++)
    	if (array[j] > array[j + 1])
	      {
	        int temp = array[j];
    	    array[j] = array[j + 1];
	        array[j + 1] = temp;
	      }
  }

  public static void main (String args[])
  {
    int[] data = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 7, 52, 86, 47 };

    BubbleSort.bubbleSort (data);
    System.out.println ("Sorted Array in Ascending Order:");
    System.out.println (Arrays.toString (data));
  }
}

/*
Output:
Sorted Array in Ascending Order:
[1, 5, 6, 7, 12, 14, 19, 23, 26, 35, 47, 52, 78, 86]
*/
