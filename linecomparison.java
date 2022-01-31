package Linecomparisson_UC4;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Double;
public class Linecomparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");

		//Length calculation
		    Scanner scan = new Scanner(System.in);
			DecimalFormat decform = new DecimalFormat("0.##");

		    //Variable
			int x1 = 0;
			int y1 = 0;
			int x2 = 0;
			int y2 = 0;
		        int a1,b1,a2,b2;
			double length1,length2;
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

			length1 = Math.sqrt(Math.pow(x2-x1, 2) + (Math.pow(y2-y1,  2)));
		        length2 = Math.sqrt(Math.pow(a2-a1, 2) + (Math.pow(b2-b1, 2)));

		//Check When Two lines are equal
			 if (length1 == length2)
				    System.out.println("Line is Equal");
			 else
				    System.out.println("Line is Not Equal");
			 scan.close();
			 Length = Math.sqrt(Math.pow(x2-x1, 2) + (Math.pow(y2-y1,  2)));
			 System.out.println("The Length is " + decform.format(Length));

		//Compare Two Line Using Operators
		         System.out.println(length1 + " == " + length2 + ": " + (length1 == length2));
		    	 System.out.println(length1 + " < " + length2 + ": " + (length1 < length2));
		    	 System.out.println(length1 + " > " + length2 + ": " + (length1 > length2));

		//Compare Two Lines Using equals and compareTo methods
		         Double obj1 = length1;
			     Double obj2 = length2;
		         System.out.println("obj1 and obj2 equal? " + obj1.equals(obj2));

		         System.out.println(obj1.compareTo(obj2));//0-equal,1-length1>length2,-1-length2>length1;
		}
		}
