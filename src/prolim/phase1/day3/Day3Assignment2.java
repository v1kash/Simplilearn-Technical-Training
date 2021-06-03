package prolim.phase1.day3;

public class Day3Assignment2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome to ");
		sb.append("prolim");
		System.out.println(sb);
		
		sb.delete(1, 7);
		System.out.println(sb);
		
		System.out.println(sb.charAt(9));
		
		sb.replace(1, 5, "Phase1");
		System.out.println(sb);         // Final output

	}

}
