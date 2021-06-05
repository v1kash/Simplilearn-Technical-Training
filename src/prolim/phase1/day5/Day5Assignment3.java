package prolim.phase1.day5;

class Customer{
	
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw.");
		
		if(this.amount<amount) {
			System.out.println("Less balance, waiting...");
			try {
				wait();
			}
			catch(Exception e) {}
		}
		this.amount-=amount;
		System.out.println("Withdraw completed, left over amount is :"+this.amount);
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Going to deposit.");
		this.amount+=amount;
		System.out.println("Deposited..."+this.amount);
		notify();
	}
}

public class Day5Assignment3 {
    
	
	public static void main(String[] args) {
		Customer c = new Customer();
		
		new Thread() {
			public void run() {
				c.withdraw(17000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(15000);
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				c.withdraw(2000);
			}
		}.start();

	}

}
