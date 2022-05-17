package Graphics;
interface AreaT{
void area(int h,int b);
}
public class Tri implements AreaT{
    public void area(int h,int b){
     System.out.println("area of triangle : "+(b*h*0.5)+"------");
}
}
