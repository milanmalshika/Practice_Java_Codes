class StaticMethodsTwo {
	public static void main(String []args) {
		A.print();

		A a = new A();
		a.display();
	}

}

class A {
	public static void print() {
		System.out.println("Call static method using class name.");
	}

	public static void display() {
		System.out.println("Call static method using created object");
	}

}