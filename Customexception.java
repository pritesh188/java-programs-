package practice2;


class status extends Exception{
	
}

public class Customexception {
	public static void main (String args[]) {
		try {
			throw new status();
			
		}
		catch(status e)
		{
			System.out.println("caught");
		}
	}

}
