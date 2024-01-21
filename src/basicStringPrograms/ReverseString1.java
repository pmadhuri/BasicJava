package basicStringPrograms;

public class ReverseString1 {

	public static void main(String[] args) {
		//1
		String s="madhuri";
		String rev=" ";
		int l=s.length();
		for(int i=l-1;i>=0;i--) {
			
			 rev=rev+s.charAt(i);
			
			
		}
		System.out.println(rev);

	}

}
