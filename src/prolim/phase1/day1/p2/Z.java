package prolim.phase1.day1.p2;
import prolim.phase1.day1.p1.M;
import prolim.phase1.day1.p1.N;

public class Z extends M{

	public static void main(String[] args) {
		M mRef = new M();
		N nRef = new N();
		X xRef = new X();
		Z zRef = new Z();
		
		System.out.println("variables of X: "+xRef.xl+" "+xRef.xf+" "+xRef.xc);
		
		mRef.publicMethod();
		zRef.protectedMethod();
		nRef.publicMethod();

	}

}
