package practice2;

public class Reversethedstring {
	public static void main (Reversethedstring args[]) {
		String sg="pritesh";
		String s1="";
		int s2=sg.length();
		for(int i=s2-1;i>=0;i--) {
			s1=s1+sg.charAt(i);
		}
		System.out.println(s1);
	}
	

}
