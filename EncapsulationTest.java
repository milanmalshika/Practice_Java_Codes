import java.util.Scanner;

class EncapsulationTest {
	public static void main(String []args) {

		Scanner inputStr = new Scanner(System.in);
		Scanner inputIn = new Scanner(System.in);
		Test t = new Test();

		System.out.print("Enter your name = ");
		String uname = inputStr.nextLine();	

		System.out.print("Enter your age = ");
		int uage = inputIn.nextInt();
		
		t.setName(uname);
		t.setAge(uage);
		
		System.out.println("User Details");
		String name = t.getName();
		System.out.println("Username is " + name);
		int age = t.getAge();
		System.out.println("User age is " + age);

	}
}

class Test {
	private int age;
	private String name;

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
}

