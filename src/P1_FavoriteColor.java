import java.util.Scanner;

/*
ISYS 320
Name(s):Clayton Bruce
Date: 4/8/2018
*/

/*  What was the error?
 Using the == operator tests for reference equality as to where .equals() tests 
 to see if they are the same value!
  
 */

public class P1_FavoriteColor {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("What is your favorite color? ");
		String name = console.next();
		
		if( name.equals("blue")) {
			System.out.println("MINE TOO!");
		}else {
			System.out.println("Dont match");
		}

	}

}
