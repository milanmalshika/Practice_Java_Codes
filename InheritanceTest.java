class InheritanceTest {
	public static void main(String []args) {
		Triangle t1 = new Triangle(10,20);
		t1.area();
	}

}

class Poligon {
	int width = 12;
	int height = 14;
}

class Triangle extends Poligon {
	public Triangle(int x, int y) {
		this.width = x;
		this.height = y;
	}	

	public void area() {
		double a = 0.5*width*height;
		// System.out.println("Now width is " + width);
		// System.out.println("Now height is " + height);
		System.out.println("Area is " + a);
	}
}