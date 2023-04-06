package INhertance;

class food {
		void eat() {
			System.out.println("eating");
		}
}
class rasmalai extends food{
	void sweet() {
		System.out.println("rasmali supemacy");
		
	}
}
class pizza extends food{
	void chinese() {
		System.out.println("junk");
	}
}






public class Hierchical {

	public static void main(String[] args) {
		
		pizza a=new pizza();
		a.chinese();
		a.eat();
		// TODO Auto-generated method stub

	}

}
