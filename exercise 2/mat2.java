/** Read a matrix from the console and check whether it is symmetric or not.*/

import java.util.*;


public class mat2 {
	
	public static void main(String args []) {			    //  main function
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the rows columns:");
		System.out.print("rows :");
		int rows=obj.nextInt();
		System.out.print("columns :");
		int cols=obj.nextInt();
		
		int array1[][]= new int[rows][cols];                         // array 
		int array2[][]= new int[rows][cols];
		
		System.out.println("Enter the elements in the matrix:");      // insert elements
		for (int i=0;i<rows;i++) 
		{
		   for(int j=0;j<cols;j++) 

		 {

		    array1[i][j]=obj.nextInt();
				
		   
                 }
			
		}
		for (int i=0;i<rows;i++)                                 // transpose matrix
		{
			for(int j=0;j<cols;j++) 
			{
				array2[i][j]=array1[j][i];
				
			}
			
		}
		
		if(Arrays.deepEquals(array1, array2))                      // symmetric or not
		{ 
			System.out.println("It is a symmetric matrix");
		}
		else{
			System.out.println("It is not a symmetric matrix");
		}
			
			
		
		
}
}


/** enter the rows columns:
rows :3
columns :3
Enter the elements in the matrix:
2 3 4
3 4 5
3 4 5
It is not a symmetric matrix

enter the rows columns:
rows :3
columns :3
Enter the elements in the matrix:
1 2 3
1 2 3
1 2 3
It is not a symmetric matrix

enter the rows columns:
rows :3
columns :3
Enter the elements in the matrix:
1 2 3
2 1 4
3 4 3
It is a symmetric matrix */

