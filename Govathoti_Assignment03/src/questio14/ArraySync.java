package questio14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArraySync {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String>();
		l.add("vishal");
		l.add("govathoti");
		l.add("Tenali");
		l = Collections.synchronizedList(l);
		synchronized(l) {
			Iterator<String> itr = l.listIterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}
}
