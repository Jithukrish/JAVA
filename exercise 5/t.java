/*Create a class ‘Employee’ with data members Empid,
Name, Salary, Address and constructors to initialize the
data members. Create another class ‘Teacher’ that inherit
the properties of class employee and contain its own data
members department, Subjects taught and constructors
to initialize these data members and also include display
function to display all the data members. Use array of
objects to display details of N teachers.*/











import java.util.*;
class Employee{
	int Empid;
	String Name;
	double Salary;
	String Address;
	
	 void Employee(int id,String name,double sal,String add){
		Empid=id;
		Name=name;
		Salary=sal;
		Address=add;
}

}
class Teacher extends Employee {
	String department;
	String Subjects_taught;
	
	Teacher(String dept,String sub,int id,String name,double sal,String add){
		
		
		department=dept;
		Subjects_taught=sub;

		Empid=id;
		Name=name;
		Salary=sal;
		Address=add;

	}
	void display(){

		System.out.println("Emp id:"+Empid+"\nEmp Name:"+Name+"\nSalary:"+Salary+"\nAddress:"+Address);
		System.out.println("Dep:"+department+"\nSub taught:"+Subjects_taught);
		
	

		

	}



}

class tea{

	public static void main(String args[]){
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter the no.of Teacher:");
			int n=obj.nextInt();
			
			
			
			Teacher[] arr;
			arr=new Teacher[n];
			
			for(int i=0;i<n;i++){
					System.out.println("Enter the details of "+(i+1)+"th Teacher");
					
					System.out.print("Enter emp id:");
					int id=obj.nextInt();
					
					System.out.print("\nEnter emp name:");
					String name=obj.next();
					
					System.out.print("\nEnter emp salary:");
					double sal=obj.nextDouble();
					
					System.out.print("\nEnter Address:");
					String add=obj.next();

					
					System.out.print("\nEnter department:");
					String dep=obj.next();

					System.out.print("\nEnter Sub taught:");
					String sub=obj.next();

					
					arr[i]=new Teacher(dep,sub,id,name,sal,add);
					
					
					
					
			}

		for(int j=0;j<n;j++){
				System.out.println("---------------------------");

				arr[j].display();

		}



}

}


/**Enter the no.of Teacher:
1
Enter the details of 1th Teacher
Enter emp id:101

Enter emp name:raju

Enter emp salary:10000

Enter Address:pathimangalam

Enter department:bsc

Enter Sub taught:phy
---------------------------
Emp id:101
Emp Name:raju
Salary:10000.0
Address:pathimangalam
Dep:bsc
Sub taught:phy


*/
