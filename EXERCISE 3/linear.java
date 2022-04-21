//linear search


import java.util.Scanner;

public class linear
{
   public static void main(String[] args)
   

{
      int i,n,p=0;
      int[] arr=new int[10];
      Scanner s=new Scanner(System.in);
      
      System.out.print("Enter 10 Elements: ");
      for(i=0;i<10;i++)
         arr[i] =s.nextInt();
      
      System.out.print("Enter  Element to Search: ");
      n=s.nextInt();
      
      for(i=0;i<10;i++)
      {
         if(n==arr[i])
         {
            p=i+1;
            break;
         }
      }
      if(p==0)
         System.out.println("\nThe element not found!");
      else
         System.out.println("\nThe element found  position: " +p);
   }
}
/**Enter 10 Elements: 1
2
3
4
5
6
7
8
9
10
Enter  Element to Search: 3

The element found  position: 3


Enter 10 Elements: 1
2
3
4
5
6
7
8
9
10
Enter  Element to Search: 11
The element not found!
*/

