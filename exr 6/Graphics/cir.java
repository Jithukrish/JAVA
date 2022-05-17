package Graphics;
interface areac{
void area(double r);
}
public class cir implements areac{
    public void area(double r){
     System.out.println("area of circle : "+(3.14*r*r)+"------");
}
}
