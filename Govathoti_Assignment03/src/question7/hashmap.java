package question7;

import java.util.HashMap;
import java.util.Map;
public class hashmap {
	public static void main(String[] args) {
		Map<String,Integer> vishal = new HashMap<String,Integer>();
		vishal.put("Neha", 33);
		vishal.put("teju", 65);
		vishal.put("raja rao", 10);
		vishal.put("munikumari", 56);
		vishal.put(null, null);
		System.out.print("Elements in Hashtable are:\n " + vishal.entrySet());
		System.out.println(vishal.get("Neha"));
		System.out.println(vishal.get("teju"));
	}
}
