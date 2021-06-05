package prolim.phase1.day5;


class thrd extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" State : "+Thread.currentThread().getState());
		System.out.println(Thread.currentThread().getName()+" is alive? : "+Thread.currentThread().isAlive());
		System.out.println(Thread.currentThread().getName()+" ID : "+Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName()+" is Daemon? : "+Thread.currentThread().isDaemon());
	}
}


public class Day5Assignment1 {

	public static void main(String[] args) {
		thrd t1 = new thrd();
		thrd t2 = new thrd();
		thrd t3 = new thrd();
		thrd t4 = new thrd();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t4.setName("Thread 4");
		
		t1.setPriority(Thread.MIN_PRIORITY);  //t1.setPriority(1)
		t2.setPriority(Thread.MIN_PRIORITY);  //t2.setPriotiy(1)
		t3.setPriority(Thread.NORM_PRIORITY); //t3.setPriority(5)
		t4.setPriority(Thread.MAX_PRIORITY);  //t4.setPriority(10)
			
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	

	}

}
