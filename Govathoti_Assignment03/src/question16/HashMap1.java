package question16;

import java.util.HashMap;
import java.util.Map;
public class HashMap1 {
	public static void main(String[] args) {
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		m1.put("vishal", 47);
		m1.put("govathoti", 443);
		m1.put("tenali", 12);
		m1.put("guntur", 26);
		m1.put(null, null);
		System.out.print("Elements in Hashtable are:\n " + m1.entrySet());
		System.out.println(m1.get("vishal"));
		System.out.println(m1.get("govathoti"));
	}
}
