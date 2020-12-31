class CompilerTimePolymorphism {
	public static void main(String []args) {
		A a = new A();
	}

}

class A {
	public void add() {
		int z = 12+23;
		System.out.println(z);
	}

	public void add(int x, int y) {
		int z = x+y;
		System.out.println(z);
	}

	public void add(double a) {
		double z = a+23;
		System.out.println(z);
	}

	public void add(double x, double y) {
		double z = 12+23;
		System.out.println(z);
	}

}