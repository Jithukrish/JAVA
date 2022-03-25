//write program in java to display the cube of number to a given integer
import java.util.Scanner;
public class cube{

    
  public static void main(String[] args)
    {   
      int i,n;
           Scanner in = new Scanner(System.in);
           System.out.println("Input value: ");
           n =in.nextInt(); 
          for(i=1;i<n;i++)
  {
   System.out.println("number is : "+i+" and cube of:  "+i+" is :"  +(i*i*i));
   }
  }
 }
/** out put
Input value: 
5
number is : 1 and cube of:  1 is :1
number is : 2 and cube of:  2 is :8
number is : 3 and cube of:  3 is :27
number is : 4 and cube of:  4 is :64
*/

