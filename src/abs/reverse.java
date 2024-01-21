package abs;

public class reverse {

	public static void main(String[] args) {
String V="";
String largest="";
//Hardships often prepare ordinary people for an extraordinary destiny
		String s = "ae iou s"; 
		s=s.replaceAll("[\\s]", "");
		int countV=0;
		int countC=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a'  || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				
				
			countV++;
				
				
			}
			else {
				
				
				countC++;
			}
			
			
		}
	
		System.out.println(countV);
		System.out.println(countC);
		}

	}


