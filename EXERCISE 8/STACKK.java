/**STACK**/



import java .util.*;

class S{
	public static void main(String args[]){
		Stack<String> stack =new Stack<String>();
		stack.push("ONE");
		stack.push("TWO");
		stack.push("THREE");
		stack.push("FOUR");
		stack.push("FIVE");
		
		
		System.out.println("size of the Stack:"+stack.size());
		
		System.out.println("Contents in the Stack:"+stack);
		stack.removeElementAt(2);
		System.out.println("Contents in the Stack after remove at index 2:"+stack);

		
	}


}
/** OUT PUT
size of the Stack:5
Contents in the Stack:[ONE, TWO, THREE, FOUR, FIVE]
Contents in the Stack after remove at index 2:[ONE, TWO, FOUR, FIVE]
**/
