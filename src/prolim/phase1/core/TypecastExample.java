package prolim.phase1.core;

public class TypecastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	  // int and long
		int i = 100;
		long l = 70000000000000L;
		System.out.println("long :"+ l);
		
		
		int o = (int)l;
		System.out.println("int :"+ o);
		
		char t = (char) i;
		System.out.println("char :"+ t);
		
		// double and float
		double d2 = 10009096765509.046543;
		long l2 = (long) d2;
		int i2 = (int) l2;
		System.out.println("Double "+d2);
		System.out.println("Long "+l2);
		System.out.println("int "+i2);
		
		// long and float
		char ch = 'd';
		int temp = ch;
		int with = (int) ch;
		System.out.println(" "+temp+" "+with);
		
		// typecasting long -> int -> double -> float
		long k = 560000000000L;
		int kint = (int) k;
		double kd = kint;
		float fd = (float) kd;
		
		System.out.println("long:"+k+" int:"+kint+" double:"+kd+" float:"+fd);
		
		
	}
	
	//public static void main(Integer[] args) {
		//
	//}

}
