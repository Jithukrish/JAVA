/**Read 2 matrices from the console and perform matrix addition.*/

import java.util.Scanner;
 
class matrix
{
public static void main(String args[])
{
int row, col,i,j;
Scanner in = new Scanner(System.in);
 
System.out.println("Enter the number of rows");
row = in.nextInt();
 
System.out.println("Enter the number columns");
col = in.nextInt();
 
int mtx1[][] = new int[row][col];
int mtx2[][] = new int[row][col];
int rslt[][] = new int[row][col];
 
System.out.println("Enter matrix1");
 
for (i=0;i<row;i++)
{ 
 for(j=0;j<col;j++)
 mtx1[i][j]=in.nextInt();
 System.out.println();
}
System.out.println("Enter  matrix2");
 
for (i=0;i<row;i++)
{
 for (j=0;j<col;j++)
 mtx2[i][j]=in.nextInt();
 System.out.println();
}
 for(i=0;i<row;i++)
 for(j=0;j<col;j++)
 rslt[i][j]=mtx1[i][j]+mtx2[i][j] ; 
 
System.out.println("Sum of matrices:-");
 
for(i=0;i<row;i++)
{ 
for(j=0;j<col;j++)
System.out.print(rslt[i][j]+"\t");
 System.out.println();
}
 
}
}


/**Enter the number of rows
3
Enter the number columns
3
Enter matrix1
1 2 3

2 3 4

3 4 5

Enter  matrix2
1 2 3

1 2 3

1 2 3

Sum of matrices:-
2	4	6	
3	5	7	
4	6	8	*/
