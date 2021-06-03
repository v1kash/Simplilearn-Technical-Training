package prolim.phase1.day3;

public class Day3Assignment1 {

	public static void main(String[] args) {
		String t= "Delhi";   // sp(1)
		String o = "Mumbai"; // sp(1)
		String k= "delhi";   // sp(1)
		String y= new String ("Mumbai");   // heap(1) 
		String l= new String ("delhi");   // heap(1)
		String p = new String("Hello");   // heap(1) + sp(1) 
		
		
		System.out.println("o equals l: "+o.equals(l));
		System.out.println("y equals p: "+y.equals(p));
		System.out.println("t equals o: "+t.equals(o));
		System.out.println("k equals y: "+k.equals(y));
		System.out.println("p equals y: "+p.equals(y));
		
			
         // 3 objects created on heap
		 // 4 literals in sp
		
		String b = "delhi";
		
		System.out.println("o == l: "+(o==l));
		System.out.println("y == p: "+(y==p));
		System.out.println("t == o: "+(t==o));
		System.out.println("k == y: "+(k==y));
		System.out.println("p == y: "+(p==y));
		System.out.println("b == k: "+(b==k));
	}

}
