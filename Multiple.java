package INhertance;

class byke {
	void ride() {
		System.out.println("bike rides");
	}
}

class hayabusa extends byke {
	void speed() {
		System.out.println("greater than normal bikes");
	}

}

class BNW extends hayabusa {
	void engine() {
		System.out.println("hayabusa best hai ,end of the discussion ");
	}
}

public class Multiple {

	public static void main(String[] args) {

		BNW d = new BNW();
		d.engine();
		d.speed();

		hayabusa h = new hayabusa();
		h.ride();
		h.speed();

//		hayabusa df=new hayabusa();
//		df.speed();

	}

}
