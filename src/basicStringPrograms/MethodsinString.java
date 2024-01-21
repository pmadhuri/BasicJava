package basicStringPrograms;

public class MethodsinString {

	public static void main(String[] args) {
		/***
		 * 
		 * 1
		 * 
		 */
		// Ex of String is immutable 
		String s="madhuri";
		s.concat("gurav");
		System.out.println(s);
		/***
		 * 
		 * 2
		 * 
		 */
		String s1="madhuri";
		s1=s1.concat(" "+"gurav");
		System.out.println(s1);
		
	}

}
