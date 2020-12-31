class CastingTest {
	public static void main(String []args) {
		A a = new B();

		a.print();
	}
}

class A {
	public void print() {
		System.out.println("This is the super class.");
	}
}	

class B extends A {
	public void print() {
		System.out.println("This is the sub class.");
	}
}