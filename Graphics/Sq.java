package Graphics;
interface AreaSQ{
void area(int a);
}
public class Sq implements AreaSQ{
    public void area(int a){
     System.out.println("area of sq : "+(a*a)+"------");
}
}
