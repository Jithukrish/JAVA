/**Program to create a class for Employee having attributes eNo, eName ,eSalary. Read n     employinformation and Search for an employee given
eNo, using the concept of Array of Objects.*/
	
	
import java.util.*;
class emp
{
int empno;
int empsal;
String empname;
void setdata(int a,String b,int c) 
{
empno=a;
empname=b;
empsal=c;
}
}
class empp{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);
           
            System.out.print("Enter Number of Employees: ");
             int n=s.nextInt();
            System.out.println("---------------------------------------");
            emp obj[]=new emp[n]; 
          for(int j=0;j<n;j++) 
             obj[j]=new emp();
             int a,f=0;
             String b;
             int c,i;
            for(i=0;i<n;i++)
            {
            					
             System.out.println("Enter the details of " +(i+1)+ "th employee");
             System.out.println("---------------------------------------");
             System.out.print("\nEnter Employee number : " );
             a=s.nextInt();
            System.out.print("\nEnter Employee name: ");
            b=s.next();
            System.out.print("\nEnter Salary of person : "); 
             c=s.nextInt();
           System.out.println("---------------------------------------");
        
             obj[i].setdata(a,b,c); 
             
             }
         

             System.out.println("\nEnter person id to search: ");
             int id=s.nextInt();          

              for(i=0;i<n;i++)
                {
                  if(id==obj[i].empno) 
                  {
                   System.out.println("\nperson found ");
                    f=1;
                    break;
                   }
          
                }
            if(f==0)
               System.out.println("\nperson not found");
}

}
/** Enter Number of Employees: 2
---------------------------------------
Enter the details of 1th employee
---------------------------------------

Enter Employee number : 1

Enter Employee name: midhun

Enter Salary of person : 26000
---------------------------------------
Enter the details of 2th employee
---------------------------------------

Enter Employee number : 2

Enter Employee name: akshai

Enter Salary of person : 23000
---------------------------------------

Enter person id to search: 
1

person found 

Enter Number of Employees: 2
---------------------------------------
Enter the details of 1th employee
---------------------------------------

Enter Employee number : 1

Enter Employee name: raju

Enter Salary of person : 23000
---------------------------------------
Enter the details of 2th employee
---------------------------------------

Enter Employee number : 2

Enter Employee name: ravi

Enter Salary of person : 24000 
---------------------------------------

Enter person id to search: 
4

person not found
  */

