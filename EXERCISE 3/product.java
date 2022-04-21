/**Define a class ‘product’ with data members pcode, pname and price.
Create 3 objects of the class and find the product having the lowest
price*/


import java.util.*;
class product
{
int pcode;
String pname;
int price;
void setdata(int c,int p,String N)
{
pcode=c;
pname=N;
price=p;
}
public static void main(String args[])
{
int c1,c2,c3;
int p1,p2,p3;
String N1,N2,N3;
Scanner s=new Scanner(System.in);

product obj1=new product();
product obj2=new product();
product obj3=new product();


System.out.print(" enter person 1 "+"pcode: ");
c1=s.nextInt();
System.out.print(" enter person 1 "+"pname: ");
N1=s.next();
System.out.print(" enter person 1 "+"price: ");
p1=s.nextInt();
obj1.setdata(c1,p1,N1);
System.out.println("-----------------------------------------------------");
System.out.print("enter person 2 "+"pcode: ");
c2=s.nextInt();
System.out.print("enter person 2 "+"pname: ");
N2=s.next();
System.out.print("enter person 2 "+"price: ");
p2=s.nextInt();
obj2.setdata(c2,p2,N2);
System.out.println("-------------------------------------------------------");
System.out.print("enter person 3 "+"pcode: ");
c3=s.nextInt();
System.out.print("enter person 3 "+"pname: ");
N3=s.next();
System.out.print("enter person 3 "+"price: ");
p3=s.nextInt();
obj3.setdata(c3,p3,N3);
System.out.println("--------------------------------------------------------- ");

if(obj1.price<obj2.price && obj1.price<obj3.price)
System.out.println(" product code="+obj1.pcode+",product name="+obj1.pname+",price="+obj1.price);
if(obj2.price<obj1.price && obj2.price<obj3.price)
System.out.println(" product code="+obj2.pcode+",product name="+obj2.pname+",price="+obj2.price);
if(obj3.price<obj1.price && obj3.price<obj2.price)
System.out.println(" product code="+obj3.pcode+",product name="+obj3.pname+",price="+obj3.price);
}
}


/** output
 enter person 1 pcode: 1
 enter person 1 pname: ball
 enter person 1 price: 80
-----------------------------------------------------
enter person 2 pcode: 2
enter person 2 pname: bat
enter person 2 price: 3000
-------------------------------------------------------
enter person 3 pcode: 3
enter person 3 pname: football
enter person 3 price: 2000
--------------------------------------------------------- 
 product code=1,product name=ball,price=80
*/
