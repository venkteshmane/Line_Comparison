package Linecomparison_UC1;
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

		scan.close();
		Length = Math.sqrt(Math.pow(x2-x1, 2) + (Math.pow(y2-y1,  2)));
		System.out.println("The Length is " + decform.format(Length));
	}
	}
