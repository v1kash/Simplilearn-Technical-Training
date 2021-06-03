package prolim.phase1.day1.p1;

public class M {
    
	private  int im = 10;
	long lm = 1000000000L;
	protected float fm = 100.0f;
	
	private void privateMethod() {
		 System.out.println("private method of M: "+im+" "+lm+" "+fm);
	}
	
  public void publicMethod() {
	  privateMethod();
	  System.out.println("public method of M: "+im+" "+lm+" "+fm);
	}

  protected void protectedMethod() {
	  System.out.println("protected method of M: "+im+" "+lm+" "+fm);
  }

  void defaultMethod() {
	  System.out.println("default method of M: "+im+" "+lm+" "+fm);
  }
	
}
