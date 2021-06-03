package prolim.phase1.day2;
import java.util.*;

public class Day2Assignment1 {

	public static void main(String[] args) {
		
		LinkedHashSet lhs_generic = new LinkedHashSet();
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
	

		lhs_generic.add(10);
		lhs_generic.add(5);
		lhs_generic.add(25.5);
		lhs_generic.add(12.4);
		lhs_generic.add(true);
		lhs_generic.add('a');
		lhs_generic.add('b');
		
		
		Scanner sc = new Scanner(System.in);
		int i1,i2,i3,i4,i5, i6, i7, i8;
		
		i1 = sc.nextInt();
		i2 = sc.nextInt();
		i3 = sc.nextInt();
		i4 = sc.nextInt();
		i5 = sc.nextInt();
		i6 = sc.nextInt();
		i7 = sc.nextInt();
		i8 = sc.nextInt();
		
		lhs.add(i1);
		lhs.add(i2);
		lhs.add(i3);
		lhs.add(i4);
		lhs.add(i5);
		lhs.add(i6);
		lhs.add(i7);
		lhs.add(i8);
		
		System.out.println("generic :"+lhs_generic);
		System.out.println("Integer lhs: "+lhs);
		
		TreeSet ts = new TreeSet();
		ts.add("C++");
		ts.add("Java");
		ts.add("Python");
		ts.add("C");
		ts.add("Js");
		ts.add("C#");
		
		System.out.println("Initial Treeset: "+ts);
		
		ts.remove("c++");
		ts.remove("c#");
		ts.remove("python");
		
		ts.add("python");
		ts.add("kotlin");
		ts.add("C++");
		
		System.out.println("Treeset after removing 3 and adding 3: "+ts);
		
		System.out.println(ts.contains("Java"));
		ts.clear();
		System.out.println("Final TreeSet "+ts);

	}

}
