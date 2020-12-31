class StaticMethods {
	public static void main(String []args) {
		System.out.println();
		print();

		System.out.println();

		StaticMethods.display();
		System.out.println();

		StaticMethods st= new StaticMethods();
		st.seen(); 
	}
	
	public static void print() {
		System.out.println("Static method run within main class.");
	}

	public static void display() {
		System.out.println("Static method run using class name.");
	}

	public static void seen() {
		System.out.println("Static method run using object in class.");
	}
}