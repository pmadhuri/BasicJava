package basicStringPrograms;

import java.util.HashMap;
import java.util.Map;

public class Pr  {

	public static void main(String[] args) {
		System.out.println(getCharCount("madhurigurav"));

	}

	private static Map<Character, Integer> getCharCount(String s) {
		String name=s;
		Map<Character, Integer> charmap=new HashMap<>();
		
		char ch[]=name.toCharArray();
		
		
		
		for(char c:ch) {
			
		         	if(charmap.containsKey(c)) {
				    charmap.put(c, charmap.get(c)+1);
			
			        }else {
				    charmap.put(c, 1);
				      }
		}
		
		return(charmap);
	}

}
