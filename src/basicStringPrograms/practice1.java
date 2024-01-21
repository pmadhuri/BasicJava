package basicStringPrograms;

public class practice1 {

	public static void main(String[] args) {
	String a="madhuri gurav";
	String rev=" ";

	String [] arr=a.split(" ");
	for( String word:arr) {
		
		String b="";
		for(int i=word.length()-1;i>=0;i--) {
			
			b=b+word.charAt(i);
			
			
			
			
		}
		rev=rev+b+" ";
		
		
	}
	System.out.println("reverse string:"+rev+" ");

	}}

