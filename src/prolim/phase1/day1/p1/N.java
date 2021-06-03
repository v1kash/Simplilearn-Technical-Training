package prolim.phase1.day1.p1;

public class N {
    
	 protected long ln = -100000000L;
	 public int in = -10;
	 double dn = 1000.00;
	
	  
	  private void privateMethod() {
			 System.out.println("private method of N: "+in+" "+ln+" "+dn);
		}
		
	  public void publicMethod() {
		  privateMethod();
		  System.out.println("public method of N: "+in+" "+ln+" "+dn);
		}

	  protected void protectedMethod() {
		  System.out.println("protected method of N: "+in+" "+ln+" "+dn);
	  }

	  void defaultMethod() {
		  System.out.println("default method of N: "+in+" "+ln+" "+dn);
	  }

}
