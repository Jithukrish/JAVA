/*. Program to create a generic stack and do the Push and Pop operations.
*/

import java.util.*;
class StackOperations<T>{
	
	

	void push(ArrayList<T> arr,T item){
		
		arr.add(item);
	
	}
	void pop(ArrayList<T> arr){
		if(arr.isEmpty()){
			System.out.println("Stack is Empty");
		}
		else{
		
		int index = arr.size()-1;
		System.out.println("poped item is : "+arr.get(index));
		arr.remove(index);
		}
	}
	void Display(ArrayList<T> arr){
			System.out.println("elements in stack");
		for(T elements :arr){
			System.out.print(elements+"\t");
		}
	
	}
	

}

public class stack{
	public static void main(String ar[]){
		StackOperations s=new StackOperations();
		Scanner sc=new Scanner(System.in);
		ArrayList<String> sr=new ArrayList<String>();
		ArrayList<Integer> AI=new ArrayList<Integer>();
		
		
		
		
		
		
		
		
		while(true){
				System.out.println("\n1.PUSH\n2.DISPLAY\n3.POP\n4.EXIT....");
				System.out.println("\nSELECT AN OPTION");
				int ch=sc.nextInt();
				System.out.println("-------------------------------");
				
				switch(ch){
					case 1:	
							System.out.println("Enter the item to push");
							String item=System.console().readLine();
							s.push(sr,item);
							break;
					case 2:
							s.Display(sr);
							
							break;
					case 3: 
							s.pop(sr);
							break;
					default:
							System.exit(0);				
				}

		}
		
			
		
	
	}
}
/**

1.PUSH
2.DISPLAY
3.POP
4.EXIT....

SELECT AN OPTION
1
-------------------------------
Enter the item to push
10

1.PUSH
2.DISPLAY
3.POP
4.EXIT....

SELECT AN OPTION
1
-------------------------------
Enter the item to push
12

1.PUSH
2.DISPLAY
3.POP
4.EXIT....

SELECT AN OPTION
2
-------------------------------
elements in stack
10	12	
1.PUSH
2.DISPLAY
3.POP
4.EXIT....

SELECT AN OPTION
3
-------------------------------
poped item is : 12

1.PUSH
2.DISPLAY
3.POP
4.EXIT....

SELECT AN OPTION
3
-------------------------------
poped item is : 10

1.PUSH
2.DISPLAY
3.POP
4.EXIT....

SELECT AN OPTION
4
-------------------------------


**/
