import java.util.Scanner;

class InputTest {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);

		int age;
		int idno;

		System.out.print("Enter your age = ");
		age = input.nextInt();
		System.out.print("Enter your id number = ");
		idno = input.nextInt();

		System.out.println("Your age is " + age + " and id number is " + idno);
	}	

}