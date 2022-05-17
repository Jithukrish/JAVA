package arithematic;
interface substra{
void result(int a,int b);
}
public class sub implements substra{
  double r=0;

public void result(int a,int b){
r=(double)a-b;
System.out.println("1st num :"+ a);
System.out.println("2nd num :"+b);
System.out.println("result is :"+(r)+"\n");
}
}
