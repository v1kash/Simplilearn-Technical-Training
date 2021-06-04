package prolim.phase1.day4;

import java.util.*;

// We can use multiple exceptions as well by using comma separated exceptions

public class Day4Assignment1 {
     
	static void validate(int salary) throws SalaryException{
		if(salary<0)
			throw new SalaryException("Salary can not be negative");
		else if(salary<2000) throw new SalaryException("you need to work hard");
		else if(salary>2100 && salary<5000) throw new SalaryException("your salary is somehow good");
		else if(salary>5100 && salary<9000) throw new SalaryException("salary is very good");
		else throw new SalaryException("wrong salary");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		try {
			//validate(-2);
			validate(input);
		}
		catch(Exception m)
		{
			System.out.println("exception occured: "+m.getMessage());
		}
	}

}

class SalaryException extends Exception{
	SalaryException(String s){
		super(s);
	  }
	}
