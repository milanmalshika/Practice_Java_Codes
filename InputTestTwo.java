import java.util.Scanner;

class InputTestTwo {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for method calling : ");
		int num = input.nextInt();

		MyClass obj = new MyClass();
		obj.userDetails(num);		
	}

}

class MyClass {
	public void userDetails(int x) {
		Scanner ui = new Scanner(System.in);
		Scanner inti = new Scanner(System.in);
		int id;
		String name;
		int age;
		
		System.out.print("Enter your id : ");
		id = inti.nextInt();
		System.out.print("Enter your name : ");
		name = ui.nextLine();
		System.out.print("Enter your age : ");
		age = inti.nextInt();

		System.out.println("Hello "+ name);
		System.out.println("Your id number is "+ id);
		System.out.println("Your age is "+ age);
	}

}