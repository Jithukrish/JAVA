//using Arrays binarySearch()//

import java.util.*;
class bisearch{
     public static void main(String args[])
{
            Scanner s=new Scanner(System.in);
            int i,k=0;

            System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
            int arr[]=new int[n];                                       //declaring array
             System.out.print("Enter the elements in sorted order: ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt();                      
             System.out.print("Enter the element to search: ");
             int a=s.nextInt();

           int z=Arrays.binarySearch(arr,a); 

           if(z > -1)                              
            System.out.println("Element Found at Index:  "+z);
          else                                                   
             System.out.println("Element not found! ");            

}
}
/**Enter Number of elements: 3
Enter the elements in sorted order: 2
3
4
Enter the element to search: 2
Element Found at Index:  0

Enter Number of elements: 4
Enter the elements in sorted order: 1
2
3
4
Enter the element to search: 3
Element Found at Index:  2
*/
