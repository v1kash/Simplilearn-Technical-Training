package prolim.phase1.day1.p2;
import prolim.phase1.day1.p1.M;
import prolim.phase1.day1.p1.N;

public class Y extends N{

	public static void main(String[] args) {
		M mRef = new M();
		N nRef = new N();
		X xRef = new X();
		Y yRef = new Y();
		
		System.out.println("Variables of X: "+xRef.xl+xRef.xf+xRef.xc);
      
		mRef.publicMethod();
		nRef.publicMethod();
		yRef.protectedMethod();

	}

}
