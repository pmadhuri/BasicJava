package basicStringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RplaceCharWithItsOccurance {

	public static void main(String[] args) {
		
	abc("ttt");
	abc("mmaaddhhhjik");
	System.out.println(RplaceCharWithItsOccurance.abc("ert"));
	}
	
	
	
	//
	public static Map<Character, Integer> abc(String name) {
		String input="ABACDBEED";
Map<Character, Integer> map=new HashMap<>();
for(int i=0;i<name.length();i++) {
	char ch=name.charAt(i);
	if(map.containsKey(ch))
		map.put(ch, map.get(ch)+1);
	else {
		map.put(ch, 1);
		
	}
	
}
System.out.println(name+"  "+map);
return map;

		}

}
