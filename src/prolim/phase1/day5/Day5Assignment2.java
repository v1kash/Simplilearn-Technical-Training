package prolim.phase1.day5;

class MyThread extends Thread{
	public void run() {
	for(int i=0;i<10;i++)
		System.out.println("learning Java");
	}
}

class YourThread extends Thread{
	
   public void run() {
	for(int i=0;i<5;i++)
		System.out.println("We are into Phase1");
   }
}

public class Day5Assignment2 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		YourThread yt = new YourThread();
		
		mt.start();
		yt.start();
	}

}
