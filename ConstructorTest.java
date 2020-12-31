class ConstructorTest {
	public static void main(String []args) {
		A obj1 = new A(112);
		System.out.println("value of x is " + obj1.x);
		System.out.println("value of y is " + obj1.y);

		A obj2 = new A(110,220);
		System.out.println("value of x is " + obj2.x);
		System.out.println("value of y is " + obj2.y);

		// A obj3 = new A(); dn apita mehema constructor ekk create krgta nohaka 

		A obj3 = new A(12.3);
		obj3.test();

	}
	
}

class A {
	int x;
	int y;

	public A(double l) {
		//x = 12;
		//y = 13;
	}
	
	public A(int p) {
		this.x = p;
		this.y = 123;
	}

	public A(int p, int q) {
		this.x = p;
		this.y = q;
	}

	public void test() {
		System.out.println("x value is " + x);
		System.out.println("y value is " + y);
	} 
}