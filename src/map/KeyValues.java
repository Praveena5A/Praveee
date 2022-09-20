package map;

import java.util.HashMap;

public class KeyValues {
	public static void main(String[] args) {
		HashMap<Integer,String>lms=new HashMap<>();
		lms.put(794,"dhurga");
		lms.put(801,"karthik");
		lms.put(812,"raj");
		lms.put(823,"muthu");
		lms.put(534,"ravi");
		lms.remove(801);
		/*for(Integer m:lms.keySet()) {
			System.out.println(m);
		}*/
		/*for(String x:lms.values()) {
			System.out.println(x);
		}*/
		lms.forEach((a,b)->System.out.println(a+" "+b));

}
}
