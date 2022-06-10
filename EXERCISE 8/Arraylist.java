/** Maintain a list of Strings using ArrayList from collection framework, perform built-in operations **/



import java.util.*;
class Arraylist{
              public static void main(String args[]){
            Scanner sc=new Scanner(System.in);

           ArrayList<String> ARLST=new ArrayList<String>();

	System.out.println("intilise size of ARLST: "+ARLST.size());

      ARLST.add("car");
      ARLST.add("bike");
      ARLST.add("bus");
      ARLST.add("boat");
      ARLST.add("train");



             System.out.println("contents of ARLST: "+ARLST);
             System.out.println("\nAEROPLANE addes 0th index position\n");
             ARLST.add(0,"AEROPLANE");
             System.out.println("contents of ARLST: "+ARLST);
             System.out.println("\narray size after addition  " + ARLST.size());
             ARLST.remove("car");
             System.out.println("\ncontents  after removed car in ARLST :"+ARLST); 
		String s=ARLST.get(3);
		ARLST.remove(3);
		System.out.println("\ncontents  after removed "+s+" in ARLST :"+ARLST); 
	}
	
}
/** OUT PUT

intilise size of ARLST: 0

contents of ARLST: [car, bike, bus, boat, train]

AEROPLANE addes 0th index position

contents of ARLST: [AEROPLANE, car, bike, bus, boat, train]

array size after addition  6

contents  after removed car in ARLST :[AEROPLANE, bike, bus, boat, train]

contents  after removed boat in ARLST :[AEROPLANE, bike, bus, train]

**/






