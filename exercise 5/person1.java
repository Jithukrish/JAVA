/**Create a class ‘Person’ with data members Name, Gender, Address, Age and a
constructor to initialize the data members and another class ‘Employee’ that inherits
the properties of class Person and also contains its own data members like Empid,
Company_name, Qualification, Salary and its own constructor. Create another class
‘Teacher’ that inherits the properties of class Employee and contains its own data
members like Subject, Department, Teacherid and also contain constructors and
methods to display the data members. Use array of objects to display details of N
teachers.*/





import java.util.*;
class Person{                                                                           //create class Person
	String Name;
	String Gender;
	int Age;
	String Address;
	
	 Person(String gen,String name,int age,String add){                               //constructor of person
			Gender=gen;
			Name=name;
			Age=age;
			Address=add;
}

}
class Employee extends Person {                                                   // Employee that inherit person
	int Empid;
	String Company_name;
	String Qualification;
	double Salary;
	
	Employee(String gen,String name,int age,String add,int id,String comp_name,String qua, double sal){	//constructor of Employee
		super(gen,name,age,add);
		Empid=id;
		Company_name=comp_name;
		Qualification=qua;
		Salary=sal;
		


		

	}
	



}

class Teacher extends Employee { //create class Teacher that inherit Employee 

	String Sub;
	String Dpt;
	int T_id;
	Teacher(String gen,String name,int age,String add,int id,String comp_name,String qua, double sal,String dpt,String sub,int tid){
		super(gen,name,age,add,id,comp_name,qua,sal);
		
		Sub=sub;
		Dpt=dpt;
		T_id=tid;
		
	
	
	}
	
	

	void display(){                                                              //methord fo display all data members of all classes

		System.out.println("\nName:"+super.Name+"\nGender:"+super.Gender+"\nAge:"+super.Age+"\nAddress:"+super.Address);
		System.out.println("\nEmp id:"+Empid+"\nCompany name:"+Company_name+"\nQualification:"+Qualification+"\nSalary:"+Salary);
		
		System.out.println("\nTearchers id:"+T_id+"\nDep:"+Dpt+"\nSub:"+Sub);
		

		

	}

}

class Main{                                                                                                 //Main class

	public static void main(String args[]){	                                                            //main methord
			Scanner obj=new Scanner(System.in);
			System.out.print("Enter the no.of Teacher:");
			int n=obj.nextInt();
			
			
			
			Teacher[] arr=new Teacher[n];                     // Allocating memory 
			
			for(int i=0;i<n;i++){
					System.out.println("\nEnter the details of TEACHER - "+(i+1)); //enterin the details of all data members using forloop
							System.out.println("______________________________");
					
					System.out.print("\nEnter name:");
					String name=obj.next();
					
					System.out.print("Enter Gender:");
					String gen=obj.next();
					
					System.out.print("Enter Age:");
					int age=obj.nextInt();
					
					System.out.print("Enter Address:");
					String ad=obj.next();
					    
					System.out.print("\nEnter emp id:");
					int id=obj.nextInt();
					
					System.out.print("Enter Company name:");
					String cname=obj.next();
					
					System.out.print("Enter Qualification:");
					String qu=obj.next();
					
					
					System.out.print("Enter emp salary:");
					double sal=obj.nextDouble();
					
					
					System.out.print("\nEnter tearchers id:");
					int t_id=obj.nextInt();
					

					
					System.out.print("Enter department:");
					String dep=obj.next();

					System.out.print("Enter Subject:");
					String sub=obj.next();

					
					arr[i]=new Teacher(gen,name,age,ad,id,cname,qu,sal,dep,sub,t_id); //calling constructor of Teacher 
					
					
					
					
			}

		for(int j=0;j<n;j++){ 
				System.out.println("Details of TEACHER=" +(j+1));

				arr[j].display();                                                   // calling display 

		}
		
		
	}
		
		
}

/** Enter the no.of Teacher:2

Enter the details of TEACHER - 1
______________________________

Enter name:raju
Enter Gender:male
Enter Age:34
Enter Address:puthanpurakkal

Enter emp id:23
Enter Company name:tata
Enter Qualification:mtech
Enter emp salary:230000

Enter tearchers id:65
Enter department:mba
Enter Subject:economics
-----------------------


Enter the details of TEACHER - 2
______________________________

Enter name:sheeba
Enter Gender:female
Enter Age:34
Enter Address:kaattuppara

Enter emp id:23
Enter Company name:bajaj
Enter Qualification:technical
Enter emp salary:20000

Enter tearchers id:56
Enter department:cs
Enter Subject:cs


Details of TEACHER=1

Name:raju
Gender:male
Age:34
Address:puthanpurakkal

Emp id:23
Company name:tata
Qualification:mtech
Salary:230000.0

Tearchers id:65
Dep:mba
Sub:economics

Details of TEACHER=2

Name:sheeba
Gender:female
Age:34
Address:kaattuppara

Emp id:23
Company name:bajaj
Qualification:technical
Salary:20000.0

Tearchers id:56
Dep:cs
Sub:cs
*/
