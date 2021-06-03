package prolim.phase1.day3;

import java.util.regex.Pattern;


public class Day3Assignment4 {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[a-zA-z0-9+_.]+@[a-zA-z0-9+_.]+\\Wcom", "firstname@prolim.com"));
        System.out.println(Pattern.matches("[a-zA-z0-9+_.]+@[a-zA-z0-9+_.]+\\Wcom", "viren@gmail.com"));
        System.out.println(Pattern.matches("[a-zA-z0-9+_.]+@[a-zA-z0-9+_.]+\\Wcom", "test123prepare@co.edu.com"));
        
        
    	System.out.println(Pattern.matches("[+]91\\d{10}", "+911234567890"));
    	System.out.println(Pattern.matches("[+]91\\d{10}", "91124567890"));
    	
    	System.out.println(Pattern.matches("^[A-Z][A-Za-z]*[0-9][A-Za-z]*[1-9][A-Za-z]*[0-9][A-Za-z]*", "F123jlsIOijsf"));
    	System.out.println(Pattern.matches("^[A-Z][A-Za-z]*[0-9][A-Za-z]*[1-9][A-Za-z]*[0-9][A-Za-z]*", "F123jlsIOi5d"));
    	
        
       
	}

}
