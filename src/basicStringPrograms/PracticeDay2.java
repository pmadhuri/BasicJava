package basicStringPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PracticeDay2 {
//***************Duplicate Character Remove 4 ways***************
	public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();
	String a="auijbcd";
	char temp;
char [] ch=a.toCharArray();
for(int i=0;i<ch.length;i++) {
	for(int j=i+1;j<ch.length;j++) {
		
		if(ch[i]>ch[j]) {
			
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
	
	}
	
}
System.out.println(new String(ch));

	}

}
