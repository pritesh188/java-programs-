package practice;

public class UP {
	
	public static void main(String args[]) {
	String	str="Pritsj";
	StringBuilder res=new StringBuilder("");
	for(int i=0; i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='a' && ch<='z') {
			
			res.append((char)(ch-32));
		}
		else if (ch>='A'&& ch<='Z') {
			res.append((char)(ch+32));
			
		}
		else {
			res.append(ch);
		}
		
	}
	String
	ans=res.toString();
	System.out.println(ans);
	}
}
