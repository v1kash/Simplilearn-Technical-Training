package prolim.phase1.day1.p1;

public class P {

	public static void main(String[] args) {
		M mRef = new M();
		N nRef = new N();
	  // System.out.println("M :"+mRef.lm+" "+mRef.fm);
	  // System.out.println("N :"+nRef.ln+" "+nRef.in+" "+nRef.dn);
		
		mRef.publicMethod();
		mRef.protectedMethod();
		mRef.defaultMethod();
		
		nRef.publicMethod();
		nRef.protectedMethod();
		nRef.defaultMethod();
		
	}

}
