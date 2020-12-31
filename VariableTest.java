class VariableTest {
	public static void main(String []args) {
		Test t = new Test();

		Test.x = 123;

		t.print();		
	}

}

class Test {
	static int x;
	
	public void print() {
		System.out.println("Value of x is " + x);
	}

}