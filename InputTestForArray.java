import java.util.Scanner;

class InputTestForArray {
	public static void main(String []args) {
		ArrayClass obj = new ArrayClass();
		obj.arrayOperations();
	}
	
}

class ArrayClass {
	public void arrayOperations() {
		Scanner input = new Scanner(System.in);
		int[][] myArray = new int[2][3];

		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("Enter " + i + " , " + j + " value : ");
				myArray[i][j] = input.nextInt();
			}
		}

		System.out.println("Array printing.");

		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Enter " + i + " , " + j + " value : " + myArray[i][j]);
			}
		}
	}

}	

