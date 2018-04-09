import java.util.Scanner;

/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/8/2018
*/

public class P6_Quadrant {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Give me your first number ");
		int num1 = console.nextInt();
		
		System.out.print("Give me your second number ");
		int num2 = console.nextInt();
		
		
		if(num1 > 0 && num2 >0 ) {
			System.out.println("This is in Q1");
		}else if(num1 < 0 && num2 >0) {
			System.out.println("This is in Q2");

		}else if(num1 < 0 && num2 <0) {
			System.out.println("This is in Q3");
		}else if(num1 > 0 && num2 <0) {
			System.out.println("This is in Q4");
		}

		
		
	}

}
