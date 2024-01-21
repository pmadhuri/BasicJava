package basicStringPrograms;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FrequecyofcharinString {
public static void main(String[] args) {
	String name="madhuriguravu";
	Map<Character, Integer> charmap=new HashMap<>();
	
	char ch[]=name.toCharArray();
	
	
	
	for(char c:ch) {
		
	         	if(charmap.containsKey(c)) {
			    charmap.put(c, charmap.get(c)+1);
		
		        }else {
			    charmap.put(c, 1);
			      }
	}
	
	
	
	
	
	System.out.println(name+" "+charmap);
}
}
