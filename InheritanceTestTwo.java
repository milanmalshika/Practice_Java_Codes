class InheritanceTestTwo {
	public static void main(String []args) {
		Triangle t1 = new Triangle();

		t1.print();
		t1.display();

		Poligon p1 = new Poligon();
		p1.print();
	}

}

class Poligon {
	int height = 10;
	int width = 30;

	public void print() {
		System.out.println("This is the super class.");
	}
}

class Triangle extends Poligon {
	public void display() {
		System.out.println("This is the sub class.");
	}

}