/*1. Program to demonstrate the working of Map interface by adding, changing and removing elements.*/


import java.util.*;
public class MAPINT {
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
		
		hm.remove("bat");
		
		System.out.println("bat removed:"+hm+"\n");
		
		double h= hm.get("football");
		hm.put("football",h+100.5);
		System.out.println("value of foot is changed : "+hm+"\n");
		
		
		Set<Map.Entry<String,Double>>set= hm.entrySet();
		for(Map.Entry<String,Double>i : set){
			System .out.println(i.getKey()+" : "+i.getValue());
		}
	}			
}
/** OUTPUT
Hashmap: {ball=75.5, bat=1250.0, football=500.0, stump=1000.0, boot=300.8, tennis=80.0}

bat removed:{ball=75.5, football=500.0, stump=1000.0, boot=300.8, tennis=80.0}

value of foot is changed : {ball=75.5, football=600.5, stump=1000.0, boot=300.8, tennis=80.0}

ball : 75.5
football : 600.5
stump : 1000.0
boot : 300.8
tennis : 80.0
**/
