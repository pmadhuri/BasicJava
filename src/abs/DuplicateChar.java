package abs;

public class DuplicateChar {

	public static void main(String[] args) {
		String a="my name is madhuri";
		System.out.println(a);
		
		//StringBuilder sb=new StringBuilder();
	
		for(char ch='a';ch<='z';ch++) {
			int c=0;
		
			for(int i=0;i<a.length();i++) {
				
				if(ch==a.charAt(i)) {
					
					c++;
					
					
				}
				
				
			}
			if(c>1) {

				System.out.println(ch+"  "+c);
				
			
			
		}
		
		
	}
	}
}
