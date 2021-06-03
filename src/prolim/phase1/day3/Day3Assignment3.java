package prolim.phase1.day3;

public class Day3Assignment3 {

	public static void main(String[] args) {
		
		int a[][] = {{5,4},{7,8}};
		int b[][] = {{10,20},{40,2}};
		
		int c[][] = new int[2][2];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
				c[i][j] = a[i][j] + b[i][j];
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}

	}

}
