import arithematic.*;
import java.util.*;
 class pack2{
 public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("-----------------ADDITION------------------");
System.out.println("ENETR 2 NUMBERS: ");
int a=sc.nextInt();
int b=sc.nextInt();
 Addition v=new Addition();
v.result(a,b);
System.out.println("                                                     ");
System.out.println("------------------SUBSTRACTION------------------");
System.out.println("ENETR 2 NUMBERS: ");
int c=sc.nextInt();
int d=sc.nextInt();
 sub u=new sub();
u.result(c,d);

System.out.println("                                          ");
System.out.println("---------------------------DIVISION--------------------------");
System.out.println("ENETR 2 NUMBERS: ");
int p=sc.nextInt();
int q=sc.nextInt();
 divi m=new divi();
m.result(p,q);

System.out.println("                               ");
System.out.println("---------------------MULTIFICATION---------------------------");
System.out.println("ENETR 2 NUMBERS: ");
int y=sc.nextInt();
int z=sc.nextInt();
 mul o=new mul();
o.result(y,z);
}
}
/**-----------------ADDITION------------------
ENETR 2 NUMBERS: 
5
6
1st num :5
2nd num :6
result is :11.0

                                                     
------------------SUBSTRACTION------------------
ENETR 2 NUMBERS: 
6
9
1st num :6
2nd num :9
result is :-3.0

                                          
---------------------------DIVISION--------------------------
ENETR 2 NUMBERS: 
2
9
1st num :2
2nd num :9
result is :0.2222222222222222

                               
---------------------MULTIFICATION---------------------------
ENETR 2 NUMBERS: 
5
7
1st num :5
2nd num :7
result is :35.0

*/

