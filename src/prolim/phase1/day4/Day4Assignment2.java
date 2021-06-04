package prolim.phase1.day4;

abstract class MNC{
	
	public MNC() {}
	
	abstract void method1();
	
	abstract void method2();
	
	void normalMethod() {
		System.out.println("MNC Normal Method");
	}
}

abstract class Infosys extends MNC{
	
	void method1() {
		System.out.println("Method 1 implemented in Infosys");
	}
	
}

class Hello extends Infosys{
	void method1() {
		System.out.println("Method 1 implemented in Hello");
	}
	
	void method2() {
		System.out.println("Method 2 implemented");
	}
	
	void normalMethod2() {
		System.out.println("Hello normal method");
	}
}

public class Day4Assignment2 {

	public static void main(String[] args) {
		
		Infosys obj = new Hello();
		obj.method1();
		obj.method2();
		obj.normalMethod();
		
		Hello hobj = new Hello();
		hobj.method1();
		hobj.method2();
		hobj.normalMethod2();
		hobj.normalMethod();

	}

}
