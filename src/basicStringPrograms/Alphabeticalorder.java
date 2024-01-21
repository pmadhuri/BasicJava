package basicStringPrograms;

public class Alphabeticalorder {

	public static void main(String[] args) {
		String a="maacccvvvbbbb";
		
		
		for(char ch='a';ch<='z';ch++) {
			int c=0;
			for(int j=0;j<a.length();j++) {
				
				if(ch==a.charAt(j)) {
						c++;
				
				}
			}
			if(c!=0) {
				System.out.println(ch+"  "+c);
				
			}
			
				
			}
		

	}

}
