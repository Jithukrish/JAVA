/*7. Write a Java program to compare two hash set*/
import java.util.*;
public class hashs {
	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		                                            // use add() method to add values in the hash set
		set.add("arjun");
		set.add("gokul");
		set.add("Blue");
		set.add("lee");
		set.add("row");
		
		System.out.println(set);
		HashSet<String> set2=new HashSet<String>();
		set2.add("jack");
		set2.add("daniel");
		set2.add("Bruce");
		set2.add("lee");
		System.out.println(set2);
		                                     //comparison output in hash set
		for (String element : set){		
		                                     //System.out.print("Both HashSet contain  "+element+" ");
		System.out.print(set2.contains(element) ? "Both HashSet contain ": "Both HashSet not contain " );
		System.out.println(element);
		}
	}
}

/**

[gokul, Blue, row, lee, arjun]
[daniel, Bruce, lee, jack]
Both HashSet not contain gokul
Both HashSet not contain Blue
Both HashSet not contain row
Both HashSet contain lee
Both HashSet not contain arjun
**/
