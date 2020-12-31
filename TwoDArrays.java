class TwoDArrays {
	public static void main(String []args) {
		// int[][] myArray = new int[3][4];

		int[][] myArray = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

		System.out.println("Dimensional array.");

		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}

		int[][] myArrayOne = {{1,2,3,4}, {5,6,7,8}};
		int[][] myArrayTwo = {{1,2,3,4}, {5,6,7,8}};

		int numb = sum(myArray);
		System.out.println("Sum of array is " + numb);

		System.out.println("Add two 2d arrays => ");
		TwoDArrays f = new TwoDArrays();
		f.add(myArrayOne, myArrayTwo);

		int[][] fArray = {{1,2,3,4}, {4,5,6,7}};
		int[][] sArray = {{1,2,3}, {4,5,6}, {6,7,8}, {9,1,2}};

		multiplication(fArray, sArray);
	}

	public static int sum(int[][] values) {
		int sum = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				sum = sum + values[i][j];
			}
		}
		return sum;
	}

	public void add(int[][] arrayOne, int[][] arrayTwo) {
		int[][] arraySum = new int[2][4];

		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				arraySum[i][j] = arrayOne[i][j] + arrayTwo[i][j];
			}
		}

		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(arraySum[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void multiplication(int[][] arrayOne, int[][] arrayTwo) {
		int[][] arrayMul = new int[2][4];

		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<4; k++) {
					arrayMul[i][j]	= arrayMul[i][j] + arrayOne[i][k]*arrayTwo[k][j];		
				}				
			}
		}

		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(arrayMul[i][j] + " ");
			}
			System.out.println();
		}
	}
}