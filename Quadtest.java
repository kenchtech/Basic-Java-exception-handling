package com.exceptionhndl;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Quadtest {
	public static void main(String[] args) {
		System.out.print("The first equation \n");
		Scanner myScan = new Scanner(System.in);
		boolean anotherInput = true;
		do {
		try {
		System.out.print("Enter a ");
		double a = myScan.nextDouble();
		System.out.print("Enter b ");
		double b = myScan.nextDouble();
		System.out.print("Enter c ");
		double c = myScan.nextDouble();
		if (a==0) { //Checks if a = 0
			throw new IllegalArgumentException("Division by zero is not allowed");
		}
		Quad q1 = new Quad(a,b,c);
		q1.getPrint();
		anotherInput = false; //Exits loop after successful execution
	}
	catch  (InputMismatchException ex) {
		System.out.println("Enter numbers only !...try again.");
		myScan.nextLine();//clear the invalid input
	}
	catch (IllegalArgumentException ex) {
		System.out.println(ex.getMessage());
	}
	/*catch (ArrayIndexOutOfBoundsException ex) {
		System.out.println("Array error");
	}*/
	finally {
		System.out.println("\n Program ends.");
	}
		}
	while(anotherInput);
	}

}

