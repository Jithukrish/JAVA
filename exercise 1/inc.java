/**write a program that accept 3 numbers check increasing,decreasing or both*/
import java.util.Scanner;
public class inc{

    
  public static void main(String[] args)
    {   
      
           Scanner in = new Scanner(System.in);
           System.out.println("first number: ");
           double x=in.nextDouble(); 

           System.out.println("2nd number : ");
           double y=in.nextDouble();

            System.out.println("3rd number: ");
           double z=in.nextDouble();

     if(x<y&&y<z)
  {
    System.out.println("increasing order ");
  }
  else if(x>y&&y>z)
  {  
  System.out.println("decreasing order ");
  }
  else
 {
 System.out.println(" increasing or decreasing ");
  }
}
}
/** out put
 first number: 
5
2nd number : 
6
3rd number: 
7
increasing order

first number: 
5
2nd number : 
4
3rd number: 
3
decreasing order

first number: 
5
2nd number : 
6
3rd number: 
1
 increasing and decreasing 
*/
//Verified
