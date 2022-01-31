package Linecomparison_UC3;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Linecomparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
	       Scanner scan = new Scanner(System.in);
		DecimalFormat decform = new DecimalFormat("0.##");
		//Variable
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
	        int a1,b1,a2,b2;
		double Length1,Length2;
		double Length = 0;

		//input
		System.out.println("Enter X1 Coordinate");
		x1 = scan.nextInt();
		System.out.println("Enter Y1 Coordinate");
		y1 = scan.nextInt();
		System.out.println("Enter X2 Coordinate");
		x2 = scan.nextInt();
		System.out.println("Enter Y1 Coordinate");
		y2 = scan.nextInt();
	        System.out.println("Enter A1 Coordinate");
		a1 = scan.nextInt();
		System.out.println("Enter B1 Coordinate");
		b1 = scan.nextInt();
		System.out.println("Enter A2 Coordinate");
		a2 = scan.nextInt();
		System.out.println("Enter B2 Coordinate");
		b2 = scan.nextInt();
		Length1 = Math.sqrt(Math.pow(x2-x1, 2) + (Math.pow(y2-y1,  2)));
	        Length2 = Math.sqrt(Math.pow(a2-a1, 2) + (Math.pow(b2-b1, 2)));

		if (Length1 == Length2)
				System.out.println("Line is Equal");

		else
			    System.out.println("Line is Not Equal");
		scan.close();
		Length = Math.sqrt(Math.pow(x2-x1, 2) + (Math.pow(y2-y1,  2)));
		System.out.println("The Length is " + decform.format(Length));

	        int compareValue = Double.compare(Length1,Length2);
	        if (compareValue == 0)
	            System.out.println("line1 and lines are equal");
	        else if (compareValue < 0)
	            System.out.println("lines1 is less than lines2");
	        else
	            System.out.println("lines1 is greater than lines2");
	     }
	     }
