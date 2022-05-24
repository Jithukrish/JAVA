/**Write a user defined exception class to authenticate the user name and password.*/




import java.util.*;
class myException extends Exception{
	
public myException(String s){
    super(s);
    
}
}
class Main{
       public static void main(String[] args) {
     String username="kripa0098";
     String password="password";
     Scanner sc=new Scanner(System.in);
     
           System.out.println("ENTER USER NAME : ");
           String u=sc.next();
           System.out.println("ENTER PASSWORD : ");
           String p=sc.next();
   try{
    if((u.equals(username))&&(p.equals(password))){
    	throw new myException("authentivation success");
    }
    else{
    	throw new myException("authentication fails");
}
   }
   catch (myException y){
   	System.out.print(y.getMessage()+"\n");
   }
       }
}
/**ENTER USER NAME : 
kripa0098
ENTER PASSWORD : 
password
authentivation success
ksb@ksb-OptiPlex-3060:~/JK/exer 7$ java Main
ENTER USER NAME : 
jithu0088
ENTER PASSWORD : 
jsghdjhg
authentication fails
*/   
