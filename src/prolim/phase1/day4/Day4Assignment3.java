package prolim.phase1.day4;

abstract class Pen{
	abstract void write();
	abstract void refill();
}

class FountainPen extends Pen{
	
	void write() {
		System.out.println("Write ");
	}
	
	void refill() {
		System.out.println("Refill");
	}
	
	void  changeNib() {
		System.out.println("Nib change");
	}
}

class Monkey{
	void jump() {
		System.out.println("Jump");
	}
	
	void bite() {
		System.out.println("Bite");
	}
}


interface BasicAnimal{
	void eat();
	void sleep();
}


class Human extends Monkey implements BasicAnimal{
	public void eat() {
		System.out.println("Eat");
	}
	
	public void sleep() {
		System.out.println("Sleep");
	}
}

public class Day4Assignment3 {

	public static void main(String[] args) {
		
		FountainPen fp = new FountainPen();
		fp.write();
		fp.refill();
		fp.changeNib();
		
		Monkey m = new Human();
		m.jump();
		m.bite();
		
		BasicAnimal ba = new Human();
		ba.eat();
		ba.sleep();
		
  
	}

}
