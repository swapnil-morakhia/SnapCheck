//This is Encryption Assessment from SnapCheck for internship 2020
//Author: Swapnil Morakhia
//Position: Software engineer intern

//package practice;

public class SnapCheck {
	

	public static String encryption(String s) {
		int l = s.length();
		if(l<=2) return s;
		double sqrt = Math.sqrt(l);
		int row = (int)sqrt;
		int column = row+1;
		if(row*row == l) {
			column = row;
		}
		
		if (row * column <  l) {
			row+=1;
		}
		String str = "";
		String res;
		for(int x=0;x<column;  x++) {
			res="";
			for (int i=x;i<l; i+=column) {
				char ch = s.charAt(i);
				res += ch;
			}
			str+=res;
			if(row>1) {
				str+=" ";
			}
		}
		return str.toString().strip();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Enter your string below		
		System.out.println(encryption("feedthedog"));
		
	}

}
