class AsterixPatternsSeven {
	public static void main(String []args) {
		for(int i=0; i<20; i+=2) {
			for(int j=0; j<20-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}	

}