/** Write a program has classes Publisher, Book, Literature and Fiction. Read the
information and print the details of books from either the category, using
inheritance
Class Publisher- Attribute PublisherName, Method display()
Class Book subclass of Publisher- Attribute- Title, Author, Method display()
Class Literature subclass of Book-Attribute-type, Method display()
Class Fiction subclass of Book-Attribute-genre, Method displaimport java.util */

class Publisher{
	String pub_name;

	Publisher(String pname){
		pub_name=pname;

	}
	void display(){
		System.out.println("Pub_name :"+pub_name);
	} 
	

}

class Book extends Publisher {
	String title;
	String Author;

	Book(String pnm,String title,String author){
		super(pnm);
		title=title;
		Author=author;
		
	}
	void display(){
		super.display();
		System.out.println("Title :"+title+"\nAuthor:"+Author);
	} 

	

}

class Literature extends Book{
	String type;
	Literature(String pnm,String title,String author,String typ){
		super(pnm,title,author);
		type=typ;

	}
	void display(){
		super.display();
		System.out.println("Type :"+type);
	} 
	

}

class Fiction  extends Book{
	
	String genre;

	Fiction(String pnm,String title,String author,String gen){
		super(pnm,title,author);
		genre=gen;
	
	}
	void display(){
		super.display();
		System.out.println("Genre :"+genre);
	} 

}


class Main {
	public static void main(String ar[]){

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of  books:");
		int ln=sc.nextInt();
		Literature [] arr= new Literature[ln];
		
		System.out.println("Enter details of books:");
		for(int i=0;i<ln;i++){
			System.out.print("Book-"+(i+1));	
			System.out.print("\nEnter Pub_name:");
			String pnm=sc.next();
			
			System.out.print("\nEnter Title:");
			String title=sc.next();
			
			System.out.print("\nEnter Author:");
			String author=sc.next();

			System.out.print("\nEnter Type:");
			String typ=sc.next();

			arr[i] =new Literature(pnm,title,author,typ);
	

		}

		
		System.out.println("\n---------------------");





		System.out.print("Enter the number of Fiction books:");
		int fn=sc.nextInt();
		Fiction [] arr1= new Fiction[fn];
		
		System.out.println("Enter details of Fiction books:");
		for(int i=0;i<ln;i++){
			System.out.print("Book-"+(i+1));	
			System.out.print("\nEnter Pub_name:");
			String pnm=sc.next();
			
			System.out.print("\nEnter Title:");
			String title=sc.next();
			
			System.out.print("\nEnter Author:");
			String author=sc.next();

			System.out.print("\nEnter Gener:");
			String gn=sc.next();

			arr1[i] =new Fiction(pnm,title,author,gn);
	

		}

		do{
					System.out.println("\n1.litratuere \n2.Fiction \n3.exit");
					System.out.println("Select your option: ");
					int opt =sc.nextInt();
					
					System.out.println("-----------------------\n");
					
					switch(opt){
						case 1:System.out.println("litratuere books\n");
							   for(int i=0;i<ln;i++)
								{
									System.out.println("BOOK "+(i+1));
									arr[i].display();

								}
							   
								break;
						case 2:System.out.println("Fiction books\n");
								for(int i=0;i<ln;i++)
								{
									System.out.println("BOOK "+(i+1));
									arr1[i].display();

								}
								break;
						default: System.out.println("Exiting....");
								System.exit(0);
								break;
								
					
					
					}
					
					
			
			
			
			}while(true);






	}


}
/**Enter the number of  books:1
Enter details of books:
Book-1
Enter Pub_name:jk

Enter Title:harrypotter

Enter Author:jk

Enter Type:story

---------------------
Enter the number of Fiction books:1
Enter details of Fiction books:
Book-1
Enter Pub_name:alche 

Enter Title:beyond the darkness

Enter Author:
Enter Gener:
1.litratuere 
2.Fiction 
3.exit
Select your option: 
1
-----------------------

litratuere books

BOOK 1
Pub_name :jk
Title :null
Author:jk
Type :story

1.litratuere 
2.Fiction 
3.exit
Select your option: 
2
-----------------------

Fiction books

BOOK 1
Pub_name :alche
Title :null
Author:the
Genre :darkness

1.litratuere 
2.Fiction 
3.exit
Select your option: 
3
-----------------------

Exiting....
**/


