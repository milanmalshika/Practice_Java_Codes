class AbstractionTest {
	public static void main(String []args) {
		B obj = new B();
		obj.sum(10,20);

		obj.print();
		obj.print(10,20);
	}
}

abstract class A {
	abstract void print();

	abstract void print(int x, int y);

	public void sum(int x, int y) {
		int z = x + y;
		System.out.println(z);
	}
}

class B extends A {
	public void print() {
		System.out.println("Abstraction is OK.");
	}

	public void print(int k, int l) {
		System.out.println("Hello Abstraction.");
	}
}