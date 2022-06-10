/** Program to remove all the elements from a linked list **/



import java.util.*;
class LinkList {
public static void main(String args[]) {
	LinkedList<String> Ll=new LinkedList<String>();
         


       Ll.add("ARJUN");
       Ll.add("ANEES");
       Ll.add("ATHUL");
       Ll.add("AJITH");
       Ll.add("DON");
       Ll.add("KUPPICHAN");
        Ll.add("AJAY");
       System.out.println("SIZE OF Ll BEFORE DELETION : "+ Ll.size());
       System.out.println("CONTENT OF Ll BEFORE DELETION : "+Ll);
       Ll.removeFirst();
       Ll.removeLast();
       System.out.println("ELEMENT REMOVE FIRST AND LAST : "+ Ll);
       Ll.clear();
       System.out.println("CONTENT OF Ll AFTER DELETION: " + Ll);
}
}
/** OUT PUT
SIZE OF Ll BEFORE DELETION : 7
CONTENT OF Ll BEFORE DELETION : [ARJUN, ANEES, ATHUL, AJITH, DON, KUPPICHAN, AJAY]
ELEMENT REMOVE FIRST AND LAST : [ANEES, ATHUL, AJITH, DON, KUPPICHAN]
CONTENT OF Ll AFTER DELETION: []
**/














