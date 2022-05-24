/**4. Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a given range. Implement using threads(Runnable Interface) **/
import java.util.*;

class Fibonacci implements Runnable{
		int n;
		Fibonacci(int a){
			this.n=a;
		
		}
		
		public void run(){
			
			int a=0,b=1;
			try{if(n==1){
				System.out.println("fibonacci series \n --0");
				
			}
			else{
				int f=0;
				System.out.println("fibonacci --0\nfibonacci --1");
				while(0<n-2){
					f=a+b;
					a=b;
					b=f;
					System.out.println("fibonacci --"+f);
					n--;
					Thread.sleep(1000);
				}
				
			}	
		}
		catch(Exception e){
			System.out.println("something wrong");
		}
		}
}

class Even implements Runnable{
	int e;
	Even(int a){
		this.e=a;
		
	}
	public void run(){
		
		try{for(int i=1;i<=e;i++){
			if(i%2==0){
				System.out.println("even number = "+i);
				Thread.sleep(1000);			
				}
		
			}
		}
		catch(Exception e){
			System.out.println("something wrong");
		}
	
	}

}





class thread2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no.of even numbers:");
		int u=sc.nextInt();
		
		Fibonacci f= new Fibonacci(u);
		Thread th = new Thread(f);
		
		
		Even e =new Even(2*u);
		Thread th1 = new Thread(e);
		th1.start();
		th.start();
		
		
		
		
		
	}

}
/** OUT PUT
enter no.of even numbers:
7
even number = 2
fibonacci --0
fibonacci --1
fibonacci --1
even number = 4
fibonacci --2
even number = 6
fibonacci --3
even number = 8
fibonacci --5
even number = 10
fibonacci --8
even number = 12
even number = 14

**/

