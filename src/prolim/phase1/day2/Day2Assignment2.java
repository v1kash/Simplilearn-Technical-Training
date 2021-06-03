package prolim.phase1.day2;

import java.util.Iterator;
import java.util.LinkedList;

public class Day2Assignment2 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("January");
		ll.add("February");
		ll.add("March");
		ll.add("April");
		
		Iterator<String> itr1 = ll.iterator();
		System.out.println(ll.size());
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		ll.add("September");
		ll.add("October");
		System.out.println(ll.size());
		
		Iterator<String> itr2 = ll.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		ll.add(4,"May");
		ll.add(5,"June");
		ll.add(6,"July");
		ll.add(7,"August");
		System.out.println(ll.size());
		Iterator<String> itr3 = ll.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
		ll.addLast("November");
		ll.addLast("December");
		Iterator<String> itr4 = ll.iterator();
		while(itr4.hasNext()) {
			System.out.println(itr4.next());
		}
		
		System.out.println(ll);

	}

}
