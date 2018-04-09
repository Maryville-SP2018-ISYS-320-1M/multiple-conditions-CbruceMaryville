import java.util.Scanner;

/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/8/2018
*/

public class P4_ColorNamer {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Give me a r,g,b for red, green or blue ");
		String color = console.next();
		String color2;
		color2 = color.toUpperCase();
		
		if(color2.equals("R")) {
			System.out.println("Red");
		}else if (color2.equals("G")) {
			System.out.println("Green");
		}else if (color2.equals("B")) {
			System.out.println("Blue");
		}
		
		
	}

}
