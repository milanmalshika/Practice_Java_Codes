class RunTimePolymorphism {
	public static void main(String []args) {
		Person p = new UniStudent();
		p.dress();

		p = new preStudent();
		p.dress();
	}	
}

class Person {
	public void dress() {
		System.out.println("Normally wear anything");
	}
}

class preStudent extends Person {
	public void dress() {
		System.out.println("Normally wear a short");
	}
}

class OLStudent extends Person {
	public void dress() {
		System.out.println("Normally wear a white trouser");
	}
}

class UniStudent extends Person {
	public void dress() {
		System.out.println("Normally wear a trouser");
	}
}