package map;

import java.util.HashMap;
import java.util.Iterator;

public class LmsIterator {
	public static void main(String[] args) {
		HashMap<Integer,String>lms=new HashMap<>();
		lms.put(794,"dhurga");
		lms.put(801,"karthik");
		lms.put(812,"raj");
		lms.put(823,"muthu");
		lms.put(534,"ravi");
		lms.remove(801);
		/*Iterator<Integer>ite=lms.keySet().iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}*/
		Iterator<String>ite1=lms.values().iterator();
		while(ite1.hasNext()) {
			if(ite1.next().equalsIgnoreCase("muthu")) {
			ite1.remove();
			}
		}
	System.out.println(lms);
			
		
	}
}
