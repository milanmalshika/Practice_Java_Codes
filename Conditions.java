class Conditions {

	public static void main(String []args) {
		TestIf test = new TestIf();

		test.trueIf(); 
	}

}

class TestIf {
	public void trueIf() {
		int x =12;
		if(x<10) {
			System.out.println("x is less than to 10.");
		}
		else if(x==12) {
			System.out.println("x is equal to 10");
		}
		else {
			System.out.println("x is less than to 10.");
		}
	}

}