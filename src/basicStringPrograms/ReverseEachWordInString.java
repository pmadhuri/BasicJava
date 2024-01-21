package basicStringPrograms;

public class ReverseEachWordInString {
//1
	public static void main(String[] args) {
		System.out.println(revWordinString("madhu ri gurav hi"));

	}

	
	
	//2
	public static String revWordinString(String string1) {
		String words[]=string1.split("\\s");
		String revword=" ";
		for(String w:words) {
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			revword+=sb.toString()+" ";
				}
		return revword.trim();
	}

}
