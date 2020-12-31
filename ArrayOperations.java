class ArrayOperations {
	public static void main(String []args) {
		int[] myArray = new int[5]; 
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;
		myArray[4] = 50;

		arraySum(myArray);

	}

	public static void arraySum(int[] value) {
		int sum = 0;

		for(int i=0; i<5; i++) {
			sum = sum + value[i];
		}
		System.out.println(sum);
	}	

}