
/**Find the area of different shapes using overloaded functions**/



import java.util.*;
class over
{


void area(int a,int b)
{                                                      //area of rectangle
System.out.println("area of rectangle: "+(a*b));
}
void area(int x)
{
System.out.println("area of square: "+(x*x));        //area of square
}              

void area(float r,int i,int j)
{
System.out.println("area of circle: "+(3.14*r*r));  // area of circle
}
 public static void main(String args[]){
            Scanner s=new Scanner(System.in); 
            
            over obj=new over(); 
           System.out.print("1.RECTANGLE\n2.SQUARE\n3.CIRCLE\n\nEnter your Choice:  ");
           int ch=s.nextInt();
           int a,b,c,d,rad;
           float ar;
       switch(ch)
          
          {
           
           case 1:System.out.print("Enter length and breadth: ");   
                  a=s.nextInt();
                   b=s.nextInt();
                   obj.area(a,b);
                   break;

            case 2:System.out.print("Enter length : ");
                  c=s.nextInt();
                   
                  obj.area(c);
                    break;

            case 3:System.out.print("Enter Radius : ");
                  rad=s.nextInt();
                   
                   obj.area(rad,0,0);
                    
                   break;
           default:System.out.print("invaild ");
                     break;
           }


}
}
/**
1.RECTANGLE
2.SQUARE
3.CIRCLE

Enter your Choice:  1
Enter length and breadth: 5 6
area of rectangle: 30

1.RECTANGLE
2.SQUARE
3.CIRCLE

Enter your Choice:  2
Enter length : 3
area of square: 9

1.RECTANGLE
2.SQUARE
3.CIRCLE

Enter your Choice:  3
Enter Radius : 5
area of circle: 78.5

*/

