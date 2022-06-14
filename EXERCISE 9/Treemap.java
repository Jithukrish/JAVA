/*2. Program to Convert HashMap to TreeMap*/


import java.util.*;
public class Treemap {
	public static void main(String args[]){
		HashMap<String,Double>hm =new HashMap<String,Double>();
		
		//HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("bat",1250.0);
		hm.put("ball",75.5);
		hm.put("stump",1000.0);
		hm.put("football",500.0);
		hm.put("boot",300.8);
		hm.put("tennis",80.0);
		System.out.println("Hashmap: "+hm+"\n");				
		
		TreeMap<String,Double> tm =new TreeMap<>();
		tm.putAll(hm);
		System.out.println("Treemap: "+tm+"\n");				
	}
}
/** OUTPUT
Hashmap: {ball=75.5, bat=1250.0, football=500.0, stump=1000.0, boot=300.8, tennis=80.0}

Treemap: {ball=75.5, bat=1250.0, boot=300.8, football=500.0, stump=1000.0, tennis=80.0}
**/
