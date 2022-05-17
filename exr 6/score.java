 /**Create interfaces Student and Sports. Create
a class Result implements Student and Sports.
Display the academic and sports score of a
student.*/



interface student{
 int score=10;
 void displayscore();
       }
interface sports{
 int score=25;
 void displaysportsscore();
}
class Result implements student,sports{
 public void displayscore(){
 System.out.println("academic score is "+student.score);
}
public void displaysportsscore(){
System.out.println("sports score is "+sports.score);
}
}
class score{
public static void main(String args[]){
Result s=new Result();
s.displayscore();
s.displaysportsscore();
}
}
/**output
academic score is 10
sports score is 25
**/

