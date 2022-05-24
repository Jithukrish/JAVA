/**Find the average of N positive integers, raising a user defined exception for each negative input.*/


import java.util.*;
class myException extends Exception{
public myException (String s){
	

    super(s);
    
}
}
class Main{
       public static void main(String[] args) {
     
     Scanner sc=new Scanner(System.in);
     
           System.out.print("ENTER No of items:" );
           int n= sc.nextInt();
           int d;
           int total=0;
           int c=0;
           
           System.out.print("ENTER numbers : ");
          for(int i=0;i<n;i++)
          {
            d=sc.nextInt();
            
   try{
    if(d>=0){
    	c++;
    	total=total+d;
    }
    else{
    	throw new myException("negative number not allowed");
    }
   }
   catch(myException a){
    	System.out.println(a.getMessage()+"\n");
   }
if(d<0){
      i=i-1;
}
 }
          
  
   	System.out.println("averge of  "+c+"  positive number ="+(double)total /c);
   }
       
}
/**ENTER No of items:2
ENTER numbers : 2 3
averge of  2  positive number =2.5
*/
   
