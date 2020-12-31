class MethodOverriding {
	public static void main(String []args) {
		Triangle t1 = new Triangle();
		t1.print(); 

		// Poligon p1 = new Poligon();
		// p1.print();
	}

}

class Poligon {
	int width = 10;
	int height = 20;

	public void print() {
		System.out.println("This is the super class print method.");
	}
 
}

class Triangle extends Poligon {
	public void print() {
		System.out.println("This is the sub class print method.");
		super.print();  // meya deemen super class eke method eka call wei...
	}

}