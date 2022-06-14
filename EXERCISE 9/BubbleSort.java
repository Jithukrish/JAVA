
//bubblesort

import java.util.*;

public class BubbleSort<T extends Comparable<? super T>>
{
      T[] array;
      BubbleSort(T[] array)
    {
            this.array = array;
      }
 
      private T[] bubbleSort()
    {
        for(int i = array.length; i > 1; i--)
    {
              for(int j = 0; j < i - 1; j++)
        {        
                if(array[j].compareTo(array[j+1]) > 0) //if greater swap elements
            {
                      swapElements(j, array);
                }
              }            
        }
        return array;
}

      private void swapElements(int index, T[] arr)
    {
            T temp = arr[index];
            arr[index] = arr[index+1];
            arr[index+1] = temp;        
      }
      public static void main(String[] args)
    {

            Integer[] intArr = {44,55,23,7};
            BubbleSort<Integer> bsg1 = new BubbleSort<Integer>(intArr);
            Integer[] sa1 = bsg1.bubbleSort();
            System.out.println("Sorted array- " + Arrays.toString(sa1));
   
            String[] strArr = {"JAVA", "PYTHON", "c++", "DBMS"};
            BubbleSort<String> bsg2 = new BubbleSort<>(strArr);
            String[] sa2 = bsg2.bubbleSort();
            System.out.println("Sorted array- " + Arrays.toString(sa2));
      }
}

/** Sorted array- [7, 23, 44, 55]
Sorted array- [DBMS, JAVA, PYTHON, c++]
**/
