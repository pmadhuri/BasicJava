package basicStringPrograms;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String s="@j*a#v@#a%";
		//o\p=java
		String plainText=s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(plainText);
		
		
		String s1="   @j*a#   v@#   a%";
		//o\p=java
		String plainText1=s1.trim();
		//String plainText1=s1.replaceAll("[\\s]", "");
		System.out.println(plainText1);

	}

}
