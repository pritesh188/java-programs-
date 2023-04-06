package practice2;

import java.util.Scanner;

public class Reversethestring {
	public static void main(String args[]) {
		
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
		
	
	String str="1238575";
	String str1="";
	
	int d=str.length();
	for(int i=d-1;i>=0;i--) {
		str1=str1 + str.charAt(i);
	}
	System.out.println(str1);
	
	int asd= Integer.parseInt(str1);
	System.out.println(asd +1);
	
	
	}
}
