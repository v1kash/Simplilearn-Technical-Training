package prolim.phase1.day2;

import java.util.LinkedHashSet;

public class SetExample {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet(); //object creation of linkedlistset generic
		
		lhs.add(3);
		lhs.add("Hello");
		lhs.add(4.5F);
		lhs.add(true);
		lhs.add('F');
		
		
		System.out.println("The LinkedHashSet is:"+lhs);
		
		LinkedHashSet<Integer> rhs = new LinkedHashSet<Integer>(); //only for integer type
		rhs.add(3);
	
		
		

	}

}
