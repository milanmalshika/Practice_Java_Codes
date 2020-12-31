class OverLoading {
	
	public static void main(String []args) {
		Methods m = new Methods();

		m.func();

		int x = m.func(10);
		System.out.println("With a parameter = " + x);

		int c = m.func(10,20);
		System.out.println("With two parameters = " + c);
	}

}

class Methods {
	
	public void func() {
		System.out.println("No parameters..");
	} 

	public int func(int x) {
		int y = x;

		return y;
	} 

	public int func(int x, int y) {
		int z = x+y;

		return z;		
	}

}