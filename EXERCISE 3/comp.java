//add 2 complex number//

import java.util.*;
class comp
{
int r;
int i;

comp(int a,int b)                                                         //to initialise
{
r=a;
i=b;
}
public static void main(String arg[])
{
int c;
int d;
Scanner s=new Scanner(System.in); 


System.out.println("Enter Real and Imaginary Part of 1st Complex Number: ");


int x=s.nextInt();
int y=s.nextInt();

comp obj1=new comp(x,y); 
System.out.println("\nEnter Real and Imaginary Part of 2nd Complex Number: ");

int p=s.nextInt();
int q=s.nextInt();

comp obj2=new comp(p,q); 
c=obj1.r+obj2.r;                                                     //adding real part
d=obj1.i+obj2.i;                                                    //adding imaginary part

System.out.println("\nsum of complex : "+c+"+i"+d);

}
}
/**
Enter Real and Imaginary Part of 1st Complex Number: 
2 3

Enter Real and Imaginary Part of 2nd Complex Number: 
3 4

sum of complex : 5+i7
*/
