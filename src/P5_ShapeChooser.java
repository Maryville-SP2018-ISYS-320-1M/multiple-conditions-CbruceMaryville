import java.util.Scanner;

/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/8/2018
*/

public class P5_ShapeChooser {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Give me tri for triangle or box for a box ");
		String shape = console.next();
		
		if(shape.equals("tri")) {
			drawTri();
		}else if (shape.equals("box")) {
			drawBox();
		}else 
		{
			System.out.println("Error in input!");
		}

		
		
		
		

	}
	
	private static void drawBox() {
		for( int row = 1; row <=5; row++ ) {
			for( int col = 1; col <=9; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void drawTri() {
		for( int row = 1; row <=5; row++ ) {
			for( int col = 1; col <= 5 - row; col++) {
				System.out.print(" ");
			}
			
			for( int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
