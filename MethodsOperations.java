class MethodsOperations {
	public static void main(String []args) {
		int z = sum(10,20);
		System.out.println("Sum of 10 and 20 is " + z);	

		System.out.println();

		A a = new A();
		int max = a.maxValue(10,20);
		System.out.println("The max value of 10 and 20 is " + max);	
	}

	public static int sum(int x, int y) {
		int val = x + y;
		return val;
	}
}

class A {
	public int maxValue (int x, int y) {
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
	}

}