package practice;
import java.util.*;

import java.util.Scanner;

public class exception {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		try {
			System.out.println(n/0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
