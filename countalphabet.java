package practice2;

import practice.ifelse;

public class countalphabet {
	public static void main(String args[]) {
	String str="aabbccdd";
	int count[]=new int[256];
	for(int i=0;i<str.length();i++) {
		count[(int)str.charAt(i)]++;
	}
	for(int i=0;i<256;i++) {
		if(count[i]!=0) {
			System.out.println((char)i +" "+count[i]);
		}
	}
	
	}
	

}
