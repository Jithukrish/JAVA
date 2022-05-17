package Graphics;
interface AreaR{
void area(int l,int b);
}
public class Rectangle implements AreaR{
    public void area(int l,int b){
     System.out.println("area of rectangle : "+(l*b)+"------");
}
}
