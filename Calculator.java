package SimpleCalculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		double total = 0;
		String cont = "y";
	    String add = "+";
	    String subtract = "-";
	    String multiply = "*";
	    String divide = "/";
	    String squareRoot = "sqroot";
		Scanner input = new Scanner(System.in);
		while(cont.equalsIgnoreCase("y")) {
			System.out.println(" Enter '+' for addition\n Enter '-' for subtraction\n Enter '*' for multiplication" + 
		"\n Enter '/' for division"+
		"\n Enter 'sqroot' for square root");
			String formatter = input.next();
			if(formatter.equals(add)) {
				System.out.print("Add how much? ");
				total += input.nextDouble();
				System.out.println(total);
				System.out.println("Do you want to continue? ");
				cont = input.next();
			}
			else if(formatter.equals(subtract)) {
				System.out.print("Subtract how much? ");
				total -= input.nextDouble();
				System.out.println(total);
				System.out.println("Do you want to continue? ");
				cont = input.next();
			}
			else if (formatter.equals(multiply)) {
				System.out.print("Multiply by how much? ");
				total *= input.nextDouble();
				System.out.println(total);
				System.out.println("Do you want to continue? ");
				cont = input.next();
			}
			else if (formatter.equals(divide)) {
				System.out.print("Divide by how much? ");
				total /= input.nextDouble();
				System.out.println(total);
				System.out.println("Do you want to continue? ");
				cont = input.next();
			}
			else if (formatter.equals(squareRoot)) {
				total = input.nextDouble();
				total = Math.sqrt(total);
				System.out.println(total);
			}
			else {
				System.err.println("Error, input not recognized");
				System.out.println("Do you want to continue? ");
				cont = input.next();
			}
		}
		
		System.out.println("the end");
		input.close();
		
	}
	
}
