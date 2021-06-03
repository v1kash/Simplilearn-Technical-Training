package prolim.phase1.day3;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			//int ar[] = new int[4];
			//ar[5] = 9;
			int a = 6/0;
			int ar[] = new int[4];
			ar[5] = 9;
		}
		catch(Exception e){
			e.printStackTrace(); // thrown directly by jvm and gives complete description
			System.out.println(e.getMessage()); // thrown by jvm that we can access through exception e
			System.out.println("Can't divide by zero"); // user message
		}
		finally {
			System.out.println("Always");
		}

	}

}
