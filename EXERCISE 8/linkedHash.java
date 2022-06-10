/*6. Program to demonstrate the creation of Set object using the LinkedHashset class*/
import java.util.*;
public class linkedHash {
	public static void main(String[] args) {
		LinkedHashSet <String> HS = new LinkedHashSet<String>();
		HS.add("maths");
		HS.add("chemistry");
		HS.add("physics");
		HS.add("biology");
		HS.add("geography");
		HS.add("history");
		System.out.println("Set = "+HS);

		Iterator<String> itr = HS.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}
		System.out.println();
}
}
/**

Set = [maths, chemistry, physics, biology, geography, history]
maths	chemistry	physics	biology	geography	history	
**/
