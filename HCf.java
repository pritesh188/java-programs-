package practice2;

public class HCf {
	
	public static void main (String args[]) {
		
		
		int x=2;
		int y=7;
		int hcf=0;
		for(int i=1;i<=x || i<=y;i++) {
			if((x%i==0)&&(y%i==0)) {
				hcf=i;
			}
			System.out.println(hcf);
		}
		
	}

}
