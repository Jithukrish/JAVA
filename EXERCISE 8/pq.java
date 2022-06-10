/*4. Program to demonstrate the creation of queue object using the PriorityQueue class*/
import java.util.*;

class pque {
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		PriorityQueue<String>  pq =new PriorityQueue<String>();

            System.out.println("no.of items: ");
            int n=sc.nextInt();
                 System.out.println("enter names: ");
            for(int i=0;i<=5;i++)
{ 
    String A=sc.next();
    pq.add(A);
}
               
               System.out.println("pq="+pq);


		Iterator<String> itr=pq.iterator();


		
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		
		}
		}		
		
}
/** output
no.of items: 
4
enter names: 
a
s
d
d
f
g
pq=[a, d, d, s, f, g]
a	d	d	s	f	g	
**/


