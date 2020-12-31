class AsterixPatternsFive {
	public static void main(String []args) {

		//pattern five
		Pattern p1 = new Pattern();
		p1.drawOne();

		System.out.println();
		System.out.println();

		//pattern six
		p1.drawTwo();
		
	}
}

class Pattern {
	public void drawOne() {
		System.out.println("pattern five");
		for(int i=0; i<10; i++){
			for(int k=0; k<10-i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}

	public void drawTwo() {
		System.out.println("pattern six");
		for(int i=0; i<10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<10-i; k++) {
				System.out.print("* ");
			}
			
		System.out.println();
		}
	}

}

