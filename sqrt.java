package INhertance;


public class sqrt {
	
	public static void main (String args[]) {
	
	int a=2;
	int b=5;
	int c=3;
	Double root1,root2;
	
	
	
	double determinant=b*b-4*a*c ;
	
	  root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);
      
      System.out.println(root1);
      System.out.println(root2);
    }
	
			

}
