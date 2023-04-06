package practice2;

public class delnumfromstring {
	
	public static void main (delnumfromstring args[]) {
		String as="2989485dhofshohs";
		as=as.replaceAll("[0-9]", "");
		System.out.println(as);
	}

}
