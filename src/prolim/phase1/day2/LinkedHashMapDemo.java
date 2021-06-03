package prolim.phase1.day2;


import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> lhm = new LinkedHashMap<Integer,String>();
		
		lhm.put(1, new String("Samsung"));
		lhm.put(2, new String("Mi"));
		lhm.put(3, new String("Toshiba"));
		lhm.put(4, new String("HCL"));
		
		System.out.println("contents of LinkedHasMap: "+lhm);
		System.out.println("\nvalues of map after iterating over it: ");
		
		for(Integer key: lhm.keySet()) {
			System.out.println(key+":\t"+lhm.get(key));
		}
		
		System.out.println("The size of the linkedHashMap is: "+lhm.size());
		System.out.println("is empty ?: "+lhm.isEmpty());
		System.out.println("contains 2 as key? : "+lhm.containsKey(2));
		System.out.println("contains hcl as value?: "+lhm.containsValue("HCL"));
		
		

	}

}
