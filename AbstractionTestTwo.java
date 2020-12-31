class AbstractionTestTwo {
	public static void main(String []args) {
		Shape sh = new Triangle();
		sh.area(10,20);	

		sh = new Rectangle();
		sh.area(15,10);
	}
}

abstract class Shape {
	abstract void area(int x, int y);
}

class Rectangle extends Shape {
	public void area(int height, int width) {
		int ar = height*width;
		System.out.println("Rectangle area is " + ar);
	}
}

class Triangle extends Shape {
	public void area(int height, int width) {
		double ar = 0.5*height*width;
		int val = (int)ar;
		System.out.println("Triangle area is " + val);
	}
}