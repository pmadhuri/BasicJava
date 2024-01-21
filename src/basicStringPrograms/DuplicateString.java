package basicStringPrograms;

import java.util.ArrayList;
import java.util.List;

public class DuplicateString {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		String [] names= {"cv","cv","vb","vb","nm"};
		
		for(int i=0;i<names.length;i++) {
			
			for(int j=1;j<names.length;j++) {
				
				if(names[i]==names[j]) {
					if(!al.contains(names[i])) {
						
						al.add(names[i]);
					}}	}}
		
		
		
		System.out.println(al);
	}

}
